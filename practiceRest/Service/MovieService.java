package com.SpringRest.practiceRest.Service;

import java.util.List;

import com.SpringRest.practiceRest.Entities.Movie;

public interface MovieService {
	
	
	public List<Movie> getMovies();
	
	public Movie getMovie(int movieid);
	
	public Movie addMovie(Movie movie);
	
	public Movie updateMovie(int movieid,Movie movie);
	
	public Movie delMovie(int movieid);

}
