package com.epicode.project.controllerProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.project.modelProject.Basket;
import com.epicode.project.modelProject.Categoria;
import com.epicode.project.serviceProject.BasketService;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/api/basket")
public class BasketController {
	
	@Autowired BasketService basketService;
	
	@GetMapping
	public List <Basket> GetAll(){
		
		return basketService.GetAll();
	}
	
	@GetMapping("/{id}")
	public String GetBYId(@PathVariable Long id) {
		return basketService.GetBYId(id);
	} 
	
	@PostMapping
	public Basket Salva(@RequestBody Basket basket) {
		
		return basketService.Salva(basket);
		
	}
	
	@PutMapping("/{id}")
	public Basket Modifica(@RequestBody Basket basket) {
		
		return basketService.Modifica(basket);
		
	}
	
//	@DeleteMapping("/{id}")
//	public String Elimina(@PathVariable Long id) {
//		
//		return basketService.Elimina(id);
//		
//	}
	
	@DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id) {
        return ResponseEntity.ok(basketService.Elimina(id));
    }

	
	@DeleteMapping("eliminazione")
	public String Elimina() {
		
		return basketService.EliminaTutto();
		
	}

//	@GetMapping("/categoria/{categoria}")
//	public List <Basket> GetByCategory (@PathVariable("categoria") Categoria categoria) {
//		return basketService.GetByCategory(categoria);
//	}
	

}
