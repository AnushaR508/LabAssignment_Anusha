package com.cg.movie.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movie.domain.Movie;
import com.cg.movie.service.MapValidationErrorService;
import com.cg.movie.service.MovieService;


@RestController
@RequestMapping("/api/movie")
public class MovieController {
     @Autowired  
	 private MovieService  movieservice;
     @Autowired
     private MapValidationErrorService mapvalidationservice ;
     
     @PostMapping("/add")
     public ResponseEntity<?> SaveMovie(@Valid @RequestBody Movie movie,BindingResult result){
    	 ResponseEntity<?>  errorMap=mapvalidationservice.mapvalidationError(result);
	    	if(errorMap!=null)
	    		return errorMap;
    	 return new  ResponseEntity<Movie>(movieservice.addMovie(movie),HttpStatus.CREATED);
     }
     
     @DeleteMapping("/{movieId}")
     public void removeMovie(@PathVariable int movieId) {
    	 movieservice.deleteMovie(movieId);
     }
     
     @GetMapping("/all")
     public Iterable<Movie> findAll(){
    	return  movieservice.SearchAllMovies();
     }
     
     @GetMapping("/{genere}")
     public List<Movie>findByGenere(@PathVariable String genere){
    	 return movieservice.serachByGenere(genere);
     }
     
     @PutMapping("")
     public ResponseEntity<?> movieUpdate(@Valid @RequestBody Movie movie,BindingResult result){
    	 ResponseEntity<?>  errorMap=mapvalidationservice.mapvalidationError(result);
	    	if(errorMap!=null)
	    		return errorMap;
    	 return new ResponseEntity<Movie>(movieservice.updateMovie(movie),HttpStatus.OK);
     }
	
}
