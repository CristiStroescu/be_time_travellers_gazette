package com.facultate.timetravellergazette.controller;

import com.facultate.timetravellergazette.model.dto.LoginDto;
import com.facultate.timetravellergazette.model.dto.UserDto;
import com.facultate.timetravellergazette.response.LoginResponse;
import com.facultate.timetravellergazette.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/save")
    public String saveUser(@RequestBody UserDto userDTO){
        return userService.addUser(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<?> saveUser(@RequestBody LoginDto loginDto){
        LoginResponse loginResponse = userService.loginUser(loginDto);
        return ResponseEntity.ok(loginResponse);
    }

}
