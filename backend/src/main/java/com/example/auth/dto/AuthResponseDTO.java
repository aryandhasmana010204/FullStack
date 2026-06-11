package com.example.auth.dto;

import com.example.auth.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponseDTO {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String email;
    private Role role;

    public AuthResponseDTO(String token, Long id, String email, Role role) {
        this.token = token;
        this.id = id;
        this.email = email;
        this.role = role;
    }
}
