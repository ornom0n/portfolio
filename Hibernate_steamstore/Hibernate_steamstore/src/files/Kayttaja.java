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
@Table(name = "Kayttaja")
public class Kayttaja {

    private String nimi;
    private int id;
    private double pelitunnit;
    private int rank;
    private Set<Yhteiso> yhteisot = new HashSet<Yhteiso>();


    public Kayttaja() {
    }

    public Kayttaja(String nimi) {
        this.nimi = nimi;
        rank = 1;
        pelitunnit = 0;
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

    @Column(name = "pelitunnit")
    public double getPelitunnit() {
        return pelitunnit;
    }

    public void setPelitunnit(double pelitunnit) {
        this.pelitunnit = pelitunnit;
    }

    @Column(name = "rank")
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Column(name = "kayttajanimi")
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void addYhteisö(Yhteiso yhteiso) {
        yhteisot.add(yhteiso);
        yhteiso.getKäyttäjät().add(this);
    }

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "YHTEISON_KAYTTAJA",
            joinColumns = {
        @JoinColumn(name = "kayttajanimi")},
            inverseJoinColumns = {
        @JoinColumn(name = "yhteisonimi")})
    public Set<Yhteiso> getYhteisot() {
        return yhteisot;
    }

    public void setYhteisot(Set<Yhteiso> yhteisöt) {
        this.yhteisot = yhteisöt;
    }

    
    
    
}
