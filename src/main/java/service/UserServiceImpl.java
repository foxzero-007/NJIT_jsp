package service;

import Dao.IUserDao;
import Dao.UserDaoImpl;
import entity.User;

import java.util.List;

public class UserServiceImpl implements IUserService{
    private IUserDao UserDao = new UserDaoImpl();
    @Override
    public List<User> findAllUser() {
        return UserDao.findAllUser();
    }

    @Override
    public User getUserById(int id) {
        return UserDao.getUserById(id);
    }

    @Override
    public User getUserByName(String name) {
        return UserDao.getUserByName(name);
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
