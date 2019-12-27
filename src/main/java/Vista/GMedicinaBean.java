package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.Medicina;
import Negocio.MedicinaLocal;
@ManagedBean
public class GMedicinaBean {
	@Inject
	private MedicinaLocal gmedicinal;
	private Medicina medicina;
	private List<Medicina> listMedicina;
	@PostConstruct
	public void init() {
		medicina = new Medicina();
	}
	
	public MedicinaLocal getGmedicinal() {
		return gmedicinal;
	}

	public void setGmedicinal(MedicinaLocal gmedicinal) {
		this.gmedicinal = gmedicinal;
	}

	public Medicina getMedicina() {
		return medicina;
	}
	public void setMedicina(Medicina medicina) {
		this.medicina = medicina;
	}
	public List<Medicina> getListMedicina() {
		return listMedicina;
	}
	public void setListMedicina(List<Medicina> listMedicina) {
		this.listMedicina = listMedicina;
	}
	public String guardar() {
		this.gmedicinal.insertar(medicina);
		this.listMedicina=this.gmedicinal.getMedicinas();
		return "Listar-medicina";
	}
	
}
