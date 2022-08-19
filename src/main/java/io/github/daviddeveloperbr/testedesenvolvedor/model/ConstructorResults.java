package io.github.daviddeveloperbr.testedesenvolvedor.model;

public class ConstructorResults {

    private Integer constructorResultsId;
    private Integer raceId;
    private Integer constructorId;
    private Float points;
    private String status;

    public ConstructorResults() {
    }

    public ConstructorResults(Integer constructorResultsId, Integer raceId, Integer constructorId, Float points, String status) {
        this.constructorResultsId = constructorResultsId;
        this.raceId = raceId;
        this.constructorId = constructorId;
        this.points = points;
        this.status = status;
    }

    public Integer getConstructorResultsId() {
        return constructorResultsId;
    }

    public void setConstructorResultsId(Integer constructorResultsId) {
        this.constructorResultsId = constructorResultsId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(Integer constructorId) {
        this.constructorId = constructorId;
    }

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
