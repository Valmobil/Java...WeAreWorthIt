package org.city.project;

import org.city.project.model.People;
import org.city.project.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;


@SpringBootApplication
//@ComponentScan({"hello","src/main/java/org/city/project/model"})
public class AppRunner {

    @Autowired
    PeopleRepository peopleRepository;

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class);
    }


    @Bean
    public CommandLineRunner demoForPeple() {
        return (args) -> {
            // save a couple of customers
            peopleRepository.save(new People("Jack", "Bauer"));
            peopleRepository.save(new People("Chloe", "O'Brian"));
            peopleRepository.save(new People("Kim", "Bauer"));
            peopleRepository.save(new People("David", "Palmer"));
            peopleRepository.save(new People("Michelle", "Dessler"));

            // fetch all customers
            System.out.println("Customers found with findAll():");
            System.out.println("-------------------------------");
            for (People people : peopleRepository.findAll()) {
                System.out.println(people.toString());
            }
//
            // fetch an individual customer by ID
            peopleRepository.findById(1L)
                    .ifPresent(people -> {
                        System.out.println("Customer found with findById(1L):");
                        System.out.println("--------------------------------");
                        System.out.println(people.toString());
                    });
//
            // fetch customers by last name
            System.out.println("Customer found with findByLastName('Bauer'):");
            System.out.println("--------------------------------------------");
            peopleRepository.findPeopleBypeopleFirstName("Jack").forEach(bauer -> {
                System.out.println("Jack is fouund!!!");
                System.out.println(bauer.toString());
            });
//             for (Customer bauer : repository.findByLastName("Bauer")) {
//             	System.out.println(bauer.toString());
//             }
        };
    }
}
