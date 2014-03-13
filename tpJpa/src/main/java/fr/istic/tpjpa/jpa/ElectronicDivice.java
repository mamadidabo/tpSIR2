package fr.istic.tpjpa.jpa;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("ElectronicDivice")
public class ElectronicDivice extends PeriphIntelig {
	@Transient
	private int id;
	@Transient
	private String equipementsElectrique = "";

	private double comsoMoyenne = 0.0;
	public Home home = new Home();

	public ElectronicDivice(String equipementsElectrique, double consoMoyenne) {
		this.equipementsElectrique = equipementsElectrique;
		this.comsoMoyenne = consoMoyenne;
	}

	public ElectronicDivice() {

	}
//
//	// @Id
//	// @GeneratedValue
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getEquipementsElectrique() {
//		return equipementsElectrique;
//	}
//
//	public void setEquipementsElectrique(String equipementsElectrique) {
//		this.equipementsElectrique = equipementsElectrique;
//	}
//

	@ManyToOne
	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

}