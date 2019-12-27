package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.TipoOrdenMedica;
import Negocio.TipoOrdenMedicaLocal;

@ManagedBean
public class GTipoOrdenMedicaBean {
	@Inject
	private TipoOrdenMedicaLocal gtoml;
	
	private TipoOrdenMedica tipoOrdenMedica;
	private List<TipoOrdenMedica> listaTipoOrdenMedica;
	
	public void init() {
		tipoOrdenMedica = new TipoOrdenMedica();
	}
	
	public TipoOrdenMedicaLocal getGtoml() {
		return gtoml;
	}

	public void setGtoml(TipoOrdenMedicaLocal gtoml) {
		this.gtoml = gtoml;
	}

	public TipoOrdenMedica getTipoOrdenMedica() {
		return tipoOrdenMedica;
	}

	public void setTipoOrdenMedica(TipoOrdenMedica tipoOrdenMedica) {
		this.tipoOrdenMedica = tipoOrdenMedica;
	}

	public List<TipoOrdenMedica> getListaTipoOrdenMedica() {
		return listaTipoOrdenMedica;
	}
	public void setListaTipoOrdenMedica(List<TipoOrdenMedica> listaTipoOrdenMedica) {
		this.listaTipoOrdenMedica = listaTipoOrdenMedica;
	}
	public String guardarTipoOrdenMedica() {
		this.gtoml.insertar(tipoOrdenMedica);
		this.listaTipoOrdenMedica=this.gtoml.getTipoOrdenesMedicas();
		return "Listar-OrdenMedica";
	}
}
