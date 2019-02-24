package org.city.project.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.UUID;

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
