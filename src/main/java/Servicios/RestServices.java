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
import Modelo.Rol;
import Negocio.GestionMedicinaLocal;
import Negocio.GestionMedicoLocal;
import Negocio.GestionRolLocal;

@Path("/practicaws")
public class RestServices {
	
	@Inject
	private GestionMedicoLocal gml;
	
	@Inject
	private GestionMedicinaLocal gmel;
	
	@Inject
	private GestionRolLocal grl;
	
	@POST
	@Path("/crearMedico")
	@Consumes("application/json")
	@Produces("application/json")
	public String insertarMedico(Medico medico) {
		this.gml.insertar(medico);
		return "OK";
	}
	
	@POST
	@Path("/crearMedicamento")
	@Produces("application/json")
	@Consumes("application/json")
	public String insertarMedicamento(Medicina medicina) {
		this.gmel.insertar(medicina);
		return "OK";
	}
	
	@GET
	@Path("/listarRol")
	@Produces("application/json")
	public List<Rol> listarRol() {
		return this.grl.getRoles();
	}

}
