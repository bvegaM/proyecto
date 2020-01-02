package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.RolDAO;
import Modelo.Rol;

@Stateless
public class GestionRol implements GestionRolLocal {
	
	@Inject
	private RolDAO dao;
	
	private List<Rol> roles = new ArrayList<Rol>();
	
	public void insertar(int codigo, String nombre) {
		Rol a = new Rol();
		a.setCodigo(codigo);
		a.setNombre(nombre);

		dao.insertar(a);
	}
	
	public List<Rol> getRoles(){
		return dao.getRoles();
	}
	
	public Rol leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(Rol a) {
		dao.actualizar(a);
	}
}
