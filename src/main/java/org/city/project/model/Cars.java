package org.city.project.model;
import java.util.UUID;

public class Cars {
    private UUID carsId;
    private UUID housesId;
    private String carsModel;
    private String carsStateNumber;

    public UUID getCarsId() {
        return carsId;
    }

    public void setCarsId(UUID carsId) {
        this.carsId = carsId;
    }

    public UUID getHousesId() {
        return housesId;
    }

    public void setHousesId(UUID housesId) {
        this.housesId = housesId;
    }

    public String getCarsModel() {
        return carsModel;
    }

    public void setCarsModel(String carsModel) {
        this.carsModel = carsModel;
    }

    public String getCarsStateNumber() {
        return carsStateNumber;
    }

    public void setCarsStateNumber(String carsStateNumber) {
        this.carsStateNumber = carsStateNumber;
    }
}
