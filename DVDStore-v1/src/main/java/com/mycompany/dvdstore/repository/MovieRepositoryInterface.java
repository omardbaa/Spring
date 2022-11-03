package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    void add(Movie movie);
    List<Movie> list();
}
