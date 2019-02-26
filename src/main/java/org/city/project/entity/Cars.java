package org.city.project.entity;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cars_id")
    private Long carsId;
    private String carsModel;
    private String carsColour;
    private String carsStateNumber;

 }
