package Negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import Modelo.Certificado;
import Modelo.Direccion;
import Modelo.Historial;
import Modelo.OrdenMedica;
import Modelo.Paciente;
import Modelo.Receta;
import Modelo.Rol;
import Modelo.Telefono;

@Local
public interface GestionPacienteLocal {

	public void insertar(int codigo, int cedula, String nombre, String apellido, String email, String clave, Rol rol, Date fechaNac,String sexo,int edad ,Telefono telefonos, Direccion direcciones, Receta recetas, Historial historiales, Certificado certificados, OrdenMedica ordenmedicas) ;
	public void actualizar(Paciente paciente);
	public void borrar(int cedula);
	public Paciente leer(int cedula) ;
	public List<Paciente> getPacientes();
}