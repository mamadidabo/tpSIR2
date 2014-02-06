package fr.istic.tpjpa.jpa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Chauffage {
	protected int id ;
	public HashMap<String, Double> chauffages;
	
	public Chauffage(HashMap<String, Double> chauffages){
         this.chauffages=chauffages;
	}
	
	public Chauffage(){
		
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashMap<String, Double> getChauffages() {
		return chauffages;
	}

	public void setChauffages(HashMap<String, Double> chauffages) {
		this.chauffages = chauffages;
	}
  
}
