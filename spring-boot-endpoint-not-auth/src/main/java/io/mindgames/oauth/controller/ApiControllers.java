package io.mindgames.oauth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    @GetMapping(value = "/users")
    public ResponseEntity getAllClients() {
        return new ResponseEntity("All Users", HttpStatus.OK);
    }

    @GetMapping(value = "/api/getusers")
    public ResponseEntity getAllUsers() {
        return new ResponseEntity("All Users", HttpStatus.OK);
    }
}


