package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HelloController {
    @GetMapping()
    public ResponseEntity<?> sayHello() {
        String msg = "Hello";
        log.info(msg);
        return ResponseEntity.ok(msg);
    }
}
