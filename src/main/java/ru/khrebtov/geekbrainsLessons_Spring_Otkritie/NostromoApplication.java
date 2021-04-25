package ru.khrebtov.geekbrainsLessons_Spring_Otkritie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.khrebtov.geekbrainsLessons_Spring_Otkritie.config.NostromoConfiguration;

@SpringBootApplication
@Import(NostromoConfiguration.class)
public class NostromoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NostromoApplication.class, args);
	}

}
