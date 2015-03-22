/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import javax.persistence.*;

/**
 *
 * @author erikr
 */
@Entity
@Table(name = "Esine")
public class Esine {

    private String nimi;
    private int id;
    private Kayttaja haltija;

    public Esine() {
    }

    public Esine(String nimi, Kayttaja haltija) {
        this.nimi = nimi;
        this.haltija = haltija;
        id = 0;
    }

    public Esine(String nimi) {
        this.nimi = nimi;
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

    @ManyToOne
    @JoinColumn(name = "haltija")
    public Kayttaja getKäyttäjä() {
        return haltija;
    }

    public void setKäyttäjä(Kayttaja haltija) {
        this.haltija = haltija;
    }

    @Column(name = "nimi")
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
