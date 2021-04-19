package com.architecture.gambi.controlecorridasclean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = {"com.architecture.gambi.controlecorridasclean"})
@SpringBootApplication
public class CtrlcorredorV7Application {

	public static void main(String[] args) {
		SpringApplication.run(CtrlcorredorV7Application.class, args);
	}

}
