package servlet;

import lombok.SneakyThrows;

import manager.UserManager;

import model.User;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(urlPatterns = "/users")
public class UsersServlet extends HttpServlet {

    private UserManager userManager = new UserManager();

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        List<User> userList = userManager.getAllUsers();

        req.setAttribute("users", userList);

        req.getRequestDispatcher("/WEB-INF/users.jsp").forward(req, resp);

    }
}
