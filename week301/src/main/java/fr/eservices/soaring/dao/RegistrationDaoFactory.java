package fr.eservices.soaring.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.eservices.soaring.model.Pilote;
import fr.eservices.soaring.model.Repas;

public class RegistrationDaoFactory implements RegistrationDao {

	//ATTRIBUTES
	
	EntityManagerFactory emf;
	EntityManager em;
	
	//CONSTRUCTOR
	
	public RegistrationDaoFactory() {
		this.emf = Persistence.createEntityManagerFactory("myApp");
		this.em = this.emf.createEntityManager();
	}
	
	//METHODS

	public static RegistrationDao createRegistrationDao() {
		return new RegistrationDaoFactory();
	}
	
	@Override
	public List<Pilote> findPilotsByName(String nom) {
		TypedQuery<Pilote> q = em.createQuery("SELECT p FROM Pilote p WHERE nom = :nom", Pilote.class);
		q.setParameter("nom", nom);
		return q.getResultList();
	}

	@Override
	public List<Pilote> findPilotsByRegion(int id_region) {
		TypedQuery<Pilote> q = em.createQuery("SELECT p FROM Pilote p JOIN p.club c JOIN c.region r WHERE r.id = :region", Pilote.class);
		q.setParameter("region", id_region);
		return q.getResultList();
	}

	@Override
	public List<Pilote> findPilotsByClub(int id_club) {
		TypedQuery<Pilote> q = em.createQuery("SELECT p FROM Pilote p WHERE club_id = :id", Pilote.class);
		q.setParameter("id", id_club);
		return q.getResultList();
	}

	@Override
	public List<Pilote> findPilotsBelow(Date currentDate, int age) {
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.YEAR, -age);
		Date d = c.getTime();
		
		TypedQuery<Pilote> q = em.createQuery("SELECT p FROM Pilote p WHERE dateNaissance < :currentDate AND dateNaissance >= :dateNaissance", Pilote.class);
		q.setParameter("dateNaissance", d);
		q.setParameter("currentDate", currentDate);
		return q.getResultList();
	}

	@Override
	public Map<Repas, Integer> getAvailableSeatsForLunch(Date day, String time) {
		return new HashMap<Repas, Integer>();
	}

}
