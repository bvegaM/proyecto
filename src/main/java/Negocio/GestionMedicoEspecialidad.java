package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.MedicoEspecialidadDAO;
import Modelo.Especialidad;
import Modelo.Medico;
import Modelo.MedicoEspecialidad;

@Stateless
public class GestionMedicoEspecialidad implements GestionMedicoEspecialidadLocal {
	
	@Inject
	private MedicoEspecialidadDAO dao;
	
	private List<MedicoEspecialidad> medicoEspecialidades = new ArrayList<MedicoEspecialidad>();
	
	public void insertar(int codigo, Medico medico, Especialidad especialidad) {
		MedicoEspecialidad a = new MedicoEspecialidad();
		a.setCodigo(codigo);
		a.setMedico(medico);
		a.setEspecialidad(especialidad);

		dao.insertar(a);
	}
	
	public List<MedicoEspecialidad> getMedicoEspecialidades(){
		return dao.getMedicoEspecialidades();
	}
	
	public MedicoEspecialidad leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(MedicoEspecialidad a) {
		dao.actualizar(a);
	}
}
