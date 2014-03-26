package tp3.dabo.leroy.tp3.dabo.leroy;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Person {

	@Id
	private ObjectId id;
	private String name;
	private String titi;
	private List<Address> lstAddress;

	/**
	 * <p>Constructeur Person<br />
	 * Constructeur vide</p>
	 * */
	public Person() {
		titi="tutu";
	}

	/**
	 * <p>Constructeur Person<br />
	 * Initialise les attributs de la classe</p>
	 * @param id : id
	 * @param name : nom
	 * @param lstAddress : liste d'adresses
	 * */
	public Person(ObjectId id, String name, List<Address> lstAddress) {
		this.id = id;
		this.name = name;
		this.lstAddress = lstAddress;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getLstAddress() {
		return lstAddress;
	}

	public void setLstAddress(List<Address> lstAddress) {
		this.lstAddress = lstAddress;
	}
	
	public void setAddress(Address address) {
		if(this.lstAddress == null)
			this.lstAddress = new ArrayList<Address>();
		this.lstAddress.add(address);
	}
}
