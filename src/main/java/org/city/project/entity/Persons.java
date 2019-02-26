package org.city.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persons_id")
    private Long personsId;
    private Long personsHousesId;

    private String personsFirstName;
    private String personsLastName;
    private String personsPhone1;
    private String personsPhone2;
}