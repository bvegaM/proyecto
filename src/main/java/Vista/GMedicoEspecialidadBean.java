package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import Modelo.Especialidad;
import Modelo.Medico;
import Modelo.MedicoEspecialidad;

@ManagedBean
public class GMedicoEspecialidadBean {
	
	private int codigo;
	private Medico medico;
	private Especialidad especialidad;
	
	private List<MedicoEspecialidad> listMedicoEspecialidad;
	private List<Especialidad> listEspecialidad;
	private List<Medico> listMedico;
	private SelectItem medicoSeleccionado;
	private SelectItem especialidadSeleccionado;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
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
	public void ListarMedico() {
		
	}
	public void ListarEspecialidad() {
		
	}

}
