package com.mightycars.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightycars.model.Producto;
import com.mightycars.repository.ProductosRepository;
import com.mightycars.service.IProductosService;

@Service
public class ProductoService implements IProductosService {
	
	@Autowired
	private ProductosRepository productRepo;

	@Override
	public List<Producto> buscarTodas() {
		
		return productRepo.findAll();
	}

}
