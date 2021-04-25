package ru.khrebtov.geekbrainsLessons_Spring_Otkritie.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.khrebtov.geekbrainsLessons_Spring_Otkritie.entity.Rover;

public interface RoverRepository extends JpaRepository<Rover, Long> {
}
