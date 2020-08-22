package part.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import part.dao.TestDao;

import javax.servlet.http.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Neo
 * @date 2020/8/5 17:30
 */
@SessionAttributes("test")
@Controller
public class HtmlController implements GenericController<String>{

    @InitBinder
    public  void initBinder(WebDataBinder binder, HttpServletRequest request){
        System.out.println(request.getParameter("date"));
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("MM-dd-yyyy"),false));
        binder.registerCustomEditor(TestPropertyEditor.class, new TestPropertyEditor());
    }

    @ModelAttribute
    public void getTest(ModelMap map, HttpSession session){
        map.put("test", new TestDao());
    }

    public String index(TestDao test,
                        WebRequest request, HttpSession session, ModelMap map, String str){
        request.getParameterMap();
        return "index";
    }

    @RequestMapping("/home/{param}")
    public String home(){
        return "home";
    }

    @RequestMapping("/home/*")
    public String home2(){
        return "home";
    }

    public HtmlController() {
    }
}