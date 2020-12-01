package com.cg.trainee.Repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.trainee.domain.Trainee;
@Repository
public interface TraineeRepository extends CrudRepository<Trainee,Integer>{
	Trainee findByTraineeId(int id) ;	
     List<Trainee> findByTraineeDomain(String traineeDomain);
	}

