package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Modelo.TipoCertificado;

@ManagedBean
public class GTipoCertificadoBean {
	
	private int codigo;
	private String nombre;
	private List<TipoCertificado> listTipoCertificado;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<TipoCertificado> getListTipoCertificado() {
		return listTipoCertificado;
	}
	public void setListTipoCertificado(List<TipoCertificado> listTipoCertificado) {
		this.listTipoCertificado = listTipoCertificado;
	}
	
	
	
	

}
