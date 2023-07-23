package com.ibm.ashu.springboot.restful.webservices.service;

import com.ibm.ashu.springboot.restful.webservices.dto.UserDto;
import com.ibm.ashu.springboot.restful.webservices.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
