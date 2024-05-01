package org.example.springjwt.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    private Enum<Role> role;
    private String name;
    private String username;
}
