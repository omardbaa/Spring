package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Actor;
import com.mycompany.dvdstore.entity.Movie;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ActorRepositoryInterface extends CrudRepository<Actor,Long> {

    /*Movie add(Movie movie);
    List<Movie> list();
   */
}
