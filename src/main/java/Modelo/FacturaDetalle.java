package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FacturaDetalle {

	@Id
	@GeneratedValue
	private int numeroDetalle;
	private int cantidad;
	@OneToOne
	private Servicio servicio;
	private double precio;
	private String estado;
	
	public int getNumeroDetalle() {
		return numeroDetalle;
	}
	public void setNumeroDetalle(int numeroDetalle) {
		this.numeroDetalle = numeroDetalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "FacturaDetalle [numeroDetalle=" + numeroDetalle + ", cantidad=" + cantidad + ", servicio=" + servicio
				+ ", precio=" + precio + ", estado=" + estado + "]";
	}
	
	
	
	
}
