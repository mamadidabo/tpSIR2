package fr.istic.tpjpa.jpa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Home {
	protected int id;
	public String adresse="";
	public int superficie=0;
	protected String ip="";
	protected Collection<ElectronicDivice> equipements = new ArrayList<ElectronicDivice>();
	protected Personne personne=new Personne();
	

	public Home (String adresse, int superficie, String ip){
		this.adresse=adresse;
		this.superficie=superficie;
		this.ip=ip;
	}
	
	public Home (){
		}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	@ManyToOne
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	@OneToMany(mappedBy="home",cascade=CascadeType.PERSIST)
	
		public Collection<ElectronicDivice> getEquipements() {
		return equipements;
	}

	public void setEquipements(Collection<ElectronicDivice> equipements) {
		this.equipements = equipements;
	}


}
