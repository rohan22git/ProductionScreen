package com.bgc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bgc.model.Screenmodel;

@Repository
public interface Screenrepository extends CrudRepository<Screenmodel, Integer>{

}
