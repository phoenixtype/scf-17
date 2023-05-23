package dev.phoenixtype.scf17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class Scf17Application {

    public static void main(String[] args) {
        SpringApplication.run(Scf17Application.class, args);
    }

    @Bean
    public Function<String, String> reverse() {
        return (s -> String.valueOf(new StringBuilder(s).reverse()));
    }

}
