package org.city.project.model;
import java.util.UUID;

public class houses {
    private UUID housesId;
    private String housesStreet;
    private String housesNumber;
    private String housesFlatNumber;

    public UUID getHousesId() { return housesId; }

    public void setHousesId(UUID housesId) {
        this.housesId = housesId;
    }

    public String getHousesStreet() {
        return housesStreet;
    }

    public void setHousesStreet(String housesStreet) {
        this.housesStreet = housesStreet;
    }

    public String getHousesNumber() {
        return housesNumber;
    }

    public void setHousesNumber(String housesNumber) {
        this.housesNumber = housesNumber;
    }

    public String getHousesFlatNumber() {
        return housesFlatNumber;
    }

    public void setHousesFlatNumber(String housesFlatNumber) {
        this.housesFlatNumber = housesFlatNumber;
    }
}

