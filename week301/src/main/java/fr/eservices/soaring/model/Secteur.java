package fr.eservices.soaring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Secteur implements Serializable{

	//ATTRIBUTES
	
	public String rayon;
	
	public String type;
	
	@Id
	private int id_epreuve;
	
	@ManyToOne
	@JoinColumn
	public Epreuve epreuve;
	
	@Id
	private int id_point_passage;
	
	@ManyToOne
	@JoinColumn
	public PointPassage pointsPassage;

}
