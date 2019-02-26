package org.city.project.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Houses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "houses_id")
    private Long housesId;
    private String housesStreet;
    private String housesNumber;
    private String housesFlatNumber;
}

