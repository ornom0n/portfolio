/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import java.util.*;

/**
 *
 * @author erikr
 */
public class DatabaseOperations {

    Transaction transaktio;
    SessionFactory istuntotehdas;
    Session istunto;

    /*
     * Uusien luokkien ilmentymien luomiset
     */
    public DatabaseOperations() {
        istuntotehdas = new AnnotationConfiguration().configure("hibernate.cfg_application.xml").buildSessionFactory();
    }

    public void luoKäyttäjä(String nimi) {

        try {

            istunto = istuntotehdas.openSession();
            transaktio = istunto.beginTransaction();
            Kayttaja k1 = new Kayttaja(nimi);
            istunto.saveOrUpdate(k1);
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public void luoPeli(String nimi, String kuvaus) {
        try {
            istunto = istuntotehdas.openSession();
            transaktio = istunto.beginTransaction();
            Peli p1 = new Peli(nimi, kuvaus);
            istunto.saveOrUpdate(p1);
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public void luoYhteisö(String nimi, String kuvaus) {
        try {
            istunto = istuntotehdas.openSession();
            transaktio = istunto.beginTransaction();
            Yhteiso y1 = new Yhteiso(nimi, kuvaus);
            istunto.saveOrUpdate(y1);
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public void luoEsine(String nimi) {
        try {
            istunto = istuntotehdas.openSession();
            transaktio = istunto.beginTransaction();
            Esine e1 = new Esine(nimi);
            istunto.saveOrUpdate(e1);
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    /*
     * Käyttäjään yhdistelemiset
     */
    public void lisääKäyttäjäRyhmään(String kayttajanimi, String yhteisonimi) {
        try {
            try {
                istunto = istuntotehdas.openSession();
                transaktio = istunto.beginTransaction();
                Kayttaja user = null;
                Yhteiso comm = null;

                String hql = "FROM Kayttaja WHERE nimi = :user";
                Query kysely1 = istunto.createQuery(hql);
                kysely1.setParameter("user", kayttajanimi);
                List<Kayttaja> kayttajalista = kysely1.list();
                for (Kayttaja tulos : kayttajalista) {

                    user = tulos;

                }

                hql = "FROM Yhteiso WHERE nimi = :community";
                Query kysely2 = istunto.createQuery(hql);
                kysely2.setParameter("community", yhteisonimi);

                List<Yhteiso> yhteisolista = kysely2.list();
                for (Yhteiso tulos : yhteisolista) {

                    comm = tulos;

                }


                user.addYhteisö(comm);

            } catch (Exception e) {
                System.out.println("Käyttäjää tai yhteisöä ei löydy!!!");

            }
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public void lisääKäyttäjällePeli(String kayttajanimi, String pelinimi) {
        try {
            try {
                istunto = istuntotehdas.openSession();
                transaktio = istunto.beginTransaction();

                Kayttaja user = null;
                Peli game = new Peli();
                String hql = "FROM Kayttaja WHERE nimi = :user";
                Query kysely1 = istunto.createQuery(hql);
                kysely1.setParameter("user", kayttajanimi);
                List<Kayttaja> kayttajalista = kysely1.list();
                for (Kayttaja tulos : kayttajalista) {
                    user = tulos;
                }

                hql = "FROM Peli WHERE nimi = :game";
                Query kysely2 = istunto.createQuery(hql);
                kysely2.setParameter("game", pelinimi);

                List<Peli> pelilista = kysely2.list();
                for (Peli tulos : pelilista) {
                    game = tulos;

                }
                game.setKäyttäjä(user);


            } catch (Exception e) {
                System.out.println("Käyttäjää tai yhteisöä ei löydy!!!");
            }
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public void lisääKäyttäjälleEsine(String kayttajanimi, String esinenimi) {
        try {
            try {
                istunto = istuntotehdas.openSession();
                transaktio = istunto.beginTransaction();

                Kayttaja user = null;
                Esine item = new Esine();
                String hql = "FROM Kayttaja WHERE nimi = :user";
                Query kysely1 = istunto.createQuery(hql);
                kysely1.setParameter("user", kayttajanimi);
                List<Kayttaja> kayttajalista = kysely1.list();
                for (Kayttaja tulos : kayttajalista) {
                    user = tulos;

                }

                hql = "FROM Esine WHERE nimi = :item";
                Query kysely2 = istunto.createQuery(hql);
                kysely2.setParameter("item", esinenimi);

                List<Esine> esinelista = kysely2.list();
                for (Esine tulos : esinelista) {
                    item = tulos;

                }
                item.setKäyttäjä(user);


            } catch (Exception e) {
                System.out.println("Käyttäjää tai yhteisöä ei löydy!!!");
            }
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public void muutaRank(String kayttajanimi, int rank) {
        try {
            try {
                istunto = istuntotehdas.openSession();
                transaktio = istunto.beginTransaction();
 
                Kayttaja user = null;
                Yhteiso comm = null;
                String hql = "FROM Kayttaja WHERE nimi = :user";
                Query kysely1 = istunto.createQuery(hql);
                kysely1.setParameter("user", kayttajanimi);
                List<Kayttaja> kayttajalista = kysely1.list();
                for (Kayttaja tulos : kayttajalista) {
                    user = tulos;

                }
                user.setRank(rank);
                istunto.saveOrUpdate(user);
            } catch (Exception e) {
                System.out.println("Käyttäjää ei löydy!!!");
            }
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public void muutaPelitunnit(String kayttajanimi, double tunnit) {
        try {
            try {
                istunto = istuntotehdas.openSession();
                transaktio = istunto.beginTransaction();
                Kayttaja user = null;
                String hql = "FROM Kayttaja WHERE nimi = :user";
                Query kysely1 = istunto.createQuery(hql);
                kysely1.setParameter("user", kayttajanimi);
                List<Kayttaja> kayttajalista = kysely1.list();
                for (Kayttaja tulos : kayttajalista) {
                    user = tulos;

                }
                user.setPelitunnit(tunnit);
                istunto.saveOrUpdate(user);
            } catch (Exception e) {
                System.out.println("Käyttäjää ei löydy!!!");
            }
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
        } finally {
            transaktio = null;
            istunto.close();
        }
    }

    public double luePelitunnit(String kayttajanimi) {
        double palaute = 0;

        try {
            istunto = istuntotehdas.openSession();

            Kayttaja user = null;
            String hql = "FROM Kayttaja WHERE nimi = :user";
            Query kysely1 = istunto.createQuery(hql);
            kysely1.setParameter("user", kayttajanimi);
            List<Kayttaja> kayttajalista = kysely1.list();
            for (Kayttaja tulos : kayttajalista) {
                user = tulos;

            }
            palaute = user.getPelitunnit();

        } catch (Exception e) {
            System.out.println("Käyttäjää ei löydy!!!");
            palaute = 0;
        } finally {

            istunto.close();
            return palaute;
        }
    }

    public String luePelikuvaus(String pelinimi) {
        String palaute = "";

        try {
            istunto = istuntotehdas.openSession();

            Peli game = new Peli();
            String hql = "FROM Peli WHERE nimi = :game";
            Query kysely1 = istunto.createQuery(hql);
            kysely1.setParameter("game", pelinimi);
            List<Peli> pelilista = kysely1.list();
            for (Peli tulos : pelilista) {
                game = tulos;

            }


            palaute = game.getKuvaus();
        } catch (Exception e) {
            System.out.println("Peliä ei löydy!!!");
            System.out.println(e.getMessage());
            palaute = "not_found";
        } finally {

            istunto.close();
            return palaute;
        }
    }

    public void poistaEsine(String esinenimi) {

        try {
            istunto = istuntotehdas.openSession();
            transaktio = istunto.beginTransaction();
            Esine item = new Esine();
            String hql = "FROM Esine WHERE nimi = :esine";
            Query kysely1 = istunto.createQuery(hql);
            kysely1.setParameter("esine", esinenimi);
            List<Esine> esinelista = kysely1.list();
            for (Esine tulos : esinelista) {
                item = tulos;

            }

            String hql2 = "DELETE FROM Esine WHERE id = :numero";
            Query kysely2 = istunto.createQuery(hql2);

            kysely2.setInteger("numero", item.getId());
            kysely2.executeUpdate();
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
            System.out.println("POISTO ON EPÄONNISTUNUT");
            System.out.println(e.getMessage());
        } finally {

            istunto.close();

        }
    }

    public void poistaPeli(String pelinimi) {

        try {
            istunto = istuntotehdas.openSession();
            transaktio = istunto.beginTransaction();
            Peli game = new Peli();
            String hql = "FROM Peli WHERE nimi = :peli";
            Query kysely1 = istunto.createQuery(hql);
            kysely1.setParameter("peli", pelinimi);
            List<Peli> pelilista = kysely1.list();
            for (Peli tulos : pelilista) {
                game = tulos;

            }

            String hql2 = "DELETE FROM Peli WHERE id = :numero";
            Query kysely2 = istunto.createQuery(hql2);

            kysely2.setInteger("numero", game.getId());
            kysely2.executeUpdate();
            transaktio.commit();
        } catch (Exception e) {
            transaktio.rollback();
            System.out.println("POISTO ON EPÄONNISTUNUT");
            System.out.println(e.getMessage());
        } finally {

            istunto.close();

        }
    }
}
