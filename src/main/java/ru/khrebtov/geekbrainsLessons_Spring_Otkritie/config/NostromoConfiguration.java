package ru.khrebtov.geekbrainsLessons_Spring_Otkritie.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.khrebtov.geekbrainsLessons_Spring_Otkritie.entity.Rover;
import ru.khrebtov.geekbrainsLessons_Spring_Otkritie.entity.repository.RoverRepository;

@Configuration
@Slf4j
public class NostromoConfiguration {

    @Bean
    public CommandLineRunner loadService(RoverRepository roverRepository) {
        return args -> {
            log.info("Start load data");
            log.info("Data={}", roverRepository.save(new Rover("Vasya", "3Po")));
            log.info("Data={}", roverRepository.save(new Rover("Vasya2", "3Po2")));
            log.info("Data={}", roverRepository.save(new Rover("Vasya3", "3Po3")));
            log.info("Data was loaded");
        };
    }
}
