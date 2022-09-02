package register;


import command.Commands;
import enums.EventType;
import manager.EventManager;
import manager.UserManager;
import model.Event;
import model.User;

import java.sql.SQLException;
import java.util.Scanner;

import static command.Commands.*;



public class EventRegister {
    private static Scanner scanner = new Scanner(System.in);
    private static UserManager userManager = new UserManager();
    private static EventManager eventManager = new EventManager();


    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            Commands.printCommands();

            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case ADD_EVENT:
                    try {
                        addEvent();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case ADD_USER:
                    try {
                        addUser();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case SHOW_EVENT:
                    try {
                        System.out.println(eventManager.getAllEvents());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                case SHOW_USER:
                    try {
                        System.out.println(userManager.getAllUsers());
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    break;
                case EXIT:
                    run = false;

                    break;

            }


        }


    }

    public static void addEvent() throws SQLException {
        System.out.println("please input Event name");
        String name = scanner.nextLine();
        System.out.println("please input Event place");
        String place = scanner.nextLine();
        System.out.println("please input Event isOnline");
        boolean isOnline = scanner.nextBoolean();
        System.out.println("please input Event price");
        double price = scanner.nextDouble();
        System.out.println("please input Event eventType");
        String type = scanner.next();
        EventType eventType = EventType.valueOf(type.toUpperCase());
        Event event = new Event(name, place, isOnline, price,eventType);
        eventManager.addEvent(event);
    }

    public static void addUser() throws SQLException {
        System.out.println("please input User name");
        String name = scanner.nextLine();
        System.out.println("please input User surname");
        String surname = scanner.nextLine();
        System.out.println("please input User email");
        String email = scanner.nextLine();
        System.out.println("please input eventId");
        int eventId = Integer.parseInt(scanner.nextLine());
        User user = new User(name, surname, email, eventId);
        userManager.addUser(user);
    }
}
