package br.com.smarthphone.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.smarthphone.projeto.repository.SmartphoneRepository;
import br.com.smarthphone.projeto.model.Smartphone;

@RestController
@CrossOrigin("*")
@RequestMapping("/smartphones")
public class SmartphoneController {
	
	@Autowired
	private SmartphoneRepository repository;
	
	@GetMapping
	public List<Smartphone> listarSmartphones() {
		return (List<Smartphone>) repository.findAll();
	}

}
