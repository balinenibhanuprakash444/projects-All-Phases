package com.dao1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Feedback;

@Repository
public interface myRepo extends CrudRepository<Feedback, Integer>{


}
