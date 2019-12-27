package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Rol;
import Negocio.RolLocal;

@ManagedBean
public class GRolBean {
	@Inject
	private RolLocal grl;
	private Rol rol;
	private List<Rol> listRol;
	
	public void init() {
		rol = new Rol();
	}
	
	public RolLocal getGrl() {
		return grl;
	}

	public void setGrl(RolLocal grl) {
		this.grl = grl;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Rol> getListRol() {
		return listRol;
	}
	public void setListRol(List<Rol> listRol) {
		this.listRol = listRol;
	}
	
	public String guardarRol() {
		this.grl.insertar(rol);
		this.listRol=this.grl.getRoles();
		return "Listar-Roles";
	}
	

}
