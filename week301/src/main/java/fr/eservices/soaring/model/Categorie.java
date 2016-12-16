package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Categorie {
	
	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int id;
	
	public int idCategorie;
	
	public String titre;
	
	@ManyToOne
	public Produit lesProduits;

}
