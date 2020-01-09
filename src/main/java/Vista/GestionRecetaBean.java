package Vista;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import Modelo.Cita;
import Modelo.Detalle;
import Modelo.Medicina;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Receta;
import Negocio.GestionMedicinaLocal;
import Negocio.GestionMedicoLocal;
import Negocio.GestionPacienteLocal;
import Negocio.GestionRecetaLocal;

@ManagedBean
@ViewScoped
public class GestionRecetaBean {
	
	@Inject
	private GestionRecetaLocal grl;
	
	@Inject
	private GestionPacienteLocal gpl;
	
	@Inject
	private GestionMedicinaLocal gml;
	
	@Inject
	private GestionMedicoLocal gmel;
	
	private String id;
	
	private Receta receta;
	private List<Receta> recetas;
	
	private List<Paciente> pacientes;
	private List<Medicina> medicinas;
	
	@PostConstruct
	public void init() {
		this.receta =  new Receta();
		this.receta.addDetalle(new Detalle());
		this.recetas = new ArrayList<Receta>();
		this.pacientes = this.gpl.getPacientes();
		this.medicinas = this.gml.getMedicinas();
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public GestionRecetaLocal getGrl() {
		return grl;
	}
	public void setGrl(GestionRecetaLocal grl) {
		this.grl = grl;
	}
	public GestionPacienteLocal getGpl() {
		return gpl;
	}
	public void setGpl(GestionPacienteLocal gpl) {
		this.gpl = gpl;
	}
	public GestionMedicinaLocal getGml() {
		return gml;
	}
	public void setGml(GestionMedicinaLocal gml) {
		this.gml = gml;
	}
	public GestionMedicoLocal getGmel() {
		return gmel;
	}
	public void setGmel(GestionMedicoLocal gmel) {
		this.gmel = gmel;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
	public List<Receta> getRecetas() {
		return recetas;
	}
	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}
	public List<Paciente> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	public List<Medicina> getMedicinas() {
		return medicinas;
	}
	public void setMedicinas(List<Medicina> medicinas) {
		this.medicinas = medicinas;
	}
	
	public String guardar(String email) {
		this.receta.setCodigo(this.grl.getRecetas().size()+1);
		this.receta.setMedico(this.buscarMedicoxEmail(email));
		System.out.println(receta.toString());
		this.grl.insertar(receta);
		return "crearReceta?faces-redirect=true";
	}
	
	public Medico buscarMedicoxEmail(String email) {
		List<Medico> medicos = new ArrayList<Medico>();
		medicos = this.gmel.getMedicos();
		for(Medico m: medicos) {
			if(m.getEmail().equals(email)) {
				return m;
			}
		}
		return null;
	}
	
	public String addDetalle() {
		this.receta.addDetalle(new Detalle());
		return null;
	}
	
	public List<Receta> obtenerRecetasMedico(String email){
		System.out.println(email);
		List<Receta> aux= new ArrayList<Receta>();
		this.recetas=this.grl.getRecetas();
		for(Receta re: recetas) {
			if(re.getMedico().getEmail().equals(email)) {
				aux.add(re);
			}
		}
		return aux;
	}
	
	public String editarReceta() {
		this.grl.actualizar(this.receta);
		return "listaRecetasMedico?faces-redirect=true";
	}
	
	public String editar(Receta r) {
		return "editarReceta?faces-redirect=true&id="+r.getCodigo();
	}
	
	public void loadData() {
		System.out.println("load data " + id);
		if(id==null)
			return;
		this.receta = this.grl.leer(Integer.parseInt(id));
	}
	
	
	

}
