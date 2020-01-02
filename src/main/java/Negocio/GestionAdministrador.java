package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.AdministradorDAO;
import Modelo.Administrador;

@Stateless
public class GestionAdministrador implements GestionAdministradorLocal {
	
	@Inject
	private AdministradorDAO dao;
	
	private List<Administrador> administradores = new ArrayList<Administrador>();
	
	public void insertar(int codigo, int cedula, String nombre, String apellido,  String email, String clabe) {
		Administrador a = new Administrador();
		a.setCodigo(codigo);
		a.setCedula(cedula);
		a.setNombre(nombre);
		a.setApellido(apellido);
		a.setEmail(email);
		a.setClabe(clabe);
		dao.insertar(a);
	}
	
	public List<Administrador> getAdministradores(){
		return dao.getAdministradores();
	}
	
	public Administrador leer(int cedula) {
		return dao.leer(cedula);
	}
	
	public void borrar(int cedula) {
		dao.borrar(cedula);
	}
	
	public void actualizar(Administrador a) {
		dao.actualizar(a);
	}
}
