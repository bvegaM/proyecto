package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Datos.TipoCertificadoDAO;
import Modelo.TipoCertificado;

@Stateless
public class GestionTipoCertificado implements GestionTipoCertificadoLocal {
	
	@Inject
	private TipoCertificadoDAO dao;
	
	private List<TipoCertificado> tipoCertificados = new ArrayList<TipoCertificado>();
	
	public void insertar(int codigo, String nombre) {
		TipoCertificado a = new TipoCertificado();
		a.setCodigo(codigo);
		a.setNombre(nombre);

		dao.insertar(a);
	}
	
	public List<TipoCertificado> getTipoCertificados(){
		return dao.getTipoCertificados();
	}
	
	public TipoCertificado leer(int codigo) {
		return dao.leer(codigo);
	}
	
	public void borrar(int codigo) {
		dao.borrar(codigo);
	}
	
	public void actualizar(TipoCertificado a) {
		dao.actualizar(a);
	}
}
