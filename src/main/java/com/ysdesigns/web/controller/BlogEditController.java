package com.ysdesigns.web.controller;

import com.ysdesigns.blogComponent.Blog;
import com.ysdesigns.blogComponent.BlogBuilder;
import com.ysdesigns.common.urls.RequestMappingDefinitions;
import com.ysdesigns.common.urls.UrlHelper;
import com.ysdesigns.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

import static com.ysdesigns.blogComponent.Blog.blogAttributes.BLOG_ID;
import static com.ysdesigns.blogComponent.Blog.blogAttributes.CONTENTS;
import static com.ysdesigns.blogComponent.Blog.blogAttributes.SUB_TITLE;
import static com.ysdesigns.blogComponent.Blog.blogAttributes.TITLE;

/**
 * Created by honkwon on 15-09-23.
 */
@Controller
public class BlogEditController {

    @Autowired
    private BlogBuilder blogBuilder;

    @Autowired
    private BlogService blogService;

    @Autowired
    private UrlHelper urlHelper;


    @RequestMapping(value = RequestMappingDefinitions.BLOG_EDIT_URL_PATH + "/{blogID}", method = {RequestMethod.GET})
    public String editBlogPage(
            @PathVariable Integer blogID,
            ModelMap model) {

        // Url Helper
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);

        // Filling the data
        Blog blog = blogService.findBlogByID(blogID);
        model.addAttribute(TITLE.getAttributeName(), blog.getTitle());
        model.addAttribute(SUB_TITLE.getAttributeName(), blog.getSubTitle());
        model.addAttribute(CONTENTS.getAttributeName(), blog.getContents());
        model.addAttribute(BLOG_ID.getAttributeName(),blogID);
        return RequestMappingDefinitions.BLOG_EDIT_URL_PATH;
    }


    @RequestMapping(value = RequestMappingDefinitions.BLOG_UPDATE_URL_PATH, method = {RequestMethod.POST})
    public String saveOrUpdateBlog(@ModelAttribute("SpringWeb") Blog blog,
                             ModelMap model) {

        // Url Helper
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);

        // Set creation date to currentTime if it is creating the new blog.
        if (blog.getCreatedDate() == null) {
            blog.setCreatedDate(new Date());
        }

        // Save or Update
        blogService.saveOrUpdate(blog);

        // Redirecting to list of Blog
        return "redirect:" + RequestMappingDefinitions.BLOG_FIND_URL_PATH;
    }

    @RequestMapping(value = RequestMappingDefinitions.BLOG_DELETE_URL_PATH + "/{blogID}", method = {RequestMethod.GET})
    public String deleteBlog(
            @PathVariable Integer blogID,
            ModelMap model) {

        // Url Helper
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);

        // Deleting Blog
        blogService.deleteBlogByID(blogID);

        // Redirecting to list of Blog
        return "redirect:" + RequestMappingDefinitions.BLOG_FIND_URL_PATH;

    }

    @RequestMapping(value = RequestMappingDefinitions.BLOG_CREATE_URL_PATH, method = {RequestMethod.GET})
    public String createNewBlogPage(final ModelMap model) {

        // Url Helper
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);
        return RequestMappingDefinitions.BLOG_EDIT_URL_PATH;
    }

}
