package Negocio;

import java.util.List;


import javax.ejb.Local;

import Excepciones.ExceptionDigitalMedical;
import Modelo.Paciente;
import Modelo.Rol;

@Local
public interface GestionPacienteLocal {

	public void insertar(Paciente paciente) throws ExceptionDigitalMedical ;
	public void actualizar(Paciente paciente);
	public void borrar(int codigo);
	public Paciente leer(int codigo) ;
	public List<Paciente> getPacientes();
	public Rol obtenerRol(int codigo);
}