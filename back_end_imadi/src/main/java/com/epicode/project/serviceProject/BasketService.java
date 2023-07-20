package com.epicode.project.serviceProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.project.modelProject.Basket;
import com.epicode.project.modelProject.Categoria;
import com.epicode.project.repositoryProject.BasketRepository;

@Service
public class BasketService {

@Autowired BasketRepository basketRepository;


public Basket Salva(Basket basket) {
	
	return basketRepository.save(basket);
	
}

public String Elimina(Long id) {
	
	basketRepository.deleteById(id);
	return "Prodotto Eliminato";
	
}

public String GetBYId(Long id) {
	
	basketRepository.findById(id);
	return "Prodotto Trovato";
	
}

public List <Basket> GetAll() {
	
	return basketRepository.findAll();
	
}

public Basket Modifica(Basket basket) {
	
	return basketRepository.save(basket);
	
}

public String EliminaTutto() {
	
	basketRepository.deleteAll();
	return "Tutti i prodotti sono eliminati";
	
}

//public List <Basket> GetByCategory (Categoria categoria){
//	
//	return basketRepository.GetByCategory(categoria);
//	
//}
	
}
