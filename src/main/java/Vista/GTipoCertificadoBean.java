package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import Modelo.TipoCertificado;
import Negocio.TipoCertificadoLocal;

@ManagedBean
public class GTipoCertificadoBean {
	
	@Inject
	private TipoCertificadoLocal gtcl;
	
	private TipoCertificado tipoCertificado;
	private List<TipoCertificado> listTipoCertificado;
	
	
	@PostConstruct
	public void init() {
		tipoCertificado = new TipoCertificado();
	}
	
	public TipoCertificadoLocal getGtcl() {
		return gtcl;
	}

	public void setGtcl(TipoCertificadoLocal gtcl) {
		this.gtcl = gtcl;
	}

	public TipoCertificado getTipoCertificado() {
		return tipoCertificado;
	}

	public void setTipoCertificado(TipoCertificado tipoCertificado) {
		this.tipoCertificado = tipoCertificado;
	}

	public List<TipoCertificado> getListTipoCertificado() {
		return listTipoCertificado;
	}
	public void setListTipoCertificado(List<TipoCertificado> listTipoCertificado) {
		this.listTipoCertificado = listTipoCertificado;
	}
	
	public String guardarTipoCertificado() {
		this.gtcl.insertar(tipoCertificado);
		this.listTipoCertificado= this.gtcl.getTipoCertificados();
		return "Listar-TipoCertificado";
	}
	
	
	
	

}
