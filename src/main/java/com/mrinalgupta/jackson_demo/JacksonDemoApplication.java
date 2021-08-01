package com.mrinalgupta.jackson_demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mrinalgupta.jackson_demo.domain.User;
import com.mrinalgupta.jackson_demo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class JacksonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JacksonDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService){
        return args -> {
//            read json and write to dp
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("/jsons/users.json");

            try{
                List<User> users = mapper.readValue(inputStream, typeReference);
                userService.saveAll(users);
                System.out.println("Users saved");
            }catch (IOException e){
                System.out.println(e.getMessage() + "Unable to save users");
            }


        };
    }
}
