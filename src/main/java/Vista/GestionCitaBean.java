package Vista;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import Modelo.Cita;
import Negocio.GestionCitaLocal;

@ManagedBean
@ViewScoped
public class GestionCitaBean {

	private String id;
	
	private Cita cita;
	
	@Inject
	private GestionCitaLocal gcl;
	
	private List<Cita> citas;
	
	@PostConstruct
	public void init() {
		this.cita=new Cita();
		this.citas= this.gcl.getCitas();
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public GestionCitaLocal getGcl() {
		return gcl;
	}

	public void setGcl(GestionCitaLocal gcl) {
		this.gcl = gcl;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
	
	public void loadData() {
		if(id==null)
			return;
		this.cita=this.gcl.leer(Integer.parseInt(id));
	}
}
