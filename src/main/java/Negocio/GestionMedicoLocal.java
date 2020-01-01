package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Medico;

@Local
public interface GestionMedicoLocal {

	public void insertar(Medico medico);
	public void actualizar(Medico medico);
	public void borrar(String cedula);
	public Medico leer(String cedula);
	public List<Medico> getMedicos();
}
