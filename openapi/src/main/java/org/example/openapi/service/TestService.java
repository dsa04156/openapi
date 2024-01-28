package org.example.openapi.service;

import org.example.openapi.domain.entity.TestEntity;
import org.example.openapi.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<TestEntity> getMemberList() {
        return testRepository.findAll();
    }
}
