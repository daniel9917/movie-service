package com.clientcredentials.movie.repository;

import com.clientcredentials.movie.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query(value = "SELECT * FROM movie", nativeQuery = true)
    List<Movie> getAll();
}
