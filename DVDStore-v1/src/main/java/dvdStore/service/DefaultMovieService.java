package dvdStore.service;

import dvdStore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;

//@Service
public class DefaultMovieService implements MovieServiceInterface {


    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){

        movieRepository.add(movie);
    }
}