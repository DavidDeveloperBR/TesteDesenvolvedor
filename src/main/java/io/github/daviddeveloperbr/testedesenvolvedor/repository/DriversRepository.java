package io.github.daviddeveloperbr.testedesenvolvedor.repository;

import io.github.daviddeveloperbr.testedesenvolvedor.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


@Repository
public class DriversRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DriversRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Driver driver){
        return jdbcTemplate.update("insert into driver values (?)", Driver.class);
    }

    public List<Driver> list(){
        return jdbcTemplate.query("select * from driver", new RowMapper<Driver>() {
            @Override
            public Driver mapRow(ResultSet rs, int rowNum) throws SQLException {
                Driver driver = new Driver();
                driver.setDriverId(rs.getInt("driverId"));
                driver.setDriverRef(rs.getString("driverRef"));
                driver.setCode(rs.getString("code"));
                driver.setDob(rs.getString("dob"));
                driver.setForename(rs.getString("forename"));
                driver.setSurname(rs.getString("surname"));
                driver.setNationality(rs.getString("nationality"));
                driver.setNumber(rs.getString("number"));
                driver.setUrl(rs.getString("url"));
                return driver;
            }
        });
    }

    public List<Object> listWinning(){
        return jdbcTemplate.query(
                "SELECT driverRef AS driverId, " +
                        "forename AS givenName," +
                        "surname AS familyName," +
                        "dob AS dateOfBirth," +
                        "nationality," +
                        "COUNT(wins) AS wins "+
                        "FROM DRIVER d " +
                        "JOIN DRIVER_STANDINGS ds ON d.driverId = ds.driverId " +
                        "GROUP BY driverRef " +
                        "HAVING COUNT(wins) >= 1",
                new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Map<String,Object> obj =  new HashMap<>();
                obj.put("driverId",rs.getString("driverId"));
                obj.put("givenName",rs.getString("givenName"));
                obj.put("familyName",rs.getString("familyName"));
                obj.put("dateOfBirth",rs.getString("dateOfBirth"));
                obj.put("nationality",rs.getString("nationality"));
                obj.put("wins",rs.getString("wins"));
                return obj;
            }
        });
    }

    public List<Object> listWinsGap(){
        return jdbcTemplate.query(
                "SELECT d.driverRef AS driverId, " +
                        "d.forename AS givenName," +
                        "d.surname AS familyName," +
                        "d.dob AS dateOfBirth," +
                        "d.nationality," +
                        "(SELECT r.year_races FROM RACES r WHERE r.raceId = rs.raceId) AS firstWin,"+
                        "FROM DRIVER d " +
                        "JOIN RESULTS rs ON d.driverId = rs.driverId"+
                        "JOIN QUALIFYING q ON q.driverId = d.driverId " +
                        "JOIN RACES r ON r.raceId = q.raceId " +
                        "WHERE r.year_races >= MAX(r.year_races) ",
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Map<String,Object> obj =  new HashMap<>();
                        obj.put("driverId",rs.getString("driverId"));
                        obj.put("givenName",rs.getString("givenName"));
                        obj.put("familyName",rs.getString("familyName"));
                        obj.put("dateOfBirth",rs.getString("dateOfBirth"));
                        obj.put("nationality",rs.getString("nationality"));
                        obj.put("firstWin",rs.getString("firstWin"));
                        obj.put("lastWin",rs.getString("lastWin"));
                        return obj;
                    }
                });
    }
    public List<Object> listTeams(){
        return jdbcTemplate.query(
                "SELECT d.driverRef AS driverId," +
                        "d.forename AS givenName," +
                        "d.surname AS familyName," +
                        "d.dob AS dateOfBirth," +
                        "d.nationality," +
                        "ARRAY_AGG(SELECT DISTINCT c.name FROM CONSTRUCTORS c WHERE r.constructorId = c.constructorId)  AS constructors " +
                        "FROM DRIVER d " +
                        "JOIN RESULTS r ON d.driverId = r.driverId " +
                        "GROUP BY d.driverRef ",
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Map<String,Object> obj =  new HashMap<>();
                        obj.put("driverId",rs.getString("driverId"));
                        obj.put("givenName",rs.getString("givenName"));
                        obj.put("familyName",rs.getString("familyName"));
                        obj.put("dateOfBirth",rs.getString("dateOfBirth"));
                        obj.put("nationality",rs.getString("nationality"));
                        obj.put("constructors",rs.getString("constructors"));
                        return obj;
                    }
                });
    }

    public List<Object> listNationalityWins(){
        return jdbcTemplate.query(
                "SELECT  DISTINCT  nationality," +
                        "COUNT(wins) AS wins " +
                        "FROM DRIVER d " +
                        "JOIN DRIVER_STANDINGS ds ON d.driverId = ds.driverId " +
                        "GROUP BY nationality " +
                        "ORDER BY wins DESC",
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Map<String,Object> obj =  new HashMap<>();
                        obj.put("nationality",rs.getString("nationality"));
                        obj.put("wins",rs.getString("wins"));
                        return obj;
                    }
                });
    }

    public List<Object> listDriversSeasonRound(Integer season, Integer round){
        return jdbcTemplate.query(
                "SELECT d.driverRef AS driverId," +
                        "       d.forename AS givenName," +
                        "       d.surname AS familyName," +
                        "       d.dob AS dateOfBirth," +
                        "       d.nationality," +
                        "       c.name AS constructor " +
                        "FROM DRIVER d " +
                        "JOIN QUALIFYING q ON q.driverId = d.driverId " +
                        "JOIN RACES r ON r.raceId = q.raceId " +
                        "JOIN CONSTRUCTORS c ON c.constructorId = q.constructorId " +
                        "WHERE r.year_races="+season +" AND r.round="+round,
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Map<String,Object> obj =  new HashMap<>();
                        obj.put("givenName",rs.getString("givenName"));
                        obj.put("familyName",rs.getString("familyName"));
                        obj.put("dateOfBirth",rs.getString("dateOfBirth"));
                        obj.put("nationality",rs.getString("nationality"));
                        obj.put("constructor",rs.getString("constructor"));
                        return obj;
                    }
                });
    }

}
