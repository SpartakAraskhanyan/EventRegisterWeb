package servlet;

import lombok.SneakyThrows;
import manager.EventManager;
import model.Event;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

@WebServlet(urlPatterns = "/events")
public class EventsServlet extends HttpServlet {

    private EventManager eventManager = new EventManager();

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        List<Event> eventList = eventManager.getAllEvents();

        req.setAttribute("events", eventList);

        req.getRequestDispatcher("/WEB-INF/events.jsp").forward(req, resp);


    }
}
