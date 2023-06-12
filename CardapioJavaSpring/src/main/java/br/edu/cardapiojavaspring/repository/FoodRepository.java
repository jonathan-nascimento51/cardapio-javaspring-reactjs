package br.edu.cardapiojavaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.cardapiojavaspring.entity.Food;


public interface FoodRepository extends JpaRepository<Food, Long> {

}
