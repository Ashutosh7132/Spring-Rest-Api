package com.ibm.ashu.springboot.restful.webservices.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserDto {

    private Long id;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
}
