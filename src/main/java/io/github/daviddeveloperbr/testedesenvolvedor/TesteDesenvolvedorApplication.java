package io.github.daviddeveloperbr.testedesenvolvedor;

import io.github.daviddeveloperbr.testedesenvolvedor.model.Driver;
import io.github.daviddeveloperbr.testedesenvolvedor.repository.DriversRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

@SpringBootApplication
public class TesteDesenvolvedorApplication extends SpringBootServletInitializer {

    @Bean
    public CommandLineRunner init(@Autowired DriversRepository driversRepository){
        return args -> {
            //driversRepository.save(new Driver(1L,"Rodrigues","2","4","David","Michael",new Date(),"Brasileiro","www.site.com.br"));
        };
    }

    public static void main(String[] args){
        SpringApplication.run(TesteDesenvolvedorApplication.class, args);
    }

}
