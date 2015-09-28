package com.ysdesigns.dao;

import com.ysdesigns.blogComponent.Blog;

import java.util.List;

/**
 * Created by honkwon on 15-09-20.
 */
public interface BlogDao {

    void saveBlog(Blog blog);
    List<Blog> findAllBlog();
    void deleteBlog(int blogID);
    Blog findBlogByID(int blogID);
    void updateBlog(Blog blog);
    void saveOrUpdateBlog(Blog blog);
}
