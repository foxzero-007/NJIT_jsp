package test;

import entity.User;
import org.junit.jupiter.api.Test;
import service.IUserService;
import service.UserServiceImpl;

import java.util.List;

public class serviceTset {
    @Test
    public void findAllUser(){
        IUserService userService = new UserServiceImpl();
        List<User> userList= userService.findAllUser();
        for(User u:userList){
            System.out.println(u);
        }
    }
}
