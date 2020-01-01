package Vista;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Administrador;
import Modelo.Medico;
import Modelo.Paciente;
import Negocio.GestionAdministradorLocal;
import Negocio.GestionMedicoLocal;
import Negocio.GestionPacienteLocal;
@ManagedBean
public class GestionLoginBean {
	
	@Inject
	private GestionPacienteLocal gpl;	
	@Inject
	private GestionMedicoLocal gml;
	@Inject
	private GestionAdministradorLocal gal;
	private String email;
	private String contrasena;

	public GestionPacienteLocal getGpl() {
		return gpl;
	}
	public void setGpl(GestionPacienteLocal gpl) {
		this.gpl = gpl;
	}
	
	public GestionMedicoLocal getGml() {
		return gml;
	}
	public void setGml(GestionMedicoLocal gml) {
		this.gml = gml;
	}
	public GestionAdministradorLocal getGal() {
		return gal;
	}
	public void setGal(GestionAdministradorLocal gal) {
		this.gal = gal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public String iniciarSesion() {
		
		boolean paciente= this.validarLoginPaciente();
		boolean medico=this.validarLoginMedico();
		boolean administrador=this.validarLoginAdministrador();
		
		if(paciente == true) {
			return "index2.html";
		}else if(medico == true) {
			return "index.html";
		}else if(administrador == true) {
			return "index3.html";
		}
		
		return null;
	}
	
	public boolean validarLoginPaciente() {
		List<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes = this.gpl.getPacientes();
		for(Paciente p: pacientes) {
			if(p.getEmail().equals(this.getEmail()) && p.getClave().equals(this.getContrasena())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validarLoginMedico() {
		List<Medico> medicos =new ArrayList<Medico>();
		medicos= this.gml.getMedicos();
		for(Medico m: medicos) {
			if(m.getEmail().equals(this.getEmail()) && m.getClave().equals(this.getContrasena())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean validarLoginAdministrador() {
		List<Administrador> administradores= new ArrayList<Administrador>();
		administradores=this.gal.getAdministradores();
		for(Administrador a:administradores) {
			if(a.getEmail().equals(this.getEmail()) && a.getClave().equals(this.getContrasena())) {
				return true;
			}
		}
		return false;
	}
	

}
