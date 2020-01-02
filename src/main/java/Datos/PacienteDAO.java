package Datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import Modelo.Paciente;

@Stateless
public class PacienteDAO {

	@Inject
	private EntityManager em;
	
	public void insertar(Paciente paciente) {
		em.persist(paciente);
	}
	
	public void actualizar(Paciente paciente) {
		em.merge(paciente);
	}
	
	public void borrar(int cedula) {
		em.remove(leer(cedula));
	}
	
	public Paciente leer(int cedula) {
		return em.find(Paciente.class, cedula);
	}
	
	public List<Paciente> getPacientes(){
		String jpql = "SELECT p FROM Paciente p";
		Query query = em.createQuery(jpql, Paciente.class);
		List<Paciente> listado = query.getResultList();		
		return listado;
	}
	
}
