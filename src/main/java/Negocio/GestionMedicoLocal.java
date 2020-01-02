package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Direccion;
import Modelo.Medico;
import Modelo.Rol;
import Modelo.Telefono;

@Local
public interface GestionMedicoLocal {

	public void insertar(int codigo, int cedula, String nombre, String apellido, String email, String clave, Rol rol, Telefono telefonos, Direccion direcciones);
	public void actualizar(Medico medico);
	public void borrar(int codigo);
	public Medico leer(int codigo);
	public List<Medico> getMedicos();
}