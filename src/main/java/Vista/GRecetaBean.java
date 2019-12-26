package Vista;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import Modelo.Medico;
import Modelo.Receta;

@ManagedBean
public class GRecetaBean {
	private int codigo;
	private Medico medico;
	private String observaciones;
	private Date fechaEmision;
	
	private List<Receta> listReceta;
	private List<Medico> listMedico;
	private SelectItem medicoSeleccionado;
	
	@PostConstruct
	public void init() {
		this.listarMedicos();
	}
	
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
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public List<Receta> getListReceta() {
		return listReceta;
	}
	public void setListReceta(List<Receta> listReceta) {
		this.listReceta = listReceta;
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
	public void listarMedicos() {
		//this.listMedico = this
	}
	

}
