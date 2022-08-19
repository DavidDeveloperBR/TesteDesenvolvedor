package io.github.daviddeveloperbr.testedesenvolvedor.model;

public class Results {

    private Integer resultId;
    private Integer raceId;
    private Integer driverId;
    private Integer constructorId;
    private Integer number;
    private Integer grid;
    private Integer position;
    private Integer positionText;
    private Integer positionOrder;
    private Float points;
    private Integer laps;
    private String time;
    private Integer milliseconds;
    private Integer fastestLap;
    private Integer rank;
    private String fastestLapTime;
    private Float fastestLapSpeed;
    private Integer statusId;

    public Results() {
    }

    public Results(Integer resultId, Integer raceId, Integer driverId, Integer constructorId, Integer number, Integer grid, Integer position, Integer positionText, Integer positionOrder, Float points, Integer laps, String time, Integer milliseconds, Integer fastestLap, Integer rank, String fastestLapTime, Float fastestLapSpeed, Integer statusId) {
        this.resultId = resultId;
        this.raceId = raceId;
        this.driverId = driverId;
        this.constructorId = constructorId;
        this.number = number;
        this.grid = grid;
        this.position = position;
        this.positionText = positionText;
        this.positionOrder = positionOrder;
        this.points = points;
        this.laps = laps;
        this.time = time;
        this.milliseconds = milliseconds;
        this.fastestLap = fastestLap;
        this.rank = rank;
        this.fastestLapTime = fastestLapTime;
        this.fastestLapSpeed = fastestLapSpeed;
        this.statusId = statusId;
    }

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(Integer constructorId) {
        this.constructorId = constructorId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
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

    public Integer getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(Integer positionOrder) {
        this.positionOrder = positionOrder;
    }

    public Float getPoints() {
        return points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public Integer getLaps() {
        return laps;
    }

    public void setLaps(Integer laps) {
        this.laps = laps;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(Integer fastestLap) {
        this.fastestLap = fastestLap;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(String fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public Float getFastestLapSpeed() {
        return fastestLapSpeed;
    }

    public void setFastestLapSpeed(Float fastestLapSpeed) {
        this.fastestLapSpeed = fastestLapSpeed;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}
