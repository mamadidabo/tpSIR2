package tp3.dabo.leroy.tp3.dabo.leroy;


import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Address {

	@Id
	private ObjectId id;
	private String street;
	private String city;
	private String postCode;
	private String country;

	/**
	 * <p>Constructeur Address<br />
	 * Constructeur vide</p>
	 * */
	public Address(){
		
	}

	/**
	 * <p>Constructeur Address<br />
	 * Initialise les attributs de la classe</p>
	 * @param id : id
	 * @param street : rue
	 * @param city : ville
	 * @param postCode : code postal
	 * @param country : pays
	 * */
	public Address(ObjectId id, String street, String city, String postCode, String country){
		this.id = id;
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		this.country = country;
	}
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
