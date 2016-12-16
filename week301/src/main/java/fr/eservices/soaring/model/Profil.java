package fr.eservices.soaring.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Profil {

	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int id;
	
	public String nom;
}
