package fr.istic.tpjpa.jpa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;
public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			test.createPersonnes();
			test.createHome();
			test.createElectronicDivice();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		

		// TODO create entity

		// TODO persist entity

		tx.commit();
		//test.Listamis();
		//test.Listmaisons();
		// TODO run request
		manager.close();
		System.out.println(".. done");
		}
	 Personne  p1;      
     Personne  p2;
     Personne  p3;
     Personne  p4;
     
     Home home1;
     Home home2;
     Home home3;
     Home home4;
     
     ElectronicDivice elec1;
     ElectronicDivice elec2;
     ElectronicDivice elec3;
     ElectronicDivice elec4;
     
		
	
		private void createPersonnes() {
	        int id = manager.createQuery("Select a From Personne a", Personne.class).getResultList().size();
	        if (id == 0) {
	            Personne personne = new Personne();
	            
	            p1=new Personne("dabo","mohamed","masculin","mamadidabo@hotmail.fr","1986","momo");      
	             p2=new Personne("leroy","philippe","masculin","philippeleroy@hotmail.fr","1990","philippepresident");
	             p3= new Personne("lemechant","paul","masculin","lemechantpaul@hotmail.fr","1992","quoideneuf");
	              p4=new Personne("legentil","descousins","masculin","gentildescousins@hotmail.fr","1988","cestmonprofil");
	            
	       
	       Collection<Personne> listeAmis = new ArrayList<Personne>();
	       Collection<Personne> listeAmis1 = new ArrayList<Personne>();
	       
	       listeAmis1.add(p3);
	       listeAmis.add(p2);
	       p1.setAmis(listeAmis);
	       p4.setAmis(listeAmis1);
	      
	       manager.persist(p1);
	       manager.persist(p2);
	       manager.persist(p3);
	       manager.persist(p4);
	       
	            				
	            		
                
	        }

		}
		
		private void createHome() {
	        int id = manager.createQuery("Select b From Home b", Home.class).getResultList().size();
	        if (id == 0) {
	            Home home = new Home();
	          
	             home1=new Home("1 rue des armées",70,"127.09.08.03");
	             home2=new Home("18 rue de la soif",54,"127.09.07.02");
	             home3=new Home("3 bld des saumons",59,"127.10.07.07");
	             home4=new Home("4 square de l'opulence",500,"127.10.07.02");
	            
	            Collection<Home> listemaisons = new ArrayList<Home>();
	           Collection<Home> listemaisons1 = new ArrayList<Home>();
	            
	            listemaisons.add(home1);
	            listemaisons.add(home2);
	            listemaisons1.add(home3);
	            listemaisons1.add(home4);
	            home1.setPersonne(p1);
	            home2.setPersonne(p1);
	            home3.setPersonne(p2);
	            home4.setPersonne(p2);
	            p1.setMaisons(listemaisons);
	            p2.setMaisons(listemaisons1);
	           
	            manager.persist(home1);
	            manager.persist(home2);
	            manager.persist(home3);
	            manager.persist(home4);
	         
	        }
		
		
	}

		
		
		private void createElectronicDivice() {
	        int id = manager.createQuery("Select c From ElectronicDivice c", ElectronicDivice.class).getResultList().size();
	        if (id == 0) {
	        	ElectronicDivice electronicDivice = new ElectronicDivice();

	            		elec1=new ElectronicDivice("micro-onde",54);
	            		elec2=new ElectronicDivice("lave-vesselle",703);
	            		elec3=new ElectronicDivice("chauffage",234);
	            		elec4=new ElectronicDivice("machine a lavé",500);
	            		
	            		 Collection<ElectronicDivice> listEqui = new ArrayList<ElectronicDivice>();
	      	             Collection<ElectronicDivice> listEqui1 = new ArrayList<ElectronicDivice>();
	      	             
	      	             listEqui.add(elec1);
	      	             listEqui.add(elec2);
	      	             listEqui1.add(elec3);
	      	             listEqui1.add(elec4);
	      	             
	      	             elec1.setHome(home1);
	      	             elec2.setHome(home1);
	      	             elec3.setHome(home3);
	      	             elec4.setHome(home3);;
	      	             
	      	             home1.setEquipements(listEqui);;
	      	             home3.setEquipements(listEqui1);
	            
	            		//manager.persist(elec1);
	            		//manager.persist(elec2);
	            		//manager.persist(elec3);
	            		//manager.persist(elec4);
	        }
		
		
	}
		
	    private void Listamis() {
	        List<Personne> resultList = manager.createQuery("Select a From Personne a", Personne.class).getResultList();
	        System.out.println("num id:" + resultList.size());
	        for (Personne next : resultList) {
	            System.out.println("next Personne: " + next.id);
	        }
	    }
	    
	    
	  private void Listmaisons() {
	        List<Home> resultList = manager.createQuery("Select a From Home a", Home.class).getResultList();
	        System.out.println("num id:" + resultList.size());
	        for (Home next : resultList) {
	            System.out.println("next Personne: " + next.id);
	        }
	    }
	    /*
	    private void Listequipements() {
	        List<ElectronicDivice> resultList = manager.createQuery("Select a From ElectronicDivice a", ElectronicDivice.class).getResultList();
	        System.out.println("num id:" + resultList.size());
	        for (ElectronicDivice next : resultList) {
	            System.out.println("next Personne: " + next);
	        }
	    }*/

}


