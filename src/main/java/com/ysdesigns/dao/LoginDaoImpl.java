package com.ysdesigns.dao;

import com.ysdesigns.blogComponent.Login;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * Created by Steven on 2015-09-27.
 */


@Component
public class LoginDaoImpl extends AbstractDao implements LoginDao{

    @Override
    public void saveLogin(Login login) {
//        getSession().save(login);
        persist(login);
    }

    @Override
    public List<Login> findAllLogin() {
        Criteria criteria = getSession().createCriteria(Login.class);
        return (List<Login>) criteria.list();
    }

    @Override
    public void deleteLogin(int loginID) {
        Query query = getSession().createSQLQuery("delete from Login where id = :id");
        query.setInteger("id", loginID);
        query.executeUpdate();
    }

    @Override
    public Login findLoginByID(int loginID) {
        Criteria criteria = getSession().createCriteria(Login.class);
        criteria.add(Restrictions.eq("id", loginID));
        return (Login) criteria.uniqueResult();
    }

    @Override
    public void updateLogin(Login login) {
        getSession().update(login);
    }

    @Override
    public boolean checkLogin(Login login, String username, String password ){

        String sql = "SELECT * from login where login.username = '"+ username+"' and login.password = '"+ password + "'";
        Query query = getSession().createSQLQuery(sql);
                List result = query.list();
        if (result.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
}

