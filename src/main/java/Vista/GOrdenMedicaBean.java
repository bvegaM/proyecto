package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import Modelo.Medico;
import Modelo.OrdenMedica;
import Modelo.TipoOrdenMedica;

@ManagedBean
public class GOrdenMedicaBean {
	 
	private OrdenMedica ordenMedica;
	private List<TipoOrdenMedica> listTipoOrdenMedica;
	private List<Medico> listMedico;
	private List<OrdenMedica> listOrdenMedica;
	private SelectItem medicoSeleccionado;
	private SelectItem tipoOrdenMedicaSeleccionado;
	
	public void init() {
		ordenMedica = new OrdenMedica();
	}
	
	public OrdenMedica getOrdenMedica() {
		return ordenMedica;
	}

	public void setOrdenMedica(OrdenMedica ordenMedica) {
		this.ordenMedica = ordenMedica;
	}

	public List<TipoOrdenMedica> getListTipoOrdenMedica() {
		return listTipoOrdenMedica;
	}
	public void setListTipoOrdenMedica(List<TipoOrdenMedica> listTipoOrdenMedica) {
		this.listTipoOrdenMedica = listTipoOrdenMedica;
	}
	public List<Medico> getListMedico() {
		return listMedico;
	}
	public void setListMedico(List<Medico> listMedico) {
		this.listMedico = listMedico;
	}
	public List<OrdenMedica> getListOrdenMedica() {
		return listOrdenMedica;
	}
	public void setListOrdenMedica(List<OrdenMedica> listOrdenMedica) {
		this.listOrdenMedica = listOrdenMedica;
	}
	
	public SelectItem getMedicoSeleccionado() {
		return medicoSeleccionado;
	}
	public void setMedicoSeleccionado(SelectItem medicoSeleccionado) {
		this.medicoSeleccionado = medicoSeleccionado;
	}
	public SelectItem getTipoOrdenMedicaSeleccionado() {
		return tipoOrdenMedicaSeleccionado;
	}
	public void setTipoOrdenMedicaSeleccionado(SelectItem tipoOrdenMedicaSeleccionado) {
		this.tipoOrdenMedicaSeleccionado = tipoOrdenMedicaSeleccionado;
	}
	
	

}
