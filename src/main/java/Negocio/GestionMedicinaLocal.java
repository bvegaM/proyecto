package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Medicina;

@Local
public interface GestionMedicinaLocal {

	public void insertar(int codigo, String nombre, String descripcion);
	public void actualizar(Medicina medicina);
	public void borrar(int codigo);
	public Medicina leer(int codigo);
	public List<Medicina> getMedicinas();
}