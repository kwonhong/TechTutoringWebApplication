package com.ysdesigns.service;

import com.ysdesigns.blogComponent.Login;

import java.util.List;
/**
 * Created by Steven on 2015-09-27.
 */
public interface LoginService {

    void saveLogin(Login login);

    List<Login> findAllLogin();

    void deleteLoginByID(int id);

    Login findLoginByID(int id);

    void updateLogin(Login login);

   boolean checkLogin(Login login, String username, String password );
}
