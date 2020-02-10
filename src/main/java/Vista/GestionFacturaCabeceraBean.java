package Vista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import Modelo.Cita;
import Modelo.FacturaCabecera;
import Modelo.FacturaDetalle;
import Modelo.Medico;
import Modelo.Receta;
import Modelo.Servicio;
import Negocio.GestionFacturaCabeceraLocal;
import Negocio.GestionMedicoLocal;
import Negocio.GestionPacienteLocal;
import Negocio.GestionServicioLocal;

@ManagedBean
@ViewScoped
public class GestionFacturaCabeceraBean {

	@Inject
	private GestionFacturaCabeceraLocal gfcl;
	
	@Inject
	private GestionPacienteLocal gpl;
	
	@Inject
	private GestionMedicoLocal gmel;
	
	@Inject
	private GestionServicioLocal gsl;
	
	private String id;
	
	private FacturaCabecera facturaCabecera;
	
	private List<FacturaCabecera> facturasCabecera;
	private List<Servicio> servicios;
	
	@PostConstruct
	public void init() {
		this.facturaCabecera=new FacturaCabecera();
		this.facturasCabecera=this.gfcl.getFacturaCabecera();
		this.facturaCabecera.addFacturaDetalle(new FacturaDetalle());
		this.servicios=this.gsl.getServicio();
	}
	
	public String addFacturaDetalle() {
		this.facturaCabecera.addFacturaDetalle(new FacturaDetalle());
		return null;
	}
	
	public GestionFacturaCabeceraLocal getGfcl() {
		return gfcl;
	}
	public void setGfcl(GestionFacturaCabeceraLocal gfcl) {
		this.gfcl = gfcl;
	}
	public GestionPacienteLocal getGpl() {
		return gpl;
	}
	public void setGpl(GestionPacienteLocal gpl) {
		this.gpl = gpl;
	}
	public GestionMedicoLocal getGmel() {
		return gmel;
	}
	public void setGmel(GestionMedicoLocal gmel) {
		this.gmel = gmel;
	}
	public GestionServicioLocal getGsl() {
		return gsl;
	}
	public void setGsl(GestionServicioLocal gsl) {
		this.gsl = gsl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public FacturaCabecera getFacturaCabecera() {
		return facturaCabecera;
	}
	public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}
	public List<FacturaCabecera> getFacturasCabecera() {
		return facturasCabecera;
	}
	public void setFacturasCabecera(List<FacturaCabecera> facturasCabecera) {
		this.facturasCabecera = facturasCabecera;
	}
	public List<Servicio> getServicios() {
		return servicios;
	}
	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	
	public  String guardar(Cita c) {
		this.facturaCabecera.setNumeroFactura("000DM"+Integer.toString(this.gfcl.getFacturaCabecera().size()+1));
		this.facturaCabecera.setMedico(c.getMedico());
		this.facturaCabecera.setPaciente(c.getPaciente());
		this.facturaCabecera.setFecha(c.getFecha());
		this.facturaCabecera.setTotal(this.calcularTotal());
		this.facturaCabecera.setSubtotal(this.calcularSubtotal());
		this.facturaCabecera.setIva(this.calcularIva());
		this.facturaCabecera.setEstado("1");
		this.gfcl.insert(this.facturaCabecera);
		return "PaginaListarCitasMedico?faces-redirect=true";
	}
	
	public String eliminar(String numeroFactura) {
		this.facturaCabecera=this.gfcl.read(numeroFactura);
		this.facturaCabecera.setEstado("0");
		this.gfcl.update(this.facturaCabecera);
		return "PaginaListarFacturas?faces-redirect=true";
	}
	
	public List<FacturaCabecera> obtenerFacturaCabeceraActivos(){
		return this.gfcl.getFacturaCabeceraActivo();
	}
	
	public double calcularTotal() {
		double subtotal=0,iva=0;
		for(int i=0;i<this.facturaCabecera.getFacturaDetalles().size();i++) {
			subtotal=subtotal+this.facturaCabecera.getFacturaDetalles().get(i).getPrecio();
		}
		iva=0.12*subtotal;
		return iva+subtotal;
	}
	
	public double calcularIva() {
		double subtotal=0,iva=0;
		for(int i=0;i<this.facturaCabecera.getFacturaDetalles().size();i++) {
			subtotal=subtotal+this.facturaCabecera.getFacturaDetalles().get(i).getPrecio();
		}
		return iva=0.12*subtotal;
	}
	
	public double calcularSubtotal() {
		double subtotal=0;
		for(int i=0;i<this.facturaCabecera.getFacturaDetalles().size();i++) {
			subtotal=subtotal+this.facturaCabecera.getFacturaDetalles().get(i).getPrecio();
		}
		return subtotal;
	}
	
	public String verFactura(FacturaCabecera f) {
		return "PaginaVerFactura?faces-redirect=true&id="+f.getNumeroFactura();
	}
	

	public String editarFactura(FacturaCabecera f) {
		return "PaginaEditarFactura?faces-redirect=true&id="+f.getNumeroFactura();
	}
	
	public String editar() {
		this.facturaCabecera.setTotal(this.calcularTotal());
		this.facturaCabecera.setSubtotal(this.calcularSubtotal());
		this.facturaCabecera.setIva(this.calcularIva());
		this.gfcl.update(this.facturaCabecera);
		return "PaginaListarFacturas?faces-redirect=true";
	}
	
	public String verFacturaMedico(FacturaCabecera f) {
		return "PaginaVerFacturaMedico?faces-redirect=true&id="+f.getNumeroFactura();
	}
	
	public void loadData() {
		this.facturaCabecera=this.gfcl.read(this.id);
	}
	

	public List<FacturaCabecera> obtenerFacturaCabeceraMedico(Medico medico){
		return this.gfcl.getFacturaCabeceraMedico(medico);
	}
	
	
}
