package org.example.springjwt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.apache.catalina.User;

@Entity
@Getter
@Table(name = "Member")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    private String role;

    public UserEntity(){

    }

    public UserEntity(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
