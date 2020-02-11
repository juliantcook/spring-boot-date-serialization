package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping("/")
    public ResponseEntity<Demo> getDemo() {
        return ResponseEntity.ok(new Demo());
    }
}

class Demo {
    private LocalDateTime timestamp = LocalDateTime.parse("2020-02-11T18:32:06.321098");

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
