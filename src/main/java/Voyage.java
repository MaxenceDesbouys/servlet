
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madesbouys
 */
@Entity
@Table(name="Voyage")
public class Voyage implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "station_depart")
    StationTrain depart;

    public StationTrain getDepart() {
        return this.depart;
    }

    public void setDepart(StationTrain depart) {
        this.depart = depart;
    }

    public StationTrain getArriver() {
        return this.arriver;
    }

    public void setArriver(StationTrain arriver) {
        this.arriver = arriver;
    }

    public float getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    @Column(name = "station_arriver")
    StationTrain arriver;
    @Column(name = "prix")
    float prix;
    
    public Voyage() {
        depart = arriver = null;
        prix = 0;
    }    
    
    public Voyage(StationTrain depart, StationTrain arrivee,LigneTrain laLigne) {
       this.depart = depart;
       this.arriver = arrivee;
       Boolean aFacturer = false;
       float total = 0F;
       for (StationTrain st : laLigne.lesStations) {
           if (st.equals(depart)){
               aFacturer = true;
           }
           
           if(aFacturer){
               total += st.prix;
           }
           
           if(st.equals(arriver)){
               aFacturer = false;
               break;
           }
       }
       this.prix = total;
    }
    
    
     public Voyage(StationTrain depart, StationTrain arrivee,LigneTrain laLigne1,LigneTrain ligne2) {
       this.depart = depart;
       this.arriver = arrivee;
       
       Boolean aFacturer = false;
       float total = 0F;
       for (StationTrain st : laLigne1.lesStations) {
           if (st.equals(depart)){
               aFacturer = true;
           }
           
           if(aFacturer){
               total += st.prix;
           }
           
       }
       for (StationTrain st : ligne2.lesStations) {
            
           if(aFacturer){
               total += st.prix;
           }
           
           if(st.equals(arriver)){
               aFacturer = false;
               break;
            }
       }
       
       this.prix = total;
       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void init() {
        
    }
     
     
}
