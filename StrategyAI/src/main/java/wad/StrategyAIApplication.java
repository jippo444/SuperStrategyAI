package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class StrategyAIApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyAIApplication.class, args);
    }
}
