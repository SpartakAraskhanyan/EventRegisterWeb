package servlet;

import enums.EventType;
import manager.UserManager;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet(urlPatterns = "/users/add")
public class AddUserServlet extends HttpServlet {

    private UserManager userManager = new UserManager();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/addUser.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        int eventId = Integer.parseInt(req.getParameter("eventId"));




        User user = User.builder()
                .name(name)
                .surname(surname)
                .email(email)
                .eventId(eventId)
                .build();
        try {
            userManager.addUser(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/users");
    }

}
