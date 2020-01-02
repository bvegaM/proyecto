
package Negocio;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.CitaDAO;
import Modelo.Cita;
import Modelo.Medico;
import Modelo.Paciente;

@Stateless
public class GestionCita implements GestionCitaLocal {
	
	@Inject
	private CitaDAO dao;
	
	private List<Cita> citas = new ArrayList<Cita>();
	
	public void insertar(int codigo, Paciente paciente, Medico medico, Date fecha,  Date hora, String estado) {
		Cita c = new Cita();
		c.setCodigo(codigo);
		c.setPaciente(paciente);
		c.setMedico(medico);
		c.setFecha(fecha);
		c.setHora(hora);
		c.setEstado(estado);
		dao.insertar(c);
	}
	
	public List<Cita> getCitas(){
		return dao.getCitas();
	}
	
	public Cita leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(Cita c) {
		dao.actualizar(c);
	}
}
