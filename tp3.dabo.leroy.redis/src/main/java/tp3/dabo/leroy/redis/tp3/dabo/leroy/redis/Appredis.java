package tp3.dabo.leroy.redis.tp3.dabo.leroy.redis;

import redis.clients.jedis.Jedis;

public class Appredis {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Jedis jedis = new Jedis("localhost");
	    jedis.set("coucou", "yes");
	    String value = jedis.get("coucou");
	    
	    System.err.println(value);
	    
	    //Jedis jedis1 = new Jedis("localhost");
        System.out.println(jedis.get("compteur"));
        jedis.incr("compteur");
        System.out.println(jedis.get("compteur"));


//Exemple 3
              
    
        String cleycache = "cleycache";
        //Jedis jedis = new Jedis("localhost");
        // adding a new key
        jedis.set(cleycache, "valeur cle");
        // setting the TTL in seconds
        jedis.expire(cleycache, 15);
        // Getting the remaining ttl
        System.out.println("TTL:" + jedis.ttl(cleycache));
        Thread.sleep(1000);
        System.out.println("TTL:" + jedis.ttl(cleycache));
        // Getting the cache value
        System.out.println("valeur cache:" + jedis.get(cleycache));

        // Wait for the TTL finishs
        Thread.sleep(15000);

        // trying to get the expired key
        System.out.println("Expired Key:" + jedis.get(cleycache));
    

//Exemple 4.
              
   
        String cleycache2 = "menu";
        // Adding a set as value

        jedis.sadd(cleycache2, "roti de veau");
        jedis.sadd(cleycache2, "canard mariné");
        jedis.sadd(cleycache2, "tchep");// SADD

        // Getting all values in the set: SMEMBERS
        System.out.println("menu: " + jedis.smembers(cleycache2));
        // Adding new values
        jedis.sadd(cleycache2, "vegetarien");
        jedis.sadd(cleycache2, "roti de veau");
        // Getting the values... it doesn't allow duplicates
        System.out.println("menu: " + jedis.smembers(cleycache2));

    }


}
