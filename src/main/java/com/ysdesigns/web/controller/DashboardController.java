package com.ysdesigns.web.controller;

import com.ysdesigns.blogComponent.Blog;
import com.ysdesigns.common.urls.RequestMappingDefinitions;
import com.ysdesigns.common.urls.UrlHelper;
import com.ysdesigns.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

/**
 * Created by honkwon on 15-09-22.
 */

@Controller
public class DashboardController {

    @Autowired
    private BlogService blogService;

    @Autowired
    protected UrlHelper urlHelper;

    @RequestMapping(value = RequestMappingDefinitions.INDEX_URL_PATH, method = RequestMethod.GET)
    public String init(ModelMap model) {
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);
        return RequestMappingDefinitions.getViewName(RequestMappingDefinitions.DASHBOARD_URL_PATH);
    }

    @RequestMapping(value = RequestMappingDefinitions.DASHBOARD_URL_PATH, method = RequestMethod.GET)
    public String getAllBlogLists(ModelMap model) {

        // Url Helper Attribute set for any jsp
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);

        // Retrieving blogs from the database;
        List<Blog> blogList = blogService.findAllBlog();
        Collections.sort(blogList); // Sorting
        blogList.stream().forEach(blog -> {
            System.out.println(blog.getTitle());
        });
        model.addAttribute("blogList", blogList);
        return "dashBoard";
    }

}
