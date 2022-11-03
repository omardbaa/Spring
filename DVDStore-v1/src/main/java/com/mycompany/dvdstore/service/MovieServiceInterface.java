package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {
    void registerMovie(Movie movie);
    List<Movie> getMovieList();

     Movie getMovieById(long id);
}
