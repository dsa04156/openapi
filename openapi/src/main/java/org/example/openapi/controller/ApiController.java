package org.example.openapi.controller;

import org.example.openapi.domain.entity.TestEntity;
import org.example.openapi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private TestService testService;

    @GetMapping("/api")
    public ResponseEntity<List<TestEntity>> hello1() {
        List<TestEntity> list = testService.getMemberList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }


}
