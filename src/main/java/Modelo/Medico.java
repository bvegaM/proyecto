package Modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Medico {

	@Id
	private int codigo;
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private String clave;
	@OneToOne
	private Rol rol;
	
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name="telefono", referencedColumnName ="codigo")
	private Set<Telefono> telefonos;
	
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name="direccion", referencedColumnName ="codigo")
	private Set<Direccion> direcciones;
	private Date fechaNac;
	
	public void addTelefono(Telefono t) {
		if(this.telefonos==null) {
			this.telefonos=new HashSet<Telefono>();
		}
		this.telefonos.add(t);
	}
	public void addDireccion(Direccion d) {
		if(this.direcciones==null) {
			this.direcciones=new HashSet<Direccion>();
		}
		this.direcciones.add(d);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
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
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Set<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public Set<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(Set<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	@Override
	public String toString() {
		return "Medico [codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", email=" + email + ", clave=" + clave + ", rol=" + rol + ", telefonos=" + telefonos
				+ ", direcciones=" + direcciones + ", fechaNac=" + fechaNac + "]";
	}
	
	
}