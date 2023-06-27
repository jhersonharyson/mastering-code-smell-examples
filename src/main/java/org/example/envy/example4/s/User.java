package org.example.envy.example4.s;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private final String name;
    private final String role;
}