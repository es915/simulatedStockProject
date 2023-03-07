package com.start_up.simulatedStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SimulatedStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulatedStockApplication.class, args);
	}

}
