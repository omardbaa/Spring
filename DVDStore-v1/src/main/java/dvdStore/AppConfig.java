package dvdStore;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"dvdStore.repository.file.FileMovieRepository",
        "dvdStore.service.DefaultMovieService",
        "dvdStore.controller.movie.MovieController"})
@PropertySource("classpath:application.properties")
public class AppConfig {


}
