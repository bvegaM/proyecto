package Vista;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Paciente;
import Modelo.Rol;
import Negocio.GestionPacienteLocal;

@ManagedBean
public class GestionPacienteBean {
	
	@Inject
	private GestionPacienteLocal gpl;
	
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private String clave;
	private Date fechaNac;
	private String sexo;
	
	public GestionPacienteLocal getGpl() {
		return gpl;
	}
	public void setGpl(GestionPacienteLocal gpl) {
		this.gpl = gpl;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void guardarPaciente() {
		Paciente paciente = new Paciente();
		paciente.setCodigo(this.gpl.getPacientes().size()+1);
		paciente.setCedula(this.getCedula());
		paciente.setNombre(this.getNombre());
		paciente.setApellido(this.getApellido());
		paciente.setEmail(this.getEmail());
		paciente.setClave(this.getClave());
		paciente.setFechaNac(this.getFechaNac());
		paciente.setSexo(this.getSexo());
		paciente.setRol(this.gpl.obtenerRol(3));
		this.gpl.insertar(paciente);
	}
	
}
