package edu.escuelaing.arsw.ASE.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Spring Boot application.
 * This class serves as the entry point for the application.
 */
@SpringBootApplication
public class CalculatorApp {

    /**
     * The main method that launches the Spring Boot application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(CalculatorApp.class, args);
    }

}