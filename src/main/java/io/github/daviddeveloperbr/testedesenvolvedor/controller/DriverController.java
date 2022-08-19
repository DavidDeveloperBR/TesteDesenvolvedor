package io.github.daviddeveloperbr.testedesenvolvedor.controller;

import io.github.daviddeveloperbr.testedesenvolvedor.model.Driver;
import io.github.daviddeveloperbr.testedesenvolvedor.service.DriversService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    private DriversService service;

    public DriverController(DriversService service){
        this.service = service;
    }

    @GetMapping("{id}")
    public Driver getDriverById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Driver save(@RequestBody Driver driver){
        return null;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){

    }

    @PutMapping("{id}")
    public void update( @PathVariable Integer id, @RequestBody Driver driver){
    }

    @GetMapping("/winning")
    public List<Object> findAllWinningOnce( ){
        return service.listWinning();
    }

//    @GetMapping("/wins-gap")
//    public List<Object> findWinGap( ){
//        return service.winGap();
//    }

    @GetMapping
    public List<Driver> find( ) {
        return service.listDriver();
    }

    @GetMapping("/teams")
    public List<Object> teams() {
        return service.findTeams();
    }

    @GetMapping("/nationalities/wins")
    public List<Object> nationalitiesWins() {
        return service.findAllNationalityWins();
    }

    @GetMapping("/races/{season}/{round}")
    public List<Object> findDriversSeasonRound(@PathVariable Integer season, @PathVariable Integer round){
        return service.findAllDriversSeasonRound(season, round);
    }
}
