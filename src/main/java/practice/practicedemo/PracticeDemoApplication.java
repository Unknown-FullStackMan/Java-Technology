package practice.practicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableAsync
@EnableScheduling
@ImportResource(locations = {"classpath:beans.xml"})
public class PracticeDemoApplication {

    public static void main(String[] args) {
         SpringApplication.run(PracticeDemoApplication.class, args);
    }

}
