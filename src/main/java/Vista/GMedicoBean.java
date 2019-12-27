package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Direccion;
import Modelo.Medico;
import Modelo.Rol;
import Modelo.Telefono;
import Negocio.MedicoLocal;

@ManagedBean
public class GMedicoBean {
	@Inject
	private MedicoLocal gml;
	private Medico medico;
	private List<Medico> listMedico;
	private List<Rol> listRol;
	private List<Telefono> listTelefono;
	private List<Direccion> listDireccion;
	
	
	@PostConstruct
	public void init() {
		medico = new Medico();
	}
	
	
	public MedicoLocal getGml() {
		return gml;
	}


	public void setGml(MedicoLocal gml) {
		this.gml = gml;
	}


	public List<Rol> getListRol() {
		return listRol;
	}


	public void setListRol(List<Rol> listRol) {
		this.listRol = listRol;
	}


	public List<Telefono> getListTelefono() {
		return listTelefono;
	}


	public void setListTelefono(List<Telefono> listTelefono) {
		this.listTelefono = listTelefono;
	}


	public List<Direccion> getListDireccion() {
		return listDireccion;
	}


	public void setListDireccion(List<Direccion> listDireccion) {
		this.listDireccion = listDireccion;
	}


	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Medico> getListMedico() {
		return listMedico;
	}

	public void setListMedico(List<Medico> listMedico) {
		this.listMedico = listMedico;
	}
	public String guardarMedico() {
		this.gml.insertar(medico);
		this.listMedico = this.gml.getMedicos();
		return "Listar-Medicos";
		
	}

}
