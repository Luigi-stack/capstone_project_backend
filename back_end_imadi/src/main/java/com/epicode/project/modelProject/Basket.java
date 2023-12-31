package com.epicode.project.modelProject;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "baskets")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Basket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	private String image;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	
	public Basket(String name, String description, double price, String image, Categoria categoria) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
		this.categoria = categoria;
	}
	
	
}


