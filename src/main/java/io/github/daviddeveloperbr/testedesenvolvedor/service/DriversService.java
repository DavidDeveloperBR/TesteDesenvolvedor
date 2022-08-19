package io.github.daviddeveloperbr.testedesenvolvedor.service;

import io.github.daviddeveloperbr.testedesenvolvedor.model.Driver;
import io.github.daviddeveloperbr.testedesenvolvedor.repository.DriversRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class  DriversService {

    private DriversRepository repository;

    @Autowired
    public DriversService(DriversRepository repository){
        this.repository = repository;

    }
    public void saveDriver(Driver driver){
        repository.save(driver);
    };

    public void deleteDriver(Driver driver){

    };

    public Driver findOneDriver(Driver driver){
        return null;
    };

    public List<Driver> listDriver(){
        return repository.list();
    };

    public List<Object> listWinning(){
        return repository.listWinning();
    };

    public List<Object> winGap(){
        return repository.listWinsGap();
    }

    public List<Object> findTeams(){
        return repository.listTeams();
    }

    public List<Object> findAllNationalityWins(){
        return repository.listNationalityWins();
    }

    public List<Object> findAllDriversSeasonRound(Integer season, Integer round){
        return repository.listDriversSeasonRound(season, round);
    }
}
