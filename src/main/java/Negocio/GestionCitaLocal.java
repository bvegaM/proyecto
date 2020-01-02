package Negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import Modelo.Cita;
import Modelo.Medico;
import Modelo.Paciente;

@Local
public interface GestionCitaLocal {

	public void insertar(int codigo, Paciente paciente, Medico medico, Date fecha,  Date hora, String estado);
	public void actualizar(Cita cita);
	public void borrar(int codigo);
	public Cita leer(int codigo);
	public List<Cita> getCitas();
}
