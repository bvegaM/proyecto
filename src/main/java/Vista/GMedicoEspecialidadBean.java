package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import Modelo.Especialidad;
import Modelo.Medico;
import Modelo.MedicoEspecialidad;
import Negocio.MedicoEspecialidadLocal;

@ManagedBean
public class GMedicoEspecialidadBean {
	@Inject
	private MedicoEspecialidadLocal gmel;
	private MedicoEspecialidad medicoEspecialidad;
	
	private List<MedicoEspecialidad> listMedicoEspecialidad;
	private List<Especialidad> listEspecialidad;
	private List<Medico> listMedico;
	private SelectItem medicoSeleccionado;
	private SelectItem especialidadSeleccionado;
	
	public void init() {
		medicoEspecialidad = new MedicoEspecialidad();
	}
	
	public List<MedicoEspecialidad> getListMedicoEspecialidad() {
		return listMedicoEspecialidad;
	}
	public void setListMedicoEspecialidad(List<MedicoEspecialidad> listMedicoEspecialidad) {
		this.listMedicoEspecialidad = listMedicoEspecialidad;
	}
	public List<Especialidad> getListEspecialidad() {
		return listEspecialidad;
	}
	public void setListEspecialidad(List<Especialidad> listEspecialidad) {
		this.listEspecialidad = listEspecialidad;
	}
	public List<Medico> getListMedico() {
		return listMedico;
	}
	public void setListMedico(List<Medico> listMedico) {
		this.listMedico = listMedico;
	}
	
	public SelectItem getMedicoSeleccionado() {
		return medicoSeleccionado;
	}
	public void setMedicoSeleccionado(SelectItem medicoSeleccionado) {
		this.medicoSeleccionado = medicoSeleccionado;
	}
	public SelectItem getEspecialidadSeleccionado() {
		return especialidadSeleccionado;
	}
	public void setEspecialidadSeleccionado(SelectItem especialidadSeleccionado) {
		this.especialidadSeleccionado = especialidadSeleccionado;
	}
	public String guardarMedicoEspecialidad() {
		this.gmel.insertar(medicoEspecialidad);
		this.listMedicoEspecialidad = this.gmel.getMedicoEspecialidades();
		return "Listar-MedicoEspecialidad";
		
	}

	public MedicoEspecialidadLocal getGmel() {
		return gmel;
	}

	public void setGmel(MedicoEspecialidadLocal gmel) {
		this.gmel = gmel;
	}

	public MedicoEspecialidad getMedicoEspecialidad() {
		return medicoEspecialidad;
	}

	public void setMedicoEspecialidad(MedicoEspecialidad medicoEspecialidad) {
		this.medicoEspecialidad = medicoEspecialidad;
	}
	

}
