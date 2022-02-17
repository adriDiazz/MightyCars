package com.mightycars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mightycars.model.DetalleProducto;
import com.mightycars.model.Producto;
import com.mightycars.service.IDetalleService;
import com.mightycars.service.IProductosService;

@RestController
public class ProductosController {
	
	@Autowired
	private IDetalleService detalleService;
	
	@Autowired
	private IProductosService productoService;
	
	//@CrossOrigin(origins = "https://mightycars.herokuapp.com/")
	@GetMapping("/productos") 
	public List<Producto> productos() {
		return productoService.obtenerProductos();
	}
	
	//@CrossOrigin(origins = "https://mightycars.herokuapp.com/")
	@GetMapping("/detalle-productos") 
	public List<DetalleProducto> detalleProductos() {
		return detalleService.obtenerDetalles();
	}

}


