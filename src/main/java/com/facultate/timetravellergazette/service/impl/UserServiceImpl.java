package com.facultate.timetravellergazette.service.impl;

import com.facultate.timetravellergazette.model.dto.LoginDto;
import com.facultate.timetravellergazette.model.dto.UserDto;
import com.facultate.timetravellergazette.model.entity.User;
import com.facultate.timetravellergazette.repository.UserRepository;
import com.facultate.timetravellergazette.response.LoginResponse;
import com.facultate.timetravellergazette.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public String addUser(UserDto userDTO) {

        User newUser = new User();
        newUser.setUsername(userDTO.getUsername());
        newUser.setId(userDTO.getId());
        newUser.setPassword(userDTO.getPassword());

        userRepository.save(newUser);

        return newUser.getUsername();
    }

    @Override
    public LoginResponse loginUser(LoginDto loginDto) {
        LoginResponse loginResponse = new LoginResponse();
        User user1 = userRepository.findByUsername(loginDto.getUsername());
        if(user1 != null){
            String password = loginDto.getPassword();
            String correctPassword = user1.getPassword();
            boolean isPasswordRight = password.equals(correctPassword);
            if(isPasswordRight){
                Optional<User> user = userRepository.findOneByUsernameAndPassword(loginDto.getUsername(),loginDto.getPassword());
                if(user.isPresent()){
                    loginResponse.setMessage("Login Success");
                    loginResponse.setStatus(true);
                    return loginResponse;
                }
                else{
                    loginResponse.setMessage("Login Failed");
                    loginResponse.setStatus(false);
                    return loginResponse;
                }
            } else{
                loginResponse.setMessage("Password not match");
                loginResponse.setStatus(false);
                return loginResponse;
            }
        }
        else{
            loginResponse.setMessage("Username does not exist");
            loginResponse.setStatus(false);
            return loginResponse;
        }
    }
}
