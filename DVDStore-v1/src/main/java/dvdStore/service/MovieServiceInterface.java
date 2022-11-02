package dvdStore.service;

import dvdStore.entity.Movie;
import org.springframework.stereotype.Component;


public interface MovieServiceInterface {

    void registerMovie(Movie movie);
}
