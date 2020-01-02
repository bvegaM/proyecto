package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.DetalleDAO;
import Modelo.Detalle;
import Modelo.Medicina;

@Stateless
public class GestionDetalle implements GestionDetalleLocal {
	
	@Inject
	private DetalleDAO dao;
	
	private List<Detalle> detalles = new ArrayList<Detalle>();
	
	public void insertar(int codigo, Medicina medicina) {
		Detalle d = new Detalle();
		d.setCodigo(codigo);
		d.setMedicina(medicina);
	
		dao.insertar(d);
	}
	
	public List<Detalle> getDetalles(){
		return dao.getDetalles();
	}
	
	public Detalle leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(Detalle d) {
		dao.actualizar(d);
	}
}
