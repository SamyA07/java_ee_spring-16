package fr.eservices.soaring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Club {
	
	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int id;
	
	public String nom;
	
	public String ville;
		
	@ManyToOne
	public Region region;
	
	@OneToMany
	public List<Pilote> lesPilotes;
}
