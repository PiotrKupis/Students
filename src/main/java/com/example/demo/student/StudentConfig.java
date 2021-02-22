package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student jan = new Student(
                    "Jan",
                    "Kowalski",
                    LocalDate.of(2000, APRIL, 4)
            );

            Student alex = new Student(
                    "Alex",
                    "Nowak",
                    LocalDate.of(2002, APRIL, 7)
            );

            studentRepository.saveAll(
                    List.of(jan, alex)
            );
        };
    }
}
