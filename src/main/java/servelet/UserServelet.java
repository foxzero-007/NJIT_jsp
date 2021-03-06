package servelet;

import com.alibaba.fastjson.JSON;
import com.mysql.cj.xdevapi.JsonParser;
import entity.User;
import service.IUserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServelet extends HttpServlet {
    IUserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getUserById(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getUserByName(req, resp);
    }
    private void getUserById(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        User user = userService.getUserById(Integer.parseInt(req.getParameter("id")));
        String userJson = JSON.toJSONString(user);
        resp.getWriter().write(userJson);
    }
    private void getUserByName(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
        User user = userService.getUserByName(req.getParameter("username"));
        System.out.println(user.getPassword());
        System.out.println(req.getParameter("password"));
        if(user.getPassword().equals(req.getParameter("password"))){
            req.getRequestDispatcher("pages/"+user.getGuide()+".jsp").forward(req,resp);
        }else{
            resp.getWriter().write("wrong");
        }
    }
}
