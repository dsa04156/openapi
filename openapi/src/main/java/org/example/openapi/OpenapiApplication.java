package org.example.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class OpenapiApplication {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        SpringApplication.run(OpenapiApplication.class, args);
    }
}


