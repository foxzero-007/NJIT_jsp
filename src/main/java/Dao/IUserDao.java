package Dao;

import entity.User;

import java.util.List;

public interface IUserDao {
    //获取所有用户
    List<User> findAllUser();
    //根据ID搜索用户信息
    User getUserById(int id);
    //根据姓名搜索用户信息
    User getUserByName(String name);
    //新增用户信息
    void addUser(User user);
    //修改用户信息
    void updateUser(User user);
    //删除用户信息
    void deleteUser(int id);

}
