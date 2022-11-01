package dvdStore.genercInterface;

import dvdStore.entity.Movie;
import org.springframework.stereotype.Component;


public interface MovieServiceInterface {

    void registerMovie(Movie movie);
}
