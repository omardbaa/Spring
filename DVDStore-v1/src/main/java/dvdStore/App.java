package dvdStore;

import dvdStore.controller.MovieController;
import dvdStore.entity.Movie;
import dvdStore.service.MovieServiceInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * Hello world!
 */
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class App {


    public static void main(String[] args) {

        //ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class, args);

        MovieController movieController = context.getBean(MovieController.class);

        movieController.addUsingConsole();



    }
}