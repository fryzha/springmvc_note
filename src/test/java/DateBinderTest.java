import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;
import part.entity.TestEntity;

/**
 * @author Neo
 * @date 2020/8/29 14:46
 */
public class DateBinderTest {
    public DateBinderTest() {
    }

    public static void main(String[] args) {
        MutablePropertyValues mpvs = new MutablePropertyValues();
        mpvs.add("id", "123");
        mpvs.add("name", "testEntity");

        TestEntity testEntity = new TestEntity();
        DataBinder binder = new DataBinder(testEntity, "testEntity");
        binder.bind(mpvs);
    }
}
