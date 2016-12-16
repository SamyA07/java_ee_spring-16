package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Region {

	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	private int id;
	
	public String nom;
}
