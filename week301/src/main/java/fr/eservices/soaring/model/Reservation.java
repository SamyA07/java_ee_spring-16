package fr.eservices.soaring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Reservation implements Serializable{

	//ATTRIBUTES
	
	@Id
	private int repas_id;
	
	@Id
	private int pilote_id;
	
	public int nbPersonnes;
	
	@ManyToOne
	@JoinColumn
	public Repas repas;
	
	@ManyToOne
	@JoinColumn
	public Pilote pilote;
}
