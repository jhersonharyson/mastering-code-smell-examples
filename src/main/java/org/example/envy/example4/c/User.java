package org.example.envy.example4.c;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private final String name;
    private final String role;

    public boolean hasRole(String role) {
        return this.role.equals(role);
    }
}