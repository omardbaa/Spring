package dvdStore.repository.memory;

import dvdStore.entity.Movie;
import dvdStore.genercInterface.MovieRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {
    public void add(Movie movie) {
        System.out.println("the movie has been added successfully ");
    }

}
