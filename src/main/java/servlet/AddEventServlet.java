package servlet;

import enums.EventType;
import manager.EventManager;
import model.Event;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/events/add")
public class AddEventServlet extends HttpServlet {

    private EventManager eventManager = new EventManager();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/addEvent.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String place = req.getParameter("place");
        boolean isOnline = Boolean.valueOf(req.getParameter("isOnline"));
        double price = Double.parseDouble(req.getParameter("price"));
        EventType eventType = EventType.valueOf(req.getParameter("eventType"));



        Event event = Event.builder()
                .name(name)
                .place(place)
                .isOnline(isOnline)
                .price(price)
                .eventType(eventType)
                .build();
        try {
            eventManager.addEvent(event);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("/events");
    }
}
