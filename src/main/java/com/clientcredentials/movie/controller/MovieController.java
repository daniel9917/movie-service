package com.clientcredentials.movie.controller;

import com.clientcredentials.movie.model.Movie;
import com.clientcredentials.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@PreAuthorize("hasRole('user_client') or hasRole('admin_client')")
public class MovieController {

    private MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostMapping
    @ResponseBody
    public Movie createMovie(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

    @ResponseBody
    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable int movieId){
        Movie movie = movieRepository.findById(movieId).orElseThrow();
        return movie;
    }


    @ResponseBody
    @PutMapping("/{movieId}")
    public Movie updateMovie(@RequestBody Movie movie, @PathVariable int movieId){
        Movie m = movieRepository.findById(movieId).orElseThrow();
        m = movie;
        m.setId(movieId);
        return movieRepository.save(m);
    }

    @ResponseBody
    @GetMapping("/all")
    public List<Movie> getAllMovies(){
        return movieRepository.getAll();
    }

    @DeleteMapping("/{movieId}")
    public void deleteMovie(@PathVariable int movieId) {
        Movie deleteMovie = movieRepository.findById(movieId).orElseThrow();
        movieRepository.delete(deleteMovie);
    }

}
