package Servicios;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Modelo.Medicina;
import Modelo.Medico;
import Negocio.GestionMedicinaLocal;
import Negocio.GestionMedicoLocal;

@Path("/practicaws")
public class RestServices {
	
	@Inject
	private GestionMedicoLocal gml;
	
	@Inject
	private GestionMedicinaLocal gmel;
	
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
	@Consumes("application/json")
	@Produces("application/json")
	public String insertarMedicamento(Medicina medicina) {
		this.gmel.insertar(medicina);
		return "OK";
	}

}
