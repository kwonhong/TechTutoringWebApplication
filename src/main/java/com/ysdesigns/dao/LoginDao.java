package com.ysdesigns.dao;

import com.ysdesigns.blogComponent.Login;

import java.util.List;

/**
 * Created by Steven on 2015-09-27.
 */
public interface LoginDao {

    void saveLogin(Login login);
    List<Login> findAllLogin();
    void deleteLogin(int loginID);
    Login findLoginByID(int loginID);
    void updateLogin(Login login);

   boolean checkLogin(Login login, String username, String password );

}
