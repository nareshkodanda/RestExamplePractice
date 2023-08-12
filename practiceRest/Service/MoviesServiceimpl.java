package com.SpringRest.practiceRest.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.practiceRest.Entities.Movie;
import com.SpringRest.practiceRest.dao.MovieServicedao;

@Service
public class MoviesServiceimpl implements MovieService {
	
	@Autowired
	private MovieServicedao movieServicedao;
    public MoviesServiceimpl() {
//        list = new ArrayList<>();
//
//        list.add(new Movie(1, "Magadheera", "S S Rajamouli"));
//        list.add(new Movie(2, "Attarintilidaredi", "Trivikram"));
//        list.add(new Movie(3, "Bahubali", "S S Rajamouli"));
    	
    	
    }

    @Override
    public List<Movie> getMovies() {
        return movieServicedao.findAll();
    }

	@SuppressWarnings("deprecation")
	@Override
	public Movie getMovie(int movieid) {
		
//		Movie m = null;
//		
//		for(Movie movie:list) {
//			if(movie.getMid()==movieid) {
//				m=movie;
//				break;
//			}
//		}
		
		
		
		
		return movieServicedao.getOne(movieid) ;
	}

	@Override
	public Movie addMovie(Movie movie) {
//		list.add(movie);
		return movieServicedao.save(movie);
	}

	@Override
	public Movie updateMovie(int movieid, Movie movie) {
		
//		for(Movie c:list) {
//			if(c.getMid()==movieid) {
//				c.setMname(movie.getMname());
//				c.setMdirector(movie.getMdirector());
//				return c;
//			}
//		}
//		
		 return movieServicedao.save(movie);
	}

	@Override
	public Movie delMovie(int movieid) {
	    java.util.Optional<Movie> optionalMovie = movieServicedao.findById(movieid);

	    if (optionalMovie.isPresent()) {
	        Movie movieToRemove = optionalMovie.get();
	        movieServicedao.delete(movieToRemove);
	        return movieToRemove; // Movie was found and deleted
	    } else {
	        return null; // Movie with given ID was not found
	    }
	}

    
}
