package Modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Administrador {

	@Id
	private int codigo;
	private int cedula;
	private String nombre;
	private String apellido;
	private String email;
	private String clabe;
	@OneToOne
	private Rol rol;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClabe() {
		return clabe;
	}
	public void setClabe(String clabe) {
		this.clabe = clabe;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		return "Administrador [codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", email=" + email + ", clabe=" + clabe + ", rol=" + rol + "]";
	}
	
	
}
