package org.city.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public @Data class People {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long peopleId;
    private Long peopleHousesId;

    private String peopleFirstName;

    private String peopleLastName;
    private String peoplePhone1;
    private String peoplePhone2;

    public People(String peopleFirstName, String peopleLastName) {
        this.peopleFirstName = peopleFirstName;
        this.peopleLastName = peopleLastName;
    }
}