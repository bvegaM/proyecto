package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import Modelo.Historial;
import Modelo.Medico;

@ManagedBean
public class GHistorialBean {
	
	
	public Historial historial;
	public List<Historial> listHistorial;
	public List<Medico> listMedico;
	
	@PostConstruct
	public void init(){
		historial = new Historial();
	}

	public List<Medico> getListMedico() {
		return listMedico;
	}

	public void setListMedico(List<Medico> listMedico) {
		this.listMedico = listMedico;
	}

	public Historial getHistorial() {
		return historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}

	public List<Historial> getListHistorial() {
		return listHistorial;
	}

	public void setListHistorial(List<Historial> listHistorial) {
		this.listHistorial = listHistorial;
	}
	
	
	
	

}
