package dvdStore.repository;


import dvdStore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    void add(Movie movie);
    List<Movie> list();
}
