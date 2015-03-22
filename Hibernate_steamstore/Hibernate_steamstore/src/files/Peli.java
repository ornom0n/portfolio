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
@Table(name = "Peli")
public class Peli {

    private String nimi;
    private int id;
    private String kuvaus;
    private Kayttaja haltija;
    private String arvosteluteksti;

    public Peli() {
    }

    public Peli(String nimi, String kuvaus, Kayttaja haltija) {
        this.nimi = nimi;
        this.kuvaus = kuvaus;
        this.haltija = haltija;
        id = 0;
    }

    public Peli(String nimi, String kuvaus) {
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

    @Column(name = "nimi")
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Column(name = "kuvaus")
    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    @ManyToOne
    @JoinColumn(name = "haltija")
    public Kayttaja getKäyttäjä() {
        return haltija;
    }

    public void setKäyttäjä(Kayttaja haltija) {
        this.haltija = haltija;
    }

    @Column(name = "arvosteluteksti")
    public String getArvosteluteksti() {
        return arvosteluteksti;
    }

    public void setArvosteluteksti(String arvosteluteksti) {
        this.arvosteluteksti = arvosteluteksti;
    }
}
