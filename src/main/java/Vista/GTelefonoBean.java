package Vista;

import java.util.List;

import javax.faces.bean.ManagedBean;

import Modelo.Telefono;

@ManagedBean
public class GTelefonoBean {
	
	private int codigo;
	private String numero;
	private String tipo;
	private List<Telefono> ListTelefono;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<Telefono> getListTelefono() {
		return ListTelefono;
	}
	public void setListTelefono(List<Telefono> listTelefono) {
		ListTelefono = listTelefono;
	}
	
	
}
