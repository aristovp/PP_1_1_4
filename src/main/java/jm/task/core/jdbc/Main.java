package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Fedor", "popov", (byte) 20);
        userService.saveUser("Dmitri", "Stapanov", (byte) 23);
        userService.saveUser("Alex", "Lixov", (byte) 28);
        userService.saveUser("Lex", "Sakov", (byte) 40);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
