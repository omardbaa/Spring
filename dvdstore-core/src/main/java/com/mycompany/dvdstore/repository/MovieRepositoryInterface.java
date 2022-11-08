package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

public interface MovieRepositoryInterface extends CrudRepository<Movie,Long> {
    @EntityGraph(value = "movie.actor-and-reviews", type = EntityGraph.EntityGraphType.FETCH)
    Optional<Movie> findById(Long id);
    /*Movie add(Movie movie);
    List<Movie> list();
   */
}
