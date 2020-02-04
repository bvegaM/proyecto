package Servicios;

import java.util.List;


import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import Modelo.Administrador;
import Modelo.Paciente;
import Negocio.GestionPacienteLocal;

@WebService
public class PacienteServiceSoap {
	
	@Inject
	private GestionPacienteLocal gl;
	
	@WebMethod
	public Respuesta crearPaciente(Paciente paciente) {
		Respuesta respuesta = new Respuesta();
		
		try {
			gl.insertar(paciente);
			respuesta.setCodigo(50);
			respuesta.setMensaje("Creado paciente correctamente");
		}catch(Exception e) {
			respuesta.setCodigo(69);
			respuesta.setMensaje("ERROR al crear paciente");
		}	
		return respuesta;
	}
	
	@WebMethod
	public List<Paciente> listaPacientes(){
		return this.gl.getPacientes();
	}
}
