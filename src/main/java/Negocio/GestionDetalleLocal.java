package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.Detalle;
import Modelo.Medicina;

@Local
public interface GestionDetalleLocal {

	public void insertar(int codigo, Medicina medicina);
	public void actualizar(Detalle detalle);
	public void borrar(int codigo);
	public Detalle leer(int codigo);
	public List<Detalle> getDetalles();
}
