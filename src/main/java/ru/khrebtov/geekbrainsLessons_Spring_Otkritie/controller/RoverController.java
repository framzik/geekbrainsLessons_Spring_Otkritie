package ru.khrebtov.geekbrainsLessons_Spring_Otkritie.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.khrebtov.geekbrainsLessons_Spring_Otkritie.entity.Rover;
import ru.khrebtov.geekbrainsLessons_Spring_Otkritie.service.RoverService;

import java.util.List;

@RestController
public class RoverController {

    private final RoverService roverService;

    public RoverController(RoverService roverService) {
        this.roverService = roverService;
    }

    @RequestMapping(value = "/rover/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Rover> getAllRovers(){
        return roverService.getAllRovers();
    }
}
