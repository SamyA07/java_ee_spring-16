package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Epreuve {
	
	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int id;
	
	public String jour;
	
	public Type type;
	
	public Status status;

	@ManyToOne
	public Vol vol;
	
	@ManyToOne
	public Secteur secteur;
}
