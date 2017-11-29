package com.isu.graduateproject.grainmerchant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isu.graduateproject.grainmerchant.dao.Grain;
import com.isu.graduateproject.grainmerchant.dao.GrainDao;

@Service("grainService")
public class GrainService {
	
	private GrainDao grainDao;
	
	@Autowired
	public void setGrainDao(GrainDao grainDao) {
		this.grainDao = grainDao;
	}

	public List<Grain> getAllGrains(){
		return grainDao.getAllGrains();
	}

}
