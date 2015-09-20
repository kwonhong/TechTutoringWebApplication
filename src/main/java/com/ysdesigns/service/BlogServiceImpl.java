package com.ysdesigns.service;

import com.ysdesigns.blogComponent.Blog;
import com.ysdesigns.dao.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by honkwon on 15-09-20.
 */
@Service("blogService")
@Component
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao dao;

    @Override
    public void saveBlog(Blog blog) {
        dao.saveBlog(blog);
    }

    @Override
    public List<Blog> findAllBlog() {
        return dao.findAllBlog();
    }

    @Override
    public void deleteBlogByID(int id) {
        dao.deleteBlog(id);
    }

    @Override
    public Blog findBlogByID(int id) {
        return dao.findBlogByID(id);
    }

    @Override
    public void updateBlog(Blog blog){
        dao.updateBlog(blog);
    }
}
