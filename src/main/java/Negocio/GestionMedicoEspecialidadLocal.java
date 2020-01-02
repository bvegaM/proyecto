package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Especialidad;
import Modelo.Medico;
import Modelo.MedicoEspecialidad;

@Local
public interface GestionMedicoEspecialidadLocal {

	public void insertar(int codigo, Medico medico, Especialidad especialidad) ;
	public void actualizar(MedicoEspecialidad medicoEspecialidad);
	public void borrar(int codigo);
	public MedicoEspecialidad leer(int codigo) ;
	public List<MedicoEspecialidad> getMedicoEspecialidades();
}