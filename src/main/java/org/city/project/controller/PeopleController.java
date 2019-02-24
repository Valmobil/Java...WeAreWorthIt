//package org.city.project.controller;
//
//import org.city.project.model.Persons;
//import org.city.project.repository.PeopleRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class PeopleController {
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(PeopleController.class);
//    }
//
//    @Bean
//    public CommandLineRunner demo(PeopleRepository repos) {
//        return (args) -> {
//            // save a couple of customers
//
//            repos.save(new Persons("Jack", "Bauer"));
//            repos.save(new Persons("Chloe", "O'Brian"));
//            repos.save(new Persons("Kim", "Bauer"));
//            repos.save(new Persons("David", "Palmer"));
//            repos.save(new Persons("Michelle", "Dessler"));
//
//            // fetch all customers
//            System.out.println("Customers found with findAll():");
//            System.out.println("-------------------------------");
//            for (Persons customer : repos.findAll()) {
//                System.out.println(customer.toString());
//            }
//            System.out.println();
//
//            // fetch an individual customer by ID
//            repos.findById(1L)
//                    .ifPresent(customer -> {
//                        System.out.println("Customer found with findById(1L):");
//                        System.out.println("--------------------------------");
//                        System.out.println(customer.toString());
//                        System.out.println("");
//                    });
//
//            // fetch customers by last name
//            System.out.println("Customer found with findByLastName('Bauer'):");
//            System.out.println("--------------------------------------------");
////            repos.findByLastName("Bauer").forEach(bauer -> {
////                System.out.println(bauer.toString());
////            });
//            // for (Customer bauer : repos.findByLastName("Bauer")) {
//            // 	System.out.println(bauer.toString());
//            // }
//            System.out.println("");
//        };
//    }
//}
