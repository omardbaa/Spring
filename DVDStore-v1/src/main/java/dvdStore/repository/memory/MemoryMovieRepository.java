package dvdStore.repository.memory;

import dvdStore.entity.Movie;
import dvdStore.service.MovieRepositoryInterface;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
    public void add(Movie movie)
    {
        System.out.println("the movie has been added successfully ");
    }

}
