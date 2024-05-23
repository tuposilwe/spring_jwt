package com.rudiger.Springjwt.controller;

import com.rudiger.Springjwt.model.AuthenticationRequest;
import com.rudiger.Springjwt.model.AuthenticationResponse;
import com.rudiger.Springjwt.model.User;
import com.rudiger.Springjwt.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authService;


    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
         @RequestBody User request
    ){
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
        @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(authService.authenticate(request));
    }

}
