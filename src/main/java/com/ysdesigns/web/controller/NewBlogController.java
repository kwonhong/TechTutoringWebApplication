package com.ysdesigns.web.controller;

import com.ysdesigns.blogComponent.Blog;
import com.ysdesigns.blogComponent.BlogBuilder;
import com.ysdesigns.blogComponent.BlogComponent;
import com.ysdesigns.common.urls.UrlHelper;
import com.ysdesigns.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class NewBlogController {

    @Autowired
    private BlogBuilder blogBuilder;

    @Autowired
    private BlogService blogService;

    @Autowired
    private UrlHelper urlHelper;

//    @RequestMapping(value = RequestMappingDefinitions.BLOG_EDIT_URL_PATH, method = {RequestMethod.GET, RequestMethod.POST})
//    public String createNewBlogPage(@ModelAttribute("SpringWeb") Blog blog,
//                                  ModelMap model) {
//
//        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);
//
////		blog.setBlogComponentList(blogBuilder.parseContent(blog.getContents()));
////		model.addAttribute("blogComponents", blog.getBlogComponentList());
////		System.out.println(blog.getBlogComponentList().size());
//        System.out.println("Sample Function 1 Invoked");
//
//        // TODO Validate the form before saving!
//
//        // Save the blog information
//        blog.setCreatedDate(new Date());
//        blogService.saveBlog(blog);
//
//        // TODO Add successful message on top of "newBlogPage"
//
//        List<Blog> list = blogService.findAllBlog();
//        for (Blog tempBlog: list) {
//            System.out.println(tempBlog.getTitle());
//        }
//
//        return "newBlogCreate";
//    }

    @RequestMapping(value = "/previewNewBlogPage", method = RequestMethod.POST)
    public String previewNewBlogPage
            (@ModelAttribute("SpringWeb") Blog blog,
             ModelMap model) {

        List<BlogComponent> blogComponentList = blogBuilder.parseContent(blog.getContents());
        blog.setCreatedDate(new Date());
		model.addAttribute("blogComponents", blogComponentList);
        model.addAttribute("createdDate", blog.getCreatedDate().toString());
        model.addAttribute("title", blog.getTitle());
        model.addAttribute("subTitle", blog.getSubTitle());
        return "newBlogPreview";
    }


}
