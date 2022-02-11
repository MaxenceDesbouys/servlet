
import java.util.ArrayList;

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
    
     public void CreerVoyage(StationTrain depart,StationTrain arriver,int prix){
         em = this.getEntityManager();
         
         EntityTransaction trans = null;
         
         try{
            em.getTransaction().begin();
            Voyage v = new Voyage();
            v.setArriver(arriver);
            v.setDepart(depart);
            v.setPrix(prix);
            em.persist(v);
            em.getTransaction().commit();
            
         }catch(Exception e){
             System.out.println(e);
             if(trans != null){ trans.rollback();}
         }
     }
     
     public void creerStation(String adresse,String nom,int prix){
        em = this.getEntityManager();
         
        EntityTransaction trans = null;
        
        try{
           em.getTransaction().begin();
           StationTrain st = new StationTrain();
           st.setAdresses(adresse);
           st.setNom(nom);
           st.setPrix(prix);
           em.persist(st);
           em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println(e);
            if(trans != null){ trans.rollback();}
        }
     }
    
     public void creerLigne(ArrayList<StationTrain> lesStations){
        em = this.getEntityManager();
         
        EntityTransaction trans = null;
     
        try{
            em.getTransaction().begin();
            LigneTrain l = new LigneTrain(lesStations);
            em.persist(l);
            em.getTransaction().commit();
        
         }catch(Exception e){
            System.out.println(e);
            if(trans != null){ trans.rollback();}
         }
     }
}
