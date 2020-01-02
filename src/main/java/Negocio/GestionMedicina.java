package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.MedicinaDAO;
import Modelo.Medicina;


@Stateless
public class GestionMedicina implements GestionMedicinaLocal {
	
	@Inject
	private MedicinaDAO dao;
	
	private List<Medicina> medicinas = new ArrayList<Medicina>();
	
	public void insertar(int codigo, String nombre, String descripcion) {
		Medicina m = new Medicina();
		m.setCodigo(codigo);
		m.setNombre(nombre);
		m.setDescripcion(descripcion);
		dao.insertar(m);
	}
	
	public List<Medicina> getMedicinas(){
		return dao.getMedicinas();
	}
	
	public Medicina leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(Medicina m) {
		dao.actualizar(m);
	}
}
