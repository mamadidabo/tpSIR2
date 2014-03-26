package tp3.dabo.leroy.tp3.dabo.leroy;

import java.util.List;

import org.bson.types.ObjectId;
import org.bson.util.annotations.GuardedBy;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Article {

	@Id
	private ObjectId id;
	private String name;
	private int stars;
	private List<Person> lstPerson;

	/**
	 * <p>Constructeur Article<br />
	 * Constructeur vide</p>
	 * */
	public Article() {
	}

	/**
	 * <p>Constructeur Article<br />
	 * Initialise les attributs de la classe</p>
	 * @param id : id
	 * @param name : nom
	 * @param stars : note
	 * @param lstPerson : liste de personnes
	 * */
	public Article(ObjectId id, String name, int stars, List<Person> lstPerson) {
		this.id = id;
		this.name = name;
		this.stars = stars;
		this.lstPerson = lstPerson;
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

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public List<Person> getLstPerson() {
		return lstPerson;
	}

	public void setLstPerson(List<Person> lstPerson) {
		this.lstPerson = lstPerson;
	}
}
