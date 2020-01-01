package Vista;


import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Medico;
import Negocio.GestionMedicoLocal;
import Negocio.GestionRolLocal;

@ManagedBean
public class GestionMedicoBean {
	
	@Inject
	private GestionMedicoLocal gml;
	
	@Inject
	private GestionRolLocal grl;
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private String clave;
	private Date fechaNac;
	
	
	public GestionMedicoLocal getGml() {
		return gml;
	}
	public void setGml(GestionMedicoLocal gml) {
		this.gml = gml;
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public void guardarMedico() {
		Medico medico = new Medico();
		medico.setCodigo(this.gml.getMedicos().size()+1);
		medico.setCedula(this.getCedula());
		medico.setNombre(this.getNombre());
		medico.setApellido(this.getApellido());
		medico.setEmail(this.getEmail());
		medico.setClave(this.getClave());
		medico.setFechaNac(this.getFechaNac());
		medico.setRol(this.grl.leer(2));
		this.gml.insertar(medico);
	}
	
	
	
}
