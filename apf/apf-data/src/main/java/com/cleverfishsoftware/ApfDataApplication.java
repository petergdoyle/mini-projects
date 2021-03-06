package com.cleverfishsoftware;

import com.cleverfishsoftware.db2.sample.Suppliers;
import com.cleverfishsoftware.db2.sample.SuppliersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApfDataApplication {

    private static final Logger log = LoggerFactory.getLogger(ApfDataApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ApfDataApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(SuppliersRepository repository) {
        return (args) -> {
            // save a couple of Suppliers
            repository.save(new Suppliers("A"));
            repository.save(new Suppliers("B"));
            repository.save(new Suppliers("C"));
            repository.save(new Suppliers("D"));
            repository.save(new Suppliers("E"));

            // fetch all Suppliers
            log.info("Suppliers found with findAll():");
            log.info("-------------------------------");
            repository.findAll().stream().forEach((s) -> {
                log.info(s.toString());
            });
            log.info("");

            // fetch a Suppliers
            Suppliers s = repository.findOne("A");
            log.info("Supplier found with findOne(\"A\")");
            log.info("--------------------------------");
            log.info(s.toString());
            log.info("");

        };
    }

}
