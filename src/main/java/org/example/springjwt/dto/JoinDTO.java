package org.example.springjwt.dto;

import lombok.Getter;

@Getter
public class JoinDTO {
    private String username;
    private String password;

    public JoinDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
