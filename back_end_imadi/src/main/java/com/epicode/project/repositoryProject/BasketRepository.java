package com.epicode.project.repositoryProject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.project.modelProject.Basket;
import com.epicode.project.modelProject.Categoria;

public interface BasketRepository extends JpaRepository<Basket, Long> {

//	 List <Basket> GetByCategory(Categoria categoria);
	
}
