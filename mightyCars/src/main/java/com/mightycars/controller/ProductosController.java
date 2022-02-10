package com.mightycars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mightycars.model.Producto;
import com.mightycars.service.IProductosService;


@RestController
public class ProductosController {
	
	@Autowired
	private IProductosService serviceProductos;
	
	@GetMapping("/")
	public List<Producto> mostrarProductos() {
		
		return serviceProductos.buscarTodas();
		
	}
}
