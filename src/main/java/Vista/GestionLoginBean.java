package Vista;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Paciente;
import Negocio.GestionPacienteLocal;

@ManagedBean
public class GestionLoginBean {
	
	@Inject
	private GestionPacienteLocal gpl;
	
	private String email;
	private String contrasena;
	
	public GestionPacienteLocal getGpl() {
		return gpl;
	}
	public void setGpl(GestionPacienteLocal gpl) {
		this.gpl = gpl;
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
		
		List<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes = this.gpl.getPacientes();
		for(Paciente p : pacientes) {
			if(p.getEmail().equals(this.getEmail()) && p.getClave().equals(this.getContrasena())) {
					if(p.getRol().getCodigo()==1) {
						return "index2.html";
					}else {
						System.out.println(p.toString());
						return "index.html";
					}
						
			}
		}
		return "index.html";
	}
	
	

}
