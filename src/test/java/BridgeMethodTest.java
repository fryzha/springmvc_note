import org.springframework.core.BridgeMethodResolver;
import org.springframework.core.annotation.*;
import org.springframework.util.*;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.*;
import java.util.*;

/**
 * @author Neo
 * @date 2020/8/20 23:05
 */
public class BridgeMethodTest {
    public BridgeMethodTest() {
    }

    public static Boolean hasInitBinder(Method method){
        Boolean b = AnnotationUtils.findAnnotation(method, InitBinder.class) != null;
        return b == Boolean.TRUE ? b : null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        final Map<Method, Boolean> methodMap = new LinkedHashMap<Method, Boolean>();
        Set<Class<?>> handlerTypes = new LinkedHashSet<Class<?>>();
        Class<?> specificHandlerType = null;
        Class<?> targetType = C.class;

        if (!Proxy.isProxyClass(targetType)) {
            handlerTypes.add(targetType);
            specificHandlerType = targetType;
        }
        handlerTypes.addAll(Arrays.asList(targetType.getInterfaces()));

        for (Class<?> currentHandlerType : handlerTypes)
        {
            final Class<?> targetClass = (specificHandlerType != null ? specificHandlerType : currentHandlerType);

            ReflectionUtils.doWithMethods(currentHandlerType, new ReflectionUtils.MethodCallback() {
                @Override
                public void doWith(Method method) {
                    Method specificMethod = ClassUtils.getMostSpecificMethod(method, targetClass);
                    Boolean result = hasInitBinder(specificMethod);
                    if (result != null)
                    {
                        Method bridgedMethod = BridgeMethodResolver.findBridgedMethod(specificMethod);
                        if (bridgedMethod == specificMethod || hasInitBinder(bridgedMethod) == null)
                        {
                            methodMap.put(specificMethod, result);
                        }
                    }
                }
            }, ReflectionUtils.USER_DECLARED_METHODS);
        }

        return;
    }

    interface IA{
        @InitBinder
        public void d();

        @InitBinder
        public void e();
    }

    interface IB<T> extends IA{
        @InitBinder
        public void a(T t);

        public void e();
    }

    class A{
        @InitBinder
        public void c() {

        }
    }
    abstract class B {
        @InitBinder
        public void b(){};

        public void c() {

        }

        public void e() {

        }
    }

    class C extends B implements IB<String>{
        @InitBinder
        public void a(String t){}

        @Override
        public void d() {

        }

        @InitBinder
        public void c() {

        }

        @Override
        public void e() {

        }
    }
}
