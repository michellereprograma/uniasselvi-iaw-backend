package br.com.smarthphone.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.smarthphone.projeto.model.Smartphone;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
}
