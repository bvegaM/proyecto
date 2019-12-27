package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Medico;

@Local
public interface MedicoLocal {

	public void insertar(Medico medicp);
	public void actualizar(Medico medico);
	public void borrar(int codigo);
	public Medico leer(int codigo);
	public List<Medico> getMedicos();
}