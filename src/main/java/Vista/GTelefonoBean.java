package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import Modelo.Telefono;

@ManagedBean
public class GTelefonoBean {
	
	private Telefono telefono;
	private List<Telefono> ListTelefono;
	
	@PostConstruct
	public void init() {
		telefono = new Telefono();
	}
	
	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public List<Telefono> getListTelefono() {
		return ListTelefono;
	}
	public void setListTelefono(List<Telefono> listTelefono) {
		ListTelefono = listTelefono;
	}
	
	
	
	
}
