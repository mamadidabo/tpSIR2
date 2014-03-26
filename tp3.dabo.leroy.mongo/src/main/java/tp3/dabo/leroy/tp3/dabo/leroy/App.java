package tp3.dabo.leroy.tp3.dabo.leroy;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.DB;
import com.mongodb.Mongo;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws UnknownHostException {
		Morphia morphia = new Morphia();
		Mongo mongo = new Mongo();
		morphia.map(Person.class);
		morphia.map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "maBaseDeDonnee");

		Person p = new Person();
		p.setName("Momo");
		
		Address address = new Address();
		address.setStreet("18 RUE LEON RICOTTIER");
		address.setCity("RENNES");
		address.setPostCode("35000");
		address.setCountry("FRANCE");
		
		Article article=new Article();
		article.setName("nomArticle");
		article.setStars(3);
		// set address
		p.setAddress(address);
		// Save the POJO
		p.setAddress(address);
		ds.save(p);
		ds.save(address);
		ds.save(article);
		for (Person e : ds.find(Person.class))
	         System.err.println(e);
	}
}