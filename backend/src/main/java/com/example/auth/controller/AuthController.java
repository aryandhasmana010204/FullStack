package com.example.auth.controller;

import com.example.auth.dto.AuthResponseDTO;
import com.example.auth.dto.LoginDTO;
import com.example.auth.dto.RegisterDTO;
import com.example.auth.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterDTO registerDTO) {
        authService.registerUser(registerDTO);
        return ResponseEntity.ok(Map.of("message", "User registered successfully!"));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> authenticateUser(@Valid @RequestBody LoginDTO loginDTO) {
        AuthResponseDTO responseDTO = authService.authenticateUser(loginDTO);
        return ResponseEntity.ok(responseDTO);
    }
}
