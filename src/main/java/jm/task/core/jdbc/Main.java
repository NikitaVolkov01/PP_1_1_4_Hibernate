package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Nikita", "Volkov", (byte) 22);
        userService.saveUser("Egor", "Egorov", (byte) 22);
        userService.saveUser("Julia", "Pronina", (byte) 22);
        userService.saveUser("Inna", "Rubleva", (byte) 23);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
