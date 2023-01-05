package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JULY;
import static java.time.Month.JUNE;

@Configuration
public class StudentConfigure {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
                Student arjun =  new Student(
                    "Arjun",
                    "Arjun@gmail.com",
                    LocalDate.of(2000, JULY, 18),
                    22
                );
                Student achu =  new Student(
                        "Achu",
                        "Achu@gmail.com",
                        LocalDate.of(2001, JUNE, 18),
                        22
                );
            repository.saveAll(
                    List.of(arjun, achu)
            );
        };
    }
}
