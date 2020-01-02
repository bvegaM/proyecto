package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Administrador;

@Local
public interface GestionAdministradorLocal {

	public void insertar(int codigo, int cedula, String nombre, String apellido,  String email, String clabe);
	public List<Administrador> getAdministradores();
	public Administrador leer(int cedula);
	public void borrar(int cedula);
	public void actualizar(Administrador administrador);
}
