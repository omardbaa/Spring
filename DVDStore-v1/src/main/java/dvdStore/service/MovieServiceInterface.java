package dvdStore.service;


import dvdStore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    void registerMovie(Movie movie);

    List<Movie> getMovieList();
}
