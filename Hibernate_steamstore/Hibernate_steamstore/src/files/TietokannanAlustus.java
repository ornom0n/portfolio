package files;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author erikr
 */
public class TietokannanAlustus {

    public static void main(String[] args) {
        SessionFactory istuntotehdas = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session istunto = istuntotehdas.openSession();
        Transaction transaktio = null;

        try {
            transaktio = istunto.beginTransaction();
            Kayttaja k1 = new Kayttaja("ornom0n");
            Kayttaja k2 = new Kayttaja("heka");
            Kayttaja k3 = new Kayttaja("Moppi");
            Kayttaja k4 = new Kayttaja("V6th");
            Kayttaja k5 = new Kayttaja("Hbor");
            
            //Peliä luodessa sille täytyy antaa omistaja
            
            Peli p1 = new Peli("Dota 2", "Sairastu syöpään virtuaalisesti", k3);
            Peli p2 = new Peli("Natural Selection 2", "Hekafof lempipeli", k2);
            Peli p3 = new Peli("Metal Gear V: Ground Zeroes", "You're pretty good!", null);
            Peli p4 = new Peli("Civilizations V", "Kirjaimellisesti huume", null);
            Yhteiso y1 = new Yhteiso("T12b", "Klaus enough");
            Yhteiso y2 = new Yhteiso("Hobocom", "Hobo Community");
            Yhteiso y3 = new Yhteiso("Autism", "Autism support group");
            
            //Yhteisöön pitää lisätä käyttäjä
            k1.addYhteisö(y1);
            k2.addYhteisö(y1);
            k4.addYhteisö(y3);
            k5.addYhteisö(y2);
            
            Esine e1 = new Esine("Equalizer", k1);
            Esine e2 = new Esine("CS:Go puukko", k5);
            Esine e3 = new Esine("Avain", null);
            
            
            istunto.saveOrUpdate(k1);
            istunto.saveOrUpdate(k2);
            istunto.saveOrUpdate(k3);
            istunto.saveOrUpdate(k4);
            istunto.saveOrUpdate(k5);
            istunto.saveOrUpdate(p1);
            istunto.saveOrUpdate(p2);
            istunto.saveOrUpdate(p3);
            istunto.saveOrUpdate(p4);
            istunto.saveOrUpdate(y1);
            istunto.saveOrUpdate(y2);
            istunto.saveOrUpdate(y3);
            istunto.saveOrUpdate(e1);
            istunto.saveOrUpdate(e2);
            istunto.saveOrUpdate(e3);
            
            transaktio.commit();

        } finally {
            istunto.close();
        }
    }
}
