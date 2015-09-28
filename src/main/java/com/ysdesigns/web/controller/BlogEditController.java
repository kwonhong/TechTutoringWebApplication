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
    public String eidtBlogPage(
            @PathVariable Integer blogID,
            ModelMap model) {

        // Url Helper
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);

        Blog blog = blogService.findBlogByID(blogID);
        model.addAttribute(TITLE.getAttributeName(), blog.getTitle());
        model.addAttribute(SUB_TITLE.getAttributeName(), blog.getSubTitle());
        model.addAttribute(CONTENTS.getAttributeName(), blog.getContents());
        model.addAttribute(BLOG_ID.getAttributeName(),blogID);
        return RequestMappingDefinitions.BLOG_EDIT_URL_PATH;
    }


    @RequestMapping(value = RequestMappingDefinitions.BLOG_UPDATE_URL_PATH, method = {RequestMethod.POST})
    public String saveOrupdateBlog(@ModelAttribute("SpringWeb") Blog blog,
                             ModelMap model) {

        // Url Helper
        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);

        // Updating Blog
        if (blog.getCreatedDate() == null) {
            blog.setCreatedDate(new Date());
        }

        blogService.saveOrUpdate(blog);

        // Redirecting to list of Blog
        return RequestMappingDefinitions.BLOG_FIND_URL_PATH;
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

    @RequestMapping(value = RequestMappingDefinitions.BLOG_SUBMIT_URL_PATH, method = {RequestMethod.POST})
    public String createNewBlog(@ModelAttribute("SpringWeb") Blog blog,
                                ModelMap model) {

        model.addAttribute(UrlHelper.URL_HELPER_ATTRIBUTE_NAME, urlHelper);
//        return RequestMappingDefinitions.BLOG_EDIT_URL_PATH;
//		blog.setBlogComponentList(blogBuilder.parseContent(blog.getContents()));
//		model.addAttribute("blogComponents", blog.getBlogComponentList());
//		System.out.println(blog.getBlogComponentList().size());
//        System.out.println("Sample Function 1 Invoked");

        // TODO Validate the form before saving!

        // Save the blog information
        blog.setCreatedDate(new Date());
        blogService.saveBlog(blog);

        // TODO Add successful message on top of "newBlogPage"

//        List<Blog> list = blogService.findAllBlog();
//        for (Blog tempBlog: list) {
//            System.out.println(tempBlog.getTitle());
//        }

        return RequestMappingDefinitions.BLOG_EDIT_URL_PATH;
    }

//    public static void main(String[] args) {
//        String input = "7 31 46 90";
//        String[] numInputs = input.split(" ");
//        List<Integer> numList = Arrays.asList(numInputs).stream().map(Integer::parseInt).collect(Collectors.toList());
//        numList.sort(Collections.reverseOrder());
//
//        int count = helper(numList, 100, 0);
//        System.out.println(count);
//    }
//
//    private static int helper(List<Integer> numArray, int sum, int count) {
//        if (sum == 0) {
//            return count;
//        } else if (sum < 0) {
//            return -1;
//        }
//
//
//        for (int num: numArray) {
//            int count2 = helper(numArray, sum-num, count + 1);
//            if (count2 != -1) {
//                return count2;
//            }
//        }
//        return -1;
//    }

}
