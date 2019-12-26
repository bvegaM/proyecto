package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Modelo.Rol;

@ManagedBean
public class GRolBean {
	
	private int codigo;
	private String nombre;
	private List<Rol> listRol;
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
	public List<Rol> getListRol() {
		return listRol;
	}
	public void setListRol(List<Rol> listRol) {
		this.listRol = listRol;
	}
	

}
