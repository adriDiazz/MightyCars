package com.mightycars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightycars.model.DetalleProducto;

public interface DetallesRepository extends JpaRepository<DetalleProducto, Integer> {

}
