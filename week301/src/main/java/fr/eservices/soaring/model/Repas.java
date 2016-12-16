package fr.eservices.soaring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Repas {

	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int id;
	
	public Date date;
	
	public String heure;
	
	public String menu;
}
