package fr.istic.tpjpa.jpa;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
public  abstract class PeriphIntelig {
	
	 protected int id;
	    public String equipementsElectrique="";
	    public double consoMoyenne=0.0;
	    
	    
	    public PeriphIntelig (String equipementsElectrique,double consoMoyenne){
	    	this.equipementsElectrique=equipementsElectrique;
	    	this.consoMoyenne=consoMoyenne;
	    	
	    }
	    
	    public PeriphIntelig( ){
	    	
	    }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEquipementsElectrique() {
			return equipementsElectrique;
		}
		public void setEquipementsElectrique(String equipementsElectrique) {
			this.equipementsElectrique = equipementsElectrique;
		}
		public double getComsoMoyenne() {
			return consoMoyenne;
		}
		public void setComsoMoyenne(double comsoMoyenne) {
			this.consoMoyenne = comsoMoyenne;
		}

}
