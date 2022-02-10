package com.mightycars.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Producto {
	
	@Id
	private int id;
	private String marca;
	private String combustible;
	private String aspiracion;
	private int cant_puertas;
	private String estilo_cuerpo;
	private String traccion;
	private String ubicacion_motor;
	private String tipo_motor;
	private int cilindros;
	private int tamano_motor;
	private int c_fuerza;
	private int max_rpm;
	private int precio;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getCombustible() {
		return combustible;
	}
	
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public String getAspiracion() {
		return aspiracion;
	}
	
	public void setAspiracion(String aspiracion) {
		this.aspiracion = aspiracion;
	}
	
	public int getCant_puertas() {
		return cant_puertas;
	}
	
	public void setCant_puertas(int cant_puertas) {
		this.cant_puertas = cant_puertas;
	}
	
	public String getEstilo_cuerpo() {
		return estilo_cuerpo;
	}
	
	public void setEstilo_cuerpo(String estilo_cuerpo) {
		this.estilo_cuerpo = estilo_cuerpo;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public String getUbicacion_motor() {
		return ubicacion_motor;
	}
	
	public void setUbicacion_motor(String ubicacion_motor) {
		this.ubicacion_motor = ubicacion_motor;
	}
	
	public String getTipo_motor() {
		return tipo_motor;
	}
	
	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}
	
	public int getCilindros() {
		return cilindros;
	}
	
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	
	public int getTamano_motor() {
		return tamano_motor;
	}
	
	public void setTamano_motor(int tamano_motor) {
		this.tamano_motor = tamano_motor;
	}
	
	public int getC_fuerza() {
		return c_fuerza;
	}
	
	public void setC_fuerza(int c_fuerza) {
		this.c_fuerza = c_fuerza;
	}
	
	public int getMax_rpm() {
		return max_rpm;
	}
	
	public void setMax_rpm(int max_rpm) {
		this.max_rpm = max_rpm;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", marca=" + marca + ", combustible=" + combustible + ", aspiracion=" + aspiracion
				+ ", cant_puertas=" + cant_puertas + ", estilo_cuerpo=" + estilo_cuerpo + ", traccion=" + traccion
				+ ", ubicacion_motor=" + ubicacion_motor + ", tipo_motor=" + tipo_motor + ", cilindros=" + cilindros
				+ ", tamano_motor=" + tamano_motor + ", c_fuerza=" + c_fuerza + ", max_rpm=" + max_rpm + ", precio="
				+ precio + "]";
	}

	
	

}
