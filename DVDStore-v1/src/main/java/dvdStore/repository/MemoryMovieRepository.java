package dvdStore.repository;

import dvdStore.entity.Movie;
import dvdStore.genercInterface.MovieRepositoryInterface;

public class MemoryMovieRepository implements MovieRepositoryInterface {
    public void add(Movie movie) {
        System.out.println("the movie has been added successfully ");
    }

}
