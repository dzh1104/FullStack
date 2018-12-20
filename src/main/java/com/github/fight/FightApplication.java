package com.github.fight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @RestController Annotations
* This is known as a stereotype annotation. It provides hints for people reading the code and for Spring that the class plays a specific role.
* In this case, our class is a web @Controller, so Spring considers it when handling incoming web requests.
*
* @RequestMapping Annotations
* The @RequestMapping annotation provides “routing” information. It tells Spring that any HTTP request with the / path should be mapped to the home method.
* The @RestController annotation tells Spring to render the resulting string directly back to the caller.
* */
@RestController
@SpringBootApplication
public class FightApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        SpringApplication.run(FightApplication.class, args);
    }

}
