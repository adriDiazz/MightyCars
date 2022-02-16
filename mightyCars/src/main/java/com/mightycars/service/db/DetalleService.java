package com.mightycars.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightycars.model.DetalleProducto;
import com.mightycars.repository.DetallesRepository;
import com.mightycars.service.IDetalleService;

@Service
public class DetalleService implements IDetalleService {
	
	@Autowired
	private DetallesRepository detalleRepo;

	@Override
	public List<DetalleProducto> obtenerDetalles() {
		
		return detalleRepo.findAll();
	}

}
