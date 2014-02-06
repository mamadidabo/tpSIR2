package fr.istic.tpjpa.jpa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Personne {
	protected int id;
	public String nom="";
	public String prenom="";
	public String genre="";
	public String mail="";
	public String dateDeNaissance="";
	protected String profil="";
	public Collection<Personne> amis = new ArrayList<Personne>();
	public Collection<Home> maisons = new ArrayList<Home>();
	

	public Personne(String nom,String prenom, String genre, String mail,String dateDeNaissance,String profil){
		this.nom=nom;
		this.prenom=prenom;
		this.genre=genre;
		this.mail=mail;
		this.dateDeNaissance=dateDeNaissance;
		this.profil=profil;
	}

	public Personne(){

	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	
	@ManyToMany
	public Collection<Personne> getAmis() {
		return amis;
	}

	public void setAmis(Collection<Personne> amis) {
		this.amis = amis;
	}
	@OneToMany (mappedBy="personne")
	
	public Collection<Home> getMaisons() {
		return maisons;
	}

	public void setMaisons(Collection<Home> maisons) {
		this.maisons = maisons;
	}

}
