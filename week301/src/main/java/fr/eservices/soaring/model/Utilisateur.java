package fr.eservices.soaring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

	//ATTRIBUTES
	
	@Id
	public int identifiant;
	
	public String motDePasse;
	
	public String nom;
	
	public String prenom;
	
	@ManyToOne
	public Profil profil;

}
