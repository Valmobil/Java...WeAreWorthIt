package org.city.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
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