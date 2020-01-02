package Negocio;

import java.util.List;

import javax.ejb.Local;

import Modelo.TipoCertificado;

@Local
public interface GestionTipoCertificadoLocal {

	public void insertar(int codigo, String nombre) ;
	public void actualizar(TipoCertificado tipoCertificado);
	public void borrar(int codigo);
	public TipoCertificado leer(int codigo)  ;
	public List<TipoCertificado> getTipoCertificados();
}