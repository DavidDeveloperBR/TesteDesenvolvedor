package io.github.daviddeveloperbr.testedesenvolvedor.model;

public class PitStops {

    private Integer id;
    private Integer raceId;
    private Integer driverId;
    private Integer stop;
    private Integer lap;
    private String time;
    private Float duration;
    private Integer milliseconds;

    public PitStops() {
    }

    public PitStops(Integer id, Integer raceId, Integer driverId, Integer stop, Integer lap, String time, Float duration, Integer milliseconds) {
        this.id = id;
        this.raceId = raceId;
        this.driverId = driverId;
        this.stop = stop;
        this.lap = lap;
        this.time = time;
        this.duration = duration;
        this.milliseconds = milliseconds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStop() {
        return stop;
    }

    public void setStop(Integer stop) {
        this.stop = stop;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }
}
