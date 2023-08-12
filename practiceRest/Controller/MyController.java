package com.SpringRest.practiceRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.practiceRest.Entities.Movie;

import com.SpringRest.practiceRest.Service.MovieService;

@RestController
public class MyController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/")
	public String home() {
		return "the server is connected";
	}
	
	@GetMapping("/movies")
	public List<Movie> getMovies() {
		
		return  this.movieService.getMovies();
	}
	

    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable int movieId) {
        return this.movieService.getMovie(movieId);
    }
    
    @PostMapping("/movies/addmovie")
    public Movie addMovie(@RequestBody Movie movie) {
    	
    	return this.movieService.addMovie(movie);
    }
    
    
    @PutMapping("/movies/{movieid}")
    public Movie updateMovie(@PathVariable int movieid,@RequestBody Movie movie) {
    	
    	return this.movieService.updateMovie(movieid , movie);
    }
    
    @DeleteMapping("/movies/{movieid}")
    public Movie delMovie(@PathVariable int movieid) {
    	return this.movieService.delMovie(movieid);
    }
  
    	
    
}
