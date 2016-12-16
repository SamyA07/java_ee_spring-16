package fr.eservices.soaring.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vol {

	//ATTRIBUTES
	
	@Id
	@GeneratedValue
	public int idVol;
	
	public Date date;
	
	public Date heureDecollage;
	
	public Date heureAtterrissage;
	
	@ManyToOne
	public Pilote pilote;
	
	@ManyToOne
	public Epreuve epreuve;

}
