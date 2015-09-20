package com.ysdesigns.service;

import com.ysdesigns.blogComponent.Blog;

import java.util.List;

/**
 * Created by honkwon on 15-09-20.
 */
public interface BlogService {

    void saveBlog(Blog blog);

    List<Blog> findAllBlog();

    void deleteBlogByID(int id);

    Blog findBlogByID(int id);

    void updateBlog(Blog blog);
}
