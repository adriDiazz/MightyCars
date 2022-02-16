package com.mightycars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	@GetMapping("/productos") 
	public List<Producto> productos() {
		return productoService.obtenerProductos();
	}
	
	@GetMapping("/detalle-productoss") 
	public List<DetalleProducto> detalleProductos() {
		return detalleService.obtenerDetalles();
	}

}


