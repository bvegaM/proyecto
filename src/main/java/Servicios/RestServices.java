package Servicios;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Modelo.Medicina;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Rol;
import Negocio.GestionMedicinaLocal;
import Negocio.GestionMedicoLocal;
import Negocio.GestionPacienteLocal;
import Negocio.GestionRolLocal;

@Path("/practicaws")
public class RestServices {
	
	@Inject
	private GestionPacienteLocal gml;
	
	@Inject
	private GestionMedicinaLocal gmel;
	
	@Inject
	private GestionRolLocal grl;
	
	@POST
	@Path("/crearPaciente")
	@Consumes("application/json")
	@Produces("application/json")
	public String insertarPaciente(Paciente paciente) {
		this.gml.insertar(paciente);
		return "OK";
	}
	
	@POST
	@Path("/crearRol")
	@Consumes("application/json")
	@Produces("application/json")
	public String insertarRol(Rol rol) {
		this.grl.insertar(rol);
		return "OK";
	}
	
	@GET
	@Path("/listarRol")
	@Produces("application/json")
	public List<Rol> listarRol() {
		return this.grl.getRoles();
	}

}
