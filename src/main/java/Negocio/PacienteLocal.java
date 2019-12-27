package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Paciente;

@Local
public interface PacienteLocal {

	public void insertar(Paciente paciente) ;
	public void actualizar(Paciente paciente);
	public void borrar(String cedula);
	public Paciente leer(String cedula) ;
	public List<Paciente> getPacientes();
}