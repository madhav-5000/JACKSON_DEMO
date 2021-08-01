package com.mrinalgupta.jackson_demo.repository;

import com.mrinalgupta.jackson_demo.domain.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {
}
