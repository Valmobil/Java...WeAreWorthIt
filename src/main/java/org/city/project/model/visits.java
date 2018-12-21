package org.city.project.model;

import java.util.UUID;

public class visits {
    private UUID visitsId;
    private UUID visitsCarsId;
    private UUID visitsPeopleId;
    private UUID visitsHousesId;

    public UUID getVisitsId() {
        return visitsId;
    }

    public void setVisitsId(UUID visitsId) {
        this.visitsId = visitsId;
    }

    public UUID getVisitsCarsId() {
        return visitsCarsId;
    }

    public void setVisitsCarsId(UUID visitsCarsId) {
        this.visitsCarsId = visitsCarsId;
    }

    public UUID getVisitsPeopleId() {
        return visitsPeopleId;
    }

    public void setVisitsPeopleId(UUID visitsPeopleId) {
        this.visitsPeopleId = visitsPeopleId;
    }

    public UUID getVisitsHousesId() {
        return visitsHousesId;
    }

    public void setVisitsHousesId(UUID visitsHousesId) {
        this.visitsHousesId = visitsHousesId;
    }
}
