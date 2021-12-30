package Dao;

import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.c3p0Util;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements IUserDao{
    private QueryRunner runner=new QueryRunner(c3p0Util.getDataSource());

    @Override
    public List<User> findAllUser() {
        try{
            return runner.query("select * from test",new BeanListHandler<User>(User.class));
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getUserById(int id) {
        try{
            return runner.query("select * from test where id=?",new BeanHandler<User>(User.class),id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User getUserByName(String name) {
        return null;
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
