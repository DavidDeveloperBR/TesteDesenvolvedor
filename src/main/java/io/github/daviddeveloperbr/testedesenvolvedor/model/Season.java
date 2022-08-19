package io.github.daviddeveloperbr.testedesenvolvedor.model;

public class Season {

    private Integer id;
    private Integer year;
    private String url;

    public Season() {
    }

    public Season(Integer id, Integer year, String url) {
        this.id = id;
        this.year = year;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
