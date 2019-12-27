package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Modelo.Direccion;

@ManagedBean
public class GDireccionBean {
	//public DireccionLocal gdl;
	public Direccion direccion;
	public List<Direccion> listDireccion;
	
	public void init() {
		direccion = new Direccion();
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Direccion> getListDireccion() {
		return listDireccion;
	}

	public void setListDireccion(List<Direccion> listDireccion) {
		this.listDireccion = listDireccion;
	}
	
	

}
