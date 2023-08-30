package com.bgc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bgc.model.Screenmodel;
import com.bgc.repository.Screenrepository;

@Service
public class Screenservice {
	
	@Autowired
	private Screenrepository screenrepository;
	
	public Screenmodel scontroller(Screenmodel scmodel) {
		return screenrepository.save(scmodel);
	}
	
	public List<Screenmodel>getAllData(){
		return (List<Screenmodel>) screenrepository.findAll();
	}
}
