/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import javax.persistence.*;
import java.util.*;


/**
 *
 * @author erikr
 */
@Entity
@Table(name = "Yhteiso")
public class Yhteiso {
    private String nimi;
    private int id;
    private String kuvaus;
    private Set<Kayttaja> käyttäjät = new HashSet<Kayttaja>();

    public Yhteiso() {
    }

    public Yhteiso(String nimi, String kuvaus) {
        this.nimi = nimi;
        this.kuvaus = kuvaus;
        id = 0;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "kuvaus")
    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    @Column(name = "yhteisonimi")
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    @ManyToMany(mappedBy="yhteisot")
    public Set<Kayttaja> getKäyttäjät() {
        return käyttäjät;
    }

    public void setKäyttäjät(Set<Kayttaja> käyttäjät) {
        this.käyttäjät = käyttäjät;
    }
    
}
