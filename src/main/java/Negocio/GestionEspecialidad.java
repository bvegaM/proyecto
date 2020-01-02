package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.EspecialidadDAO;
import Modelo.Especialidad;


@Stateless
public class GestionEspecialidad implements GestionEspecialidadLocal {
	
	@Inject
	private EspecialidadDAO dao;
	
	private List<Especialidad> especialidades = new ArrayList<Especialidad>();
	
	public void insertar(int codigo, String nombre) {
		Especialidad e = new Especialidad();
		e.setCodigo(codigo);
		e.setNombre(nombre);
	
		dao.insertar(e);
	}
	
	public List<Especialidad> getEspecialidades(){
		return dao.getEspecialidades();
	}
	
	public Especialidad leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(Especialidad e) {
		dao.actualizar(e);
	}
}
