package Negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Modelo.Certificado;
import Modelo.Direccion;
import Modelo.Historial;
import Modelo.OrdenMedica;
import Modelo.Paciente;
import Modelo.Receta;
import Modelo.Rol;
import Modelo.Telefono;
import Datos.PacienteDAO;
@Stateless
public class GestionPaciente implements GestionPacienteLocal {
	
	@Inject
	private PacienteDAO dao;
	
	private List<Paciente> pacientes = new ArrayList<Paciente>();
	
	public void insertar(int codigo, int cedula, String nombre, String apellido, String email, String clave, Rol rol, Date fechaNac,String sexo,int edad ,Telefono telefonos, Direccion direcciones, Receta recetas, Historial historiales, Certificado certificados, OrdenMedica ordenmedicas) {
		Paciente a = new Paciente();
		a.setCodigo(codigo);
		a.setCedula(cedula);
		a.setNombre(nombre);
		a.setApellido(apellido);
		a.setEmail(email);
		a.setClave(clave);
		a.setRol(rol);
		a.setFechaNac(fechaNac);
		a.setSexo(sexo);
		a.setEdad(edad);
	
		
		
		dao.insertar(a);
	}
	
	public List<Paciente> getPacientes(){
		return dao.getPacientes();
	}
	
	public Paciente leer(int cedula) {
		return dao.leer(cedula);
	}
	
	public void borrar(int cedula) {
		dao.borrar(cedula);
	}
	
	public void actualizar(Paciente a) {
		dao.actualizar(a);
	}
}
