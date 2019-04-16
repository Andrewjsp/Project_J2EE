package service;

import dao.UserDao;
import entity.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class UserService {

    @Inject
    UserDao userDao;
public User getUser(String login,String password){
   return userDao.getUser(login,password);
}

public void addUser(User user){
    userDao.addUser(user);
}
}
