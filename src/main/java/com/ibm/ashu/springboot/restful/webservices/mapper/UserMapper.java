package com.ibm.ashu.springboot.restful.webservices.mapper;

import com.ibm.ashu.springboot.restful.webservices.dto.UserDto;
import com.ibm.ashu.springboot.restful.webservices.entity.User;

public class UserMapper {

    // Convert User JPA Entity into UserDto
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getUserFirstName(),
                user.getUserLastName(),
                user.getUserEmail()
        );
        return userDto;
    }

    // Convert UserDto into User JPA Entity
    public static User mapToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getUserFirstName(),
                userDto.getUserLastName(),
                userDto.getUserEmail()
        );
        return user;
    }
}
