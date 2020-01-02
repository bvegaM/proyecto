package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.TipoOrdenMedicaDAO;
import Modelo.TipoOrdenMedica;

@Stateless
public class GestionTipoOrdenMedica implements GestionTipoOrdenMedicaLocal {
	
	@Inject
	private TipoOrdenMedicaDAO dao;
	
	private List<TipoOrdenMedica> tipoOrdenMedicas = new ArrayList<TipoOrdenMedica>();
	
	public void insertar(int codigo, String nombre) {
		TipoOrdenMedica a = new TipoOrdenMedica();
		a.setCodigo(codigo);
		a.setNombre(nombre);

		dao.insertar(a);
	}
	
	public List<TipoOrdenMedica> getTipoOrdenesMedicas(){
		return dao.getTipoOrdenesMedicas();
	}
	
	public TipoOrdenMedica leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(TipoOrdenMedica a) {
		dao.actualizar(a);
	}
}
