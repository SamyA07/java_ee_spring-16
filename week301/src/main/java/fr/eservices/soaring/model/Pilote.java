package fr.eservices.soaring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pilote {

	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int id;
	
	public String nom;
	
	public String prenom;
	
	public Date dateNaissance;
	
	public String adresse;
	
	public String codePostal;
	
	public String ville;
	
	public String telPortable;
	
	@ManyToOne
	public Club club;
}
