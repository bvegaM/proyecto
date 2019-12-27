package Vista;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import Modelo.Paciente;
import Modelo.Rol;
import Negocio.PacienteLocal;

@ManagedBean
public class GPacienteBean {
	@Inject
	private PacienteLocal gpl;
	private Paciente paciente;
	
	private List<Paciente> listPaciente;
	private List<Rol> listRol;
	private SelectItem rolSeleccionado;
	
	public void init() {
		paciente = new Paciente();
	}
	
	public PacienteLocal getGpl() {
		return gpl;
	}

	public void setGpl(PacienteLocal gpl) {
		this.gpl = gpl;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getListPaciente() {
		return listPaciente;
	}

	public void setListPaciente(List<Paciente> listPaciente) {
		this.listPaciente = listPaciente;
	}

	public List<Rol> getListRol() {
		return listRol;
	}

	public void setListRol(List<Rol> listRol) {
		this.listRol = listRol;
	}

	public SelectItem getRolSeleccionado() {
		return rolSeleccionado;
	}

	public void setRolSeleccionado(SelectItem rolSeleccionado) {
		this.rolSeleccionado = rolSeleccionado;
	}

	public String guardarPaciente() {
		this.gpl.insertar(paciente);
		this.listPaciente=this.gpl.getPacientes();
		return "Listar-Paciente";
	}
	

}
