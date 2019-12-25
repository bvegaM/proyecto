package Negocio;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paciente {

	@Id
	private int codigo;
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private String clave;
	private Rol rol;
	private Date fechaNac;
	private String sexo;
	private int edad;
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	private List<Telefono> telefonos;
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	private List<Direccion> direcciones;
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	private List<Receta> recetas;
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	private List<Historial> historiales;
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	private List<Certificado> certificados;
	@OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
	private List<OrdenMedica> ordenesMedicas;
	
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public List<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	public List<Receta> getRecetas() {
		return recetas;
	}
	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}
	public List<Historial> getHistoriales() {
		return historiales;
	}
	public void setHistoriales(List<Historial> historiales) {
		this.historiales = historiales;
	}
	public List<Certificado> getCertificados() {
		return certificados;
	}
	public void setCertificados(List<Certificado> certificados) {
		this.certificados = certificados;
	}
	public List<OrdenMedica> getOrdenesMedicas() {
		return ordenesMedicas;
	}
	public void setOrdenesMedicas(List<OrdenMedica> ordenesMedicas) {
		this.ordenesMedicas = ordenesMedicas;
	}
	
	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", email=" + email + ", clave=" + clave + ", rol=" + rol + ", fechaNac=" + fechaNac + ", sexo=" + sexo
				+ ", edad=" + edad + ", telefonos=" + telefonos + ", direcciones=" + direcciones + ", recetas="
				+ recetas + ", historiales=" + historiales + ", certificados=" + certificados + ", ordenesMedicas="
				+ ordenesMedicas + "]";
	}
	
	
	
	
}
