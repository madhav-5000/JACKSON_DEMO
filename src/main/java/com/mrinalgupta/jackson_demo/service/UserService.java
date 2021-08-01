package com.mrinalgupta.jackson_demo.service;

import com.mrinalgupta.jackson_demo.domain.User;
import com.mrinalgupta.jackson_demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> list(){
        return userRepository.findAll();
    }

    public void saveAll(List<User> users){
        userRepository.saveAll(users);
    }


}
