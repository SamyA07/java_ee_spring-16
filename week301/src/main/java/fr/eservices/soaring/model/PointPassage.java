package fr.eservices.soaring.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PointPassage {

	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int id;
	
	public String nom;
	
	public int lattitude;
	
	public int longitude;
	
	public String description;
	
	@ManyToOne
	public Secteur secteur;
}
