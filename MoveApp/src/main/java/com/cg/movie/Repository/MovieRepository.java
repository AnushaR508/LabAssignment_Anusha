package com.cg.movie.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.movie.domain.Movie;
@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
  
	Movie  findById(int movieId);
	List<Movie> findByGenere(String genere);
}
