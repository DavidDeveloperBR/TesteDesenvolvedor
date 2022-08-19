package io.github.daviddeveloperbr.testedesenvolvedor.model;

public class Races {

    private Integer raceId;
    private Integer year;
    private Integer round;
    private Integer circuitId;
    private String name;
    private String date;
    private String time;
    private String url;
    private String fp1_date;
    private String fp1_time;
    private String fp2_date ;
    private String fp2_time ;
    private String fp3_date ;
    private String fp3_time ;
    private String quali_date;
    private String quali_time;
    private String sprint_date;
    private String sprint_time;

    public Races() {
    }

    public Races(Integer raceId, Integer year, Integer round, Integer circuitId, String name, String date, String time, String url, String fp1_date, String fp1_time, String fp2_date, String fp2_time, String fp3_date, String fp3_time, String quali_date, String quali_time, String sprint_date, String sprint_time) {
        this.raceId = raceId;
        this.year = year;
        this.round = round;
        this.circuitId = circuitId;
        this.name = name;
        this.date = date;
        this.time = time;
        this.url = url;
        this.fp1_date = fp1_date;
        this.fp1_time = fp1_time;
        this.fp2_date = fp2_date;
        this.fp2_time = fp2_time;
        this.fp3_date = fp3_date;
        this.fp3_time = fp3_time;
        this.quali_date = quali_date;
        this.quali_time = quali_time;
        this.sprint_date = sprint_date;
        this.sprint_time = sprint_time;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(Integer circuitId) {
        this.circuitId = circuitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFp1_date() {
        return fp1_date;
    }

    public void setFp1_date(String fp1_date) {
        this.fp1_date = fp1_date;
    }

    public String getFp1_time() {
        return fp1_time;
    }

    public void setFp1_time(String fp1_time) {
        this.fp1_time = fp1_time;
    }

    public String getFp2_date() {
        return fp2_date;
    }

    public void setFp2_date(String fp2_date) {
        this.fp2_date = fp2_date;
    }

    public String getFp2_time() {
        return fp2_time;
    }

    public void setFp2_time(String fp2_time) {
        this.fp2_time = fp2_time;
    }

    public String getFp3_date() {
        return fp3_date;
    }

    public void setFp3_date(String fp3_date) {
        this.fp3_date = fp3_date;
    }

    public String getFp3_time() {
        return fp3_time;
    }

    public void setFp3_time(String fp3_time) {
        this.fp3_time = fp3_time;
    }

    public String getQuali_date() {
        return quali_date;
    }

    public void setQuali_date(String quali_date) {
        this.quali_date = quali_date;
    }

    public String getQuali_time() {
        return quali_time;
    }

    public void setQuali_time(String quali_time) {
        this.quali_time = quali_time;
    }

    public String getSprint_date() {
        return sprint_date;
    }

    public void setSprint_date(String sprint_date) {
        this.sprint_date = sprint_date;
    }

    public String getSprint_time() {
        return sprint_time;
    }

    public void setSprint_time(String sprint_time) {
        this.sprint_time = sprint_time;
    }
}
