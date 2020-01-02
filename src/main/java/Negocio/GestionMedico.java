package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Modelo.Direccion;
import Modelo.Medico;
import Modelo.Rol;
import Modelo.Telefono;
import Datos.MedicoDAO;
@Stateless
public class GestionMedico implements GestionMedicoLocal {
	
	@Inject
	private MedicoDAO dao;
	
	private List<Medico> medicos = new ArrayList<Medico>();
	
	public void insertar(int codigo, int cedula, String nombre, String apellido, String email, String clave, Rol rol, Telefono telefonos, Direccion direcciones) {
		Medico a = new Medico();
		a.setCodigo(codigo);
		a.setCedula(cedula);
		a.setNombre(nombre);
		a.setApellido(apellido);
		a.setEmail(email);
		a.setClave(clave);
		a.setRol(rol);
		a.addDireccion(direcciones);
		a.addTelefono(telefonos);
		
		
		dao.insertar(a);
	}
	
	public List<Medico> getMedicos(){
		return dao.getMedicos();
	}
	
	public Medico leer(int cedula) {
		return dao.leer(cedula);
	}
	
	public void borrar(int cedula) {
		dao.borrar(cedula);
	}
	
	public void actualizar(Medico a) {
		dao.actualizar(a);
	}
}
