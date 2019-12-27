package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import Modelo.Medico;
import Modelo.Rol;

@ManagedBean
public class GMedicoBean {
	
	private Medico medico;
	private List<Medico> listMedico;
	
	@PostConstruct
	public void init() {
		medico = new Medico();
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
	

}
