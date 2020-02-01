package Modelo;

public class FacturaDetalle {

	private String numeroDetalle;
	private int cantidad;
	private Servicio servicio;
	
	
	public String getNumeroDetalle() {
		return numeroDetalle;
	}
	public void setNumeroDetalle(String numeroDetalle) {
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
	
	@Override
	public String toString() {
		return "FacturaDetalle [numeroDetalle=" + numeroDetalle + ", cantidad=" + cantidad + ", servicio=" + servicio
				+ "]";
	}
	
	
}
