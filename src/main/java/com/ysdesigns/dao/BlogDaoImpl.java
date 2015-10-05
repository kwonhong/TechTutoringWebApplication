package com.ysdesigns.dao;

import com.ysdesigns.blogComponent.Blog;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by honkwon on 15-09-20.
 */

@Component
public class BlogDaoImpl extends AbstractDao implements BlogDao{

    @Override
    public void saveBlog(Blog blog) {
//        getSession().save(blog);
        persist(blog);
    }

    @Override
    public List<Blog> findAllBlog() {
        Criteria criteria = getSession().createCriteria(Blog.class);
        return (List<Blog>) criteria.list();
    }

    @Override
    public void deleteBlog(int blogID) {
        Query query = getSession().createSQLQuery("delete from Blog where id = :id");
        query.setInteger("id", blogID);
        query.executeUpdate();
    }

    @Override
    public Blog findBlogByID(int blogID) {
        Criteria criteria = getSession().createCriteria(Blog.class);
        criteria.add(Restrictions.eq("id", blogID));
        return (Blog) criteria.uniqueResult();
    }

    @Override
    public void updateBlog(Blog blog) {
        getSession().update(blog);
    }

    @Override
    public void saveOrUpdateBlog(Blog blog) {
        getSession().saveOrUpdate(blog);
    }
}
