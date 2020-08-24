package part.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import part.dao.TestDao;

import javax.servlet.http.HttpSession;

/**
 * @author Neo
 * @date 2020/8/22 23:03
 */
public interface GenericController<T> {
    @RequestMapping("/index")
//    @ResponseStatus(reason = "500error")
    public String index(SessionStatus sessionStatus, @ModelAttribute("test")TestDao test, WebRequest request, HttpSession session, ModelMap map, T t)
            throws Exception;
}