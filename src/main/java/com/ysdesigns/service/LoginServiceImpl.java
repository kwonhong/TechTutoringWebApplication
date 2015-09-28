package com.ysdesigns.service;

import com.ysdesigns.blogComponent.Login;
import com.ysdesigns.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Steven on 2015-09-27.
 */

@Service("loginService")
@Component
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao dao;

    @Override
    public void saveLogin(Login login) {
        dao.saveLogin(login);
    }

    @Override
    public List<Login> findAllLogin() {
        return dao.findAllLogin();
    }

    @Override
    public void deleteLoginByID(int id) {
        dao.deleteLogin(id);
    }

    @Override
    public Login findLoginByID(int id) {
        return dao.findLoginByID(id);
    }

    @Override
    public void updateLogin(Login login){
        dao.updateLogin(login);
    }
    @Override
    public boolean checkLogin(Login login, String username, String password ){
        return dao.checkLogin(login,username, password);
    }
}
