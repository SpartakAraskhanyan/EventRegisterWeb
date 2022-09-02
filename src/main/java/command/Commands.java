package command;

public interface Commands {

    int ADD_EVENT = 0;
    int ADD_USER = 1;
    int SHOW_EVENT = 2;
    int SHOW_USER = 3;
    int EXIT = 4;
    static void printCommands(){
        System.out.println("Please input " + ADD_EVENT + " ADD_EVENT");
        System.out.println("Please input " + ADD_USER + " ADD_USER");
        System.out.println("Please input " + SHOW_EVENT + " SHOW_EVENT");
        System.out.println("Please input " + SHOW_USER + " SHOW_USER");
        System.out.println("Please input " + EXIT + " EXIT");


    }
}
