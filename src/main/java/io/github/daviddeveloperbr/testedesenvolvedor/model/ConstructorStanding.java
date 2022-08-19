package io.github.daviddeveloperbr.testedesenvolvedor.model;

public class ConstructorStanding {

    private Integer constructorStandingsId;
    private Integer raceId;
    private Integer constructorId;
    private Float points;
    private Integer position;
    private Integer positionText;
    private Integer wins;

    public ConstructorStanding() {
    }

    public ConstructorStanding(Integer constructorStandingsId, Integer raceId, Integer constructorId, Float points, Integer position, Integer positionText, Integer wins) {
        this.constructorStandingsId = constructorStandingsId;
        this.raceId = raceId;
        this.constructorId = constructorId;
        this.points = points;
        this.position = position;
        this.positionText = positionText;
        this.wins = wins;
    }

    public Integer getConstructorStandingsId() {
        return constructorStandingsId;
    }

    public void setConstructorStandingsId(Integer constructorStandingsId) {
        this.constructorStandingsId = constructorStandingsId;
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPositionText() {
        return positionText;
    }

    public void setPositionText(Integer positionText) {
        this.positionText = positionText;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }
}
