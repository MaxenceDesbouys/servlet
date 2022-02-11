
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madesbouys
 */
public class Service {
    
    private EntityManager em = null;
    
     public EntityManager getEntityManager() {        
         if (em == null) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("mavenproject1");
                em = emf.createEntityManager(); 
            }
         return em;
     }
     
     // ferme le gestionnaire d'entité     
     public void closeEntityManager() {
         if (em != null) { em.close(); em = null; }    
     }
    
     public void CreerStation(){
         em = this.getEntityManager();
         
         EntityTransaction trans = null;
         
         try{
            em.getTransaction().begin();
            StationTrain st = new StationTrain();
            st.setAdresses("recu");
            st.setNom("paul");
            st.setPrix(9);
            st.setId(1);
            em.persist(st);
            em.getTransaction().commit();
            
         }catch(Exception e){
             System.out.println(e);
             if(trans != null){ trans.rollback();}
         }
     }
     
    
    
    
}
