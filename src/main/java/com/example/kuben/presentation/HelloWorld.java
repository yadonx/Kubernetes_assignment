package com.example.kuben.presentation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Emil Johansson
 * Date: 2021-09-16
 * Time: 13:13
 * Project: kuben
 * Package: com.example.kuben.presentation
 */
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
       return ResponseEntity.status(HttpStatus.OK).body("Helo Wrld!");
    }


}
