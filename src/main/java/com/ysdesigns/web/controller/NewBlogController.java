package com.ysdesigns.web.controller;

import com.ysdesigns.blogComponent.Blog;
import com.ysdesigns.blogComponent.BlogBuilder;
import com.ysdesigns.blogComponent.BlogComponent;
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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(ModelMap model) {
        System.out.println("HDALSKFJALKSJDFLAKSJDLKFJ");
        return "newBlogCreate";

    }

    @RequestMapping(value = "/createNewBlogPage", method = RequestMethod.POST)
    public String createNewBlogPage(@ModelAttribute("SpringWeb") Blog blog,
                                  ModelMap model) {

//		blog.setBlogComponentList(blogBuilder.parseContent(blog.getContents()));
//		model.addAttribute("blogComponents", blog.getBlogComponentList());
//		System.out.println(blog.getBlogComponentList().size());
        System.out.println("Sample Function 1 Invoked");

        // TODO Validate the form before saving!

        // Save the blog information
        blogService.saveBlog(blog);

        // TODO Add successful message on top of "newBlogPage"

        return "newBlogCreate";
    }

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