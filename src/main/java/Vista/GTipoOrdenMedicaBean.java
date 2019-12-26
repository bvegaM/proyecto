package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Modelo.TipoOrdenMedica;

@ManagedBean
public class GTipoOrdenMedicaBean {
	
	private int codigo;
	private String nombre;
	private List<TipoOrdenMedica> listaTipoOrdenMedica;
	
	
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
	public List<TipoOrdenMedica> getListaTipoOrdenMedica() {
		return listaTipoOrdenMedica;
	}
	public void setListaTipoOrdenMedica(List<TipoOrdenMedica> listaTipoOrdenMedica) {
		this.listaTipoOrdenMedica = listaTipoOrdenMedica;
	}
	

}
