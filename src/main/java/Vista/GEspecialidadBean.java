package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Especialidad;
import Negocio.EspecialidadLocal;

@ManagedBean
public class GEspecialidadBean {
	@Inject
	private EspecialidadLocal gel;
	private Especialidad especialidad;
	private List<Especialidad> listEspecialidad;
	
	public void init() {
		especialidad = new Especialidad();
	}

	public EspecialidadLocal getGel() {
		return gel;
	}

	public void setGel(EspecialidadLocal gel) {
		this.gel = gel;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public List<Especialidad> getListEspecialidad() {
		return listEspecialidad;
	}

	public void setListEspecialidad(List<Especialidad> listEspecialidad) {
		this.listEspecialidad = listEspecialidad;
	}
	
	public String guardarEspecialidad() {
		this.gel.insertar(especialidad);
		this.listEspecialidad=this.gel.getEspecialidades();
		return "Listar-especialidad";
	}
}
