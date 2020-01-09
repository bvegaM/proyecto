package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import Modelo.Medicina;
import Negocio.GestionMedicinaLocal;

@ManagedBean
@ViewScoped
public class GestionMedicinasBean {
	
	@Inject
	private GestionMedicinaLocal gml;
	
	private List<Medicina> medicinas;
	
	private String nombre;
	private String descripcion;
	
	@PostConstruct
	public void init() {
		this.medicinas=this.gml.getMedicinas();
	}
	
	
	public GestionMedicinaLocal getGml() {
		return gml;
	}
	public void setGml(GestionMedicinaLocal gml) {
		this.gml = gml;
	}
	public List<Medicina> getMedicinas() {
		return medicinas;
	}
	public void setMedicinas(List<Medicina> medicinas) {
		this.medicinas = medicinas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String guardar() {
		Medicina medicina = new Medicina();
		medicina.setCodigo(this.gml.getMedicinas().size()+1);
		medicina.setNombre(this.getNombre());
		medicina.setDescripcion(this.getDescripcion());
		System.out.println(medicina.toString());
		this.gml.insertar(medicina);
		return "medicinas?faces-redirect=true";
	}
	
	public String eliminar(int codigo) {
		
		try {
			this.gml.borrar(codigo);
			System.out.println("Medicina eliminado");
			return "medicinas?faces-redirect=true";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al eliminar");
			e.printStackTrace();			
		}		
		return null;
	}
	
	
	

}
