package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.TipoOrdenMedica;

@Local
public interface GestionTipoOrdenMedicaLocal {

	public void insertar(int codigo, String nombre) ;
	public void actualizar(TipoOrdenMedica tipoOrdenMedica);
	public void borrar(int codigo);
	public TipoOrdenMedica leer(int codigo)  ;
	public List<TipoOrdenMedica> getTipoOrdenesMedicas();
}