
import java.io.Serializable;
import javax.persistence.Entity;
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
@Table(name="StationTrain")
public class StationTrain implements Serializable {
    @Id
    int id;
    String nom;
    String adresses;
    float prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
