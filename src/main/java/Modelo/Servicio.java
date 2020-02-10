package Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Servicio {

	@Id
	private int codigo;
	private String descripción;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	
	@Override
	public String toString() {
		return "Servicio [codigo=" + codigo + ", descripción=" + descripción + "]";
	}
	
	
}
