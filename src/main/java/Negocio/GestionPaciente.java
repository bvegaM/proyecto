package Negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.PacienteDAO;
import Datos.RolDAO;
import Modelo.Paciente;
import Modelo.Rol;

@Stateless
public class GestionPaciente implements GestionPacienteLocal {
	
	@Inject
	private PacienteDAO pdao;
	@Inject
	private RolDAO rdao;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		System.out.println(paciente.toString());
		pdao.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Paciente leer(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paciente> getPacientes() {
		// TODO Auto-generated method stub
		return pdao.getPacientes();
	}

	@Override
	public Rol obtenerRol() {
		// TODO Auto-generated method stub
		return rdao.leer(1);
	}

}
