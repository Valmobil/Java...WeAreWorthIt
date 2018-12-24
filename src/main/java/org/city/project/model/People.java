package org.city.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class People {

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

    public Long getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Long peopleId) {
        this.peopleId = peopleId;
    }

    public String getPeopleFirstName() {
        return peopleFirstName;
    }

    public void setPeopleFirstName(String peopleFirstName) {
        this.peopleFirstName = peopleFirstName;
    }

    public String getPeopleLastName() {
        return peopleLastName;
    }

    public void setPeopleLastName(String peopleLastName) {
        this.peopleLastName = peopleLastName;
    }

    public String getPeoplePhone1() {
        return peoplePhone1;
    }

    public void setPeoplePhone1(String peoplePhone1) {
        this.peoplePhone1 = peoplePhone1;
    }

    public String getPeoplePhone2() {
        return peoplePhone2;
    }

    public void setPeoplePhone2(String peoplePhone2) {
        this.peoplePhone2 = peoplePhone2;
    }

    public Long getPeopleHousesId() {
        return peopleHousesId;
    }

    public void setPeopleHousesId(Long peopleHousesId) {
        this.peopleHousesId = peopleHousesId;
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleId=" + peopleId +
                ", peopleHousesId=" + peopleHousesId +
                ", peopleFirstName='" + peopleFirstName + '\'' +
                ", peopleLastName='" + peopleLastName + '\'' +
                ", peoplePhone1='" + peoplePhone1 + '\'' +
                ", peoplePhone2='" + peoplePhone2 + '\'' +
                '}';
    }

}

