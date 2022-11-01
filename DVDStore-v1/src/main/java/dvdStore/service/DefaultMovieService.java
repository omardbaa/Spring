package dvdStore.service;

import dvdStore.entity.Movie;
import dvdStore.genercInterface.MovieRepositoryInterface;
import dvdStore.genercInterface.MovieServiceInterface;

public class DefaultMovieService implements MovieServiceInterface {


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