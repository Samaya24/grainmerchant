package com.isu.graduateproject.grainmerchant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.isu.graduateproject.grainmerchant.dao.Grain;
import com.isu.graduateproject.grainmerchant.service.GrainService;

@Controller
public class GrainsController {
	
	private GrainService grainService;
	
	@Autowired
	public void setGrainService(GrainService grainService) {
		this.grainService = grainService;
	}

	@RequestMapping("/grains")
	public String grains(Model model){
		
		List<Grain> grains = grainService.getAllGrains();
		
		model.addAttribute("grains", grains);
		return "grains";
	}
}
