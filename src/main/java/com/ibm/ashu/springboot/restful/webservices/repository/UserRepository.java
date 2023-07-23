package com.ibm.ashu.springboot.restful.webservices.repository;

import com.ibm.ashu.springboot.restful.webservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
