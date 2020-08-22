package part.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Neo
 * @date 2020/8/22 11:40
 */
@ControllerAdvice
public class GlobalControllerAdiviceController {
    @InitBinder
    public void dataBind(WebDataBinder binder){
        //设置的格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        ///給指定类型注册类型转换器操作
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @ModelAttribute
    public String modelAttribut(ModelMap map) {
        return "no name";
    }
}

