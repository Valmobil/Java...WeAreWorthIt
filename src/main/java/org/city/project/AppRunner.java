package org.city.project;

import org.city.project.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppRunner {

//    @Autowired
    PersonsRepository personsRepository;

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class);
    }


//    @Bean
//    public CommandLineRunner demoForPeple() {
//        return (args) -> {
//            // save a couple of customers
//
//            personsRepository.save(Persons.builder().personsFirstName("Adam").personsLastName("Savage").build());
//            personsRepository.save(Persons.builder().personsFirstName("Jack").personsLastName("Bauer").build());
//            personsRepository.save(Persons.builder().personsFirstName("Kim").personsLastName("Bauer").build());
//            personsRepository.save(Persons.builder().personsFirstName("David").personsLastName("Palmer").build());
//            personsRepository.save(Persons.builder().personsFirstName("Michelle").personsLastName("Dessler").build());
////
//            // fetch all customers
//            System.out.println("Customers found with findAll():");
//            System.out.println("-------------------------------");
//            for (Persons persons : personsRepository.findAll()) {
//                System.out.println(persons.toString());
//            }
//
//            // fetch an individual customer by ID
//            personsRepository.findById(1L)
//                    .ifPresent(persons -> {
//                        System.out.println("Customer found with findById(1L):");
//                        System.out.println("--------------------------------");
//                        System.out.println(persons.toString());
//                    });
//
//            // fetch customers by last name
//            System.out.println("Customer found with findByLastName('Bauer'):");
//            System.out.println("--------------------------------------------");
//            personsRepository.findPersonsByPersonsFirstName("Jack").forEach(bauer -> {
//                System.out.println("Jack is fouund!!!");
//                System.out.println(bauer.toString());
//            });
////             for (Customer bauer : repository.findByLastName("Bauer")) {
////             	System.out.println(bauer.toString());
////             }
//        };
//    }
}
