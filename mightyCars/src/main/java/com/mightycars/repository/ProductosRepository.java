package com.mightycars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightycars.model.Producto;

public interface ProductosRepository extends JpaRepository<Producto, Integer> {

}
