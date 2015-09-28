package com.ysdesigns.web.controller;

import com.ysdesigns.blogComponent.Blog;
import com.ysdesigns.blogComponent.BlogBuilder;
import com.ysdesigns.blogComponent.BlogComponent;
import com.ysdesigns.blogComponent.Login;
import com.ysdesigns.common.urls.RequestMappingDefinitions;
import com.ysdesigns.common.urls.UrlHelper;
import com.ysdesigns.service.BlogService;
import com.ysdesigns.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

/**
 * Created by Steven on 2015-09-27.
 */


@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @Autowired
    protected UrlHelper urlHelper;

    @RequestMapping(value = RequestMappingDefinitions.LOGIN_URL_PATH, method = RequestMethod.GET)
    public String login(ModelMap model) {
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);
        return RequestMappingDefinitions.getViewName(RequestMappingDefinitions.LOGIN_URL_PATH);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String checkLOGIN
            (@ModelAttribute("SpringWeb") Login login, String username, String password,
             ModelMap model) {

        if (loginService.checkLogin(login,username, password)) {
            return "loginSuccess";
        }
        else
            return "login";
    }




}


