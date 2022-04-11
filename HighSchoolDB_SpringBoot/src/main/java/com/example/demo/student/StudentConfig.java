package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student maurice = new Student(
                    1L,
                    "Maurice",
                    "burnerAccount@gmail.com",
                    LocalDate.of(1992, Month.JANUARY, 01)

            );

            Student ramone = new Student(
                    2L,
                    "Ramone",
                    "burnerAccount2@gmail.com",
                    LocalDate.of(1984, Month.JANUARY, 21)

            );

            repository.saveAll(List.of(maurice, ramone));

        };


    }
}
