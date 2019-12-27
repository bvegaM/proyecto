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
	private Receta receta;
	
	private List<Receta> listReceta;
	private List<Medico> listMedico;
	private SelectItem medicoSeleccionado;
	
	@PostConstruct
	public void init() {
		receta = new Receta();
	}
	
	
	public Receta getReceta() {
		return receta;
	}


	public void setReceta(Receta receta) {
		this.receta = receta;
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
	
	

}
