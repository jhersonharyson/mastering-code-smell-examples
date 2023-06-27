package org.example.envy.example4.c;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class UserRepository {
    private final List<User> users;

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<User> getUsersByRole(String role) {
        List<User> usersWithRole = new ArrayList<>();
        for (User user : users) {
            if (user.hasRole(role)) {
                usersWithRole.add(user);
            }
        }
        return usersWithRole;
    }
}
