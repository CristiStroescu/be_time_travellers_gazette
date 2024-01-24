package com.facultate.timetravellergazette.service;

import com.facultate.timetravellergazette.model.dto.LoginDto;
import com.facultate.timetravellergazette.model.dto.UserDto;
import com.facultate.timetravellergazette.response.LoginResponse;
import org.springframework.stereotype.Service;

public interface UserService {

    String addUser(UserDto userDTO);

    LoginResponse loginUser(LoginDto loginDto);
}
