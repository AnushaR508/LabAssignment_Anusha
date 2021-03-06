package com.cg.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.movie.exception.*;
import com.cg.movie.domain.Movie;
import com.cg.movie.Repository.MovieRepository;


@Service
public class MovieService {
    
	@Autowired
	private MovieRepository movierepository;
	
	public Movie addMovie(Movie movie) {
		Movie moviee= movierepository.findById(movie.getMovieId());
		if( moviee!=null)
			throw new MovieIdException("Movie is already available");
		return  movierepository.save(movie);
	}
	
	public void deleteMovie(int movieId) {
		Movie movie=movierepository.findById(movieId);
		if(movie==null)
			throw new MovieIdException("Movie is not available");
		movierepository.delete(movie);
	}
	
	public Iterable<Movie> SearchAllMovies(){
		return movierepository.findAll();
	}
	
	public List<Movie> serachByGenere(String genere){
		return  movierepository.findByGenere(genere);
	}
	
	public Movie updateMovie(Movie movie) {
		Movie moviee=movierepository.findById(movie.getMovieId());
		if(moviee==null)
			throw new MovieIdException("Movie is not available");
		return  movierepository.save(movie);
	}
}
