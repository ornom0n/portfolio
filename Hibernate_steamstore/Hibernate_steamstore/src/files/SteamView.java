/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author henrikra
 */
public class SteamView extends JFrame {

    private SteamController ohjain;
    private JPanel sisältöpaneeli, käyttäjäpaneeli, pelipaneeli, yhteisöpaneeli,
            lisääkäyttäjälleyhteisö, lisääpelikäyttäjälle, esinepaneeli,
            lisääesinekäyttäjälle, kaikkiluomiset, kaikkiliittämiset,
            aloitus, muokkaarankpaneeli, muokkaapelitunnitpaneeli,
            poistaesinepaneeli, poistapelipaneeli, luepelitunnitpaneeli,
            luepelinkuvauspaneeli,
            kaikkimuokkaamiset,
            kaikkipoistamiset, kaikkilukemiset;
    private JButton bluokäyttäjä, bluopeli, bluoyhteisö, blisääyhteisö,
            blisääpeli, bluoesine, blisääesine, bmuutarank, bmuutapelitunnit,
            bpoistaesine, bpoistapeli, bluepelitunnit, bluepelinkuvaus,
            bLUO1, bLIITÄ1,
            bLUO2, bLIITÄ2, bLUO3, bLUO4, bLUO5, bLUO6, bLIITÄ3, bLIITÄ4,
            bLIITÄ5, bLIITÄ6, bMUOKKAA1, bMUOKKAA2, bMUOKKAA3,
            bMUOKKAA4, bMUOKKAA5, bMUOKKAA6,
            bLUE1, bLUE2, bLUE3, bLUE4, bLUE5, bLUE6,
            bPOISTA1, bPOISTA2, bPOISTA3, bPOISTA4, bPOISTA5, bPOISTA6;
    private JLabel steamheader1, steamheader2, steamheader3, steamheader4,
            steamheader5, steamheader6, lkäyttäjä, lpeli,
            lyhteisö, llisääyhteisöön, lmuokkaarank, lmuokkaapelitunnut,
            lpoistaesine, lpoistapeli, lluepelitunnit, lluepelinkuvaus, 
            lhaunotsikko, lhauntulos,
            steamlogokuva1,
            steamlogokuva2, steamlogokuva3, steamlogokuva4, steamlogokuva5,
            steamlogokuva6,
            llisääpelikäyttäjälle, lesine, llisääesinekäyttäjälle;
    private JTextField tkäyttäjänimi, tpelinimi, tpelikuvaus, tyhteisönimi,
            tyhteisökuvaus, tlisääkäyttäjäyhteisöön_ynimi,
            tlisääkäyttäjäyhteisöön_knimi, tlisääpelikäyttäjälle_pnimi,
            tlisääpelikäyttäjälle_knimi, tesinenimi, tlisääesinekäyttäjälle_enimi,
            tlisääesinekäyttäjälle_knimi, tmuokkaarank_knimi,
            tmuokkaarank_rankmäärä, tmuokkaapelitunnit_knimi,
            tmuokkaapelitunnit_pelitunnit, tpoistaesine_enimi, tpoistapeli_pnimi,
            tluepelitunnit_knimi, tluepelinkuvaus_pnimi;
    private ImageIcon steamlogo;
    private CardLayout cl;

    public SteamView() {
        alustaKomponentit();
    }

    public void rekisteröiOhjain(SteamController ohjain) {
        this.ohjain = ohjain;
    }

    private void alustaKomponentit() {
        
        cl = new CardLayout();
        steamlogo = new ImageIcon(getClass().getResource("steamLogo.png"));
        steamlogokuva1 = new JLabel(steamlogo);
        steamlogokuva2 = new JLabel(steamlogo);
        steamlogokuva3 = new JLabel(steamlogo);
        steamlogokuva4 = new JLabel(steamlogo);
        steamlogokuva5 = new JLabel(steamlogo);
        steamlogokuva6 = new JLabel(steamlogo);

        setTitle("SteamYhteisö");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sisältöpaneeli = new JPanel();
        sisältöpaneeli.setLayout(cl);
        käyttäjäpaneeli = new JPanel();
        pelipaneeli = new JPanel();
        yhteisöpaneeli = new JPanel();
        lisääkäyttäjälleyhteisö = new JPanel();
        lisääpelikäyttäjälle = new JPanel();
        esinepaneeli = new JPanel();
        lisääesinekäyttäjälle = new JPanel();
        kaikkiluomiset = new JPanel();
        kaikkiliittämiset = new JPanel();
        kaikkimuokkaamiset = new JPanel();
        aloitus = new JPanel();
        muokkaarankpaneeli = new JPanel();
        poistaesinepaneeli = new JPanel();
        kaikkipoistamiset = new JPanel();
        muokkaapelitunnitpaneeli = new JPanel();
        poistapelipaneeli = new JPanel();
        kaikkilukemiset = new JPanel();
        luepelitunnitpaneeli = new JPanel();
        luepelinkuvauspaneeli = new JPanel();

        steamheader1 = new JLabel("STEAM KEYGEN 2015 FREE");
        steamheader2 = new JLabel("STEAM KEYGEN 2015 FREE");
        steamheader3 = new JLabel("STEAM KEYGEN 2015 FREE");
        steamheader4 = new JLabel("STEAM KEYGEN 2015 FREE");
        steamheader5 = new JLabel("STEAM KEYGEN 2015 FREE");
        steamheader6 = new JLabel("STEAM KEYGEN 2015 FREE");

        steamheader1.setFont(steamheader1.getFont().deriveFont(32f));
        steamheader1.setForeground(Color.WHITE);
        steamheader2.setFont(steamheader1.getFont().deriveFont(32f));
        steamheader2.setForeground(Color.WHITE);
        steamheader3.setFont(steamheader1.getFont().deriveFont(32f));
        steamheader3.setForeground(Color.WHITE);
        steamheader4.setFont(steamheader1.getFont().deriveFont(32f));
        steamheader4.setForeground(Color.WHITE);
        steamheader5.setFont(steamheader1.getFont().deriveFont(32f));
        steamheader5.setForeground(Color.WHITE);
        steamheader6.setFont(steamheader1.getFont().deriveFont(32f));
        steamheader6.setForeground(Color.WHITE);

        bLUO1 = new JButton("LUO");
        bLIITÄ1 = new JButton("LIITÄ");
        bLUO2 = new JButton("LUO");
        bLIITÄ2 = new JButton("LIITÄ");
        bLUO3 = new JButton("LUO");
        bLUO4 = new JButton("LUO");
        bLUO5 = new JButton("LUO");
        bLUO6 = new JButton("LUO");
        bLIITÄ3 = new JButton("LIITÄ");
        bLIITÄ4 = new JButton("LIITÄ");
        bLIITÄ5 = new JButton("LIITÄ");
        bLIITÄ6 = new JButton("LIITÄ");
        bMUOKKAA1 = new JButton("MUOKKAA");
        bMUOKKAA2 = new JButton("MUOKKAA");
        bMUOKKAA3 = new JButton("MUOKKAA");
        bMUOKKAA4 = new JButton("MUOKKAA");
        bMUOKKAA5 = new JButton("MUOKKAA");
        bMUOKKAA6 = new JButton("MUOKKAA");
        bLUE1 = new JButton("LUE");
        bLUE2 = new JButton("LUE");
        bLUE3 = new JButton("LUE");
        bLUE4 = new JButton("LUE");
        bLUE5 = new JButton("LUE");
        bLUE6 = new JButton("LUE");
        bPOISTA1 = new JButton("POISTA");
        bPOISTA2 = new JButton("POISTA");
        bPOISTA3 = new JButton("POISTA");
        bPOISTA4 = new JButton("POISTA");
        bPOISTA5 = new JButton("POISTA");
        bPOISTA6 = new JButton("POISTA");

        lkäyttäjä = new JLabel("Luo käyttäjä:");
        lkäyttäjä.setForeground(Color.LIGHT_GRAY);
        tkäyttäjänimi = new JTextField("nimi", 8);
        bluokäyttäjä = new JButton("Luo käyttäjä");

        lpeli = new JLabel("Luo peli:");
        lpeli.setForeground(Color.LIGHT_GRAY);
        tpelinimi = new JTextField("nimi", 8);
        tpelikuvaus = new JTextField("kuvaus", 8);
        bluopeli = new JButton("Luo peli");

        bluoyhteisö = new JButton("Luo yhteisö");
        tyhteisönimi = new JTextField("nimi", 8);
        tyhteisökuvaus = new JTextField("kuvaus", 8);
        lyhteisö = new JLabel("Luo yhteisö:");
        lyhteisö.setForeground(Color.LIGHT_GRAY);

        lesine = new JLabel("Luo esine:");
        lesine.setForeground(Color.LIGHT_GRAY);
        tesinenimi = new JTextField("nimi", 8);
        bluoesine = new JButton("Luo esine");

        llisääyhteisöön = new JLabel("Lisää käyttäjä ryhmään:");
        llisääyhteisöön.setForeground(Color.LIGHT_GRAY);
        tlisääkäyttäjäyhteisöön_ynimi = new JTextField("yhteisön nimi", 8);
        tlisääkäyttäjäyhteisöön_knimi = new JTextField("käyttäjän nimi", 8);
        blisääyhteisö = new JButton("Lisää käyttäjä");

        llisääpelikäyttäjälle = new JLabel("Lisää peli käyttäjälle:");
        llisääpelikäyttäjälle.setForeground(Color.LIGHT_GRAY);
        tlisääpelikäyttäjälle_pnimi = new JTextField("pelin nimi", 8);
        tlisääpelikäyttäjälle_knimi = new JTextField("käyttäjän nimi", 8);
        blisääpeli = new JButton("Lisää peli");

        llisääesinekäyttäjälle = new JLabel("Lisää esine käyttäjälle:");
        llisääesinekäyttäjälle.setForeground(Color.LIGHT_GRAY);
        tlisääesinekäyttäjälle_enimi = new JTextField("esineen nimi", 8);
        tlisääesinekäyttäjälle_knimi = new JTextField("käyttäjän nimi", 8);
        blisääesine = new JButton("Lisää esine");

        lmuokkaarank = new JLabel("Muokkaa käyttäjän rank:");
        lmuokkaarank.setForeground(Color.LIGHT_GRAY);
        tmuokkaarank_knimi = new JTextField("käyttäjän nimi", 8);
        tmuokkaarank_rankmäärä = new JTextField("rank-luku", 8);
        bmuutarank = new JButton("Muuta rank");

        lmuokkaapelitunnut = new JLabel("Muokkaa käyttäjän pelitunnit:");
        lmuokkaapelitunnut.setForeground(Color.LIGHT_GRAY);
        tmuokkaapelitunnit_knimi = new JTextField("käyttäjän nimi", 8);
        tmuokkaapelitunnit_pelitunnit = new JTextField("pelitunnit", 8);
        bmuutapelitunnit = new JButton("Muuta pelitunnit");

        lpoistaesine = new JLabel("Poista esine:");
        lpoistaesine.setForeground(Color.LIGHT_GRAY);
        tpoistaesine_enimi = new JTextField("esineen nimi", 8);
        bpoistaesine = new JButton("Poista esine");

        lpoistapeli = new JLabel("Poista peli:");
        lpoistapeli.setForeground(Color.LIGHT_GRAY);
        tpoistapeli_pnimi = new JTextField("pelin nimi", 8);
        bpoistapeli = new JButton("Poista peli");
        
        lluepelitunnit = new JLabel("Näytä käyttäjän pelitunnit:");
        lluepelitunnit.setForeground(Color.LIGHT_GRAY);
        tluepelitunnit_knimi = new JTextField("käyttäjän nimi", 8);
        bluepelitunnit = new JButton("Lue pelitunnit"); 
        
        lluepelinkuvaus = new JLabel("Näytä pelin kuvaus:");
        lluepelinkuvaus.setForeground(Color.LIGHT_GRAY);
        tluepelinkuvaus_pnimi = new JTextField("pelin nimi", 8);
        bluepelinkuvaus = new JButton("Lue kuvaus"); 
        
        lhaunotsikko = new JLabel("-------------------------------------------------------------------------------Haun tulokset-------------------------------------------------------------------------");
        lhaunotsikko.setForeground(Color.LIGHT_GRAY);
        lhauntulos = new JLabel("");
        lhauntulos.setForeground(Color.LIGHT_GRAY);

        luepelinkuvauspaneeli.add(lluepelinkuvaus);
        luepelinkuvauspaneeli.add(tluepelinkuvaus_pnimi);
        luepelinkuvauspaneeli.add(bluepelinkuvaus);
        luepelinkuvauspaneeli.setBackground(Color.DARK_GRAY);
        
        luepelitunnitpaneeli.add(lluepelitunnit);
        luepelitunnitpaneeli.add(tluepelitunnit_knimi);
        luepelitunnitpaneeli.add(bluepelitunnit);
        luepelitunnitpaneeli.setBackground(Color.DARK_GRAY);
        
        poistapelipaneeli.add(lpoistapeli);
        poistapelipaneeli.add(tpoistapeli_pnimi);
        poistapelipaneeli.add(bpoistapeli);
        poistapelipaneeli.setBackground(Color.DARK_GRAY);

        poistaesinepaneeli.add(lpoistaesine);
        poistaesinepaneeli.add(tpoistaesine_enimi);
        poistaesinepaneeli.add(bpoistaesine);
        poistaesinepaneeli.setBackground(Color.DARK_GRAY);

        muokkaapelitunnitpaneeli.add(lmuokkaapelitunnut);
        muokkaapelitunnitpaneeli.add(tmuokkaapelitunnit_knimi);
        muokkaapelitunnitpaneeli.add(tmuokkaapelitunnit_pelitunnit);
        muokkaapelitunnitpaneeli.add(bmuutapelitunnit);
        muokkaapelitunnitpaneeli.setBackground(Color.DARK_GRAY);

        muokkaarankpaneeli.add(lmuokkaarank);
        muokkaarankpaneeli.add(tmuokkaarank_knimi);
        muokkaarankpaneeli.add(tmuokkaarank_rankmäärä);
        muokkaarankpaneeli.add(bmuutarank);
        muokkaarankpaneeli.setBackground(Color.DARK_GRAY);

        käyttäjäpaneeli.add(lkäyttäjä);
        käyttäjäpaneeli.add(tkäyttäjänimi);
        käyttäjäpaneeli.add(bluokäyttäjä);
        käyttäjäpaneeli.setBackground(Color.DARK_GRAY);

        pelipaneeli.add(lpeli);
        pelipaneeli.add(tpelinimi);
        pelipaneeli.add(tpelikuvaus);
        pelipaneeli.add(bluopeli);
        pelipaneeli.setBackground(Color.DARK_GRAY);

        yhteisöpaneeli.add(lyhteisö);
        yhteisöpaneeli.add(tyhteisönimi);
        yhteisöpaneeli.add(tyhteisökuvaus);
        yhteisöpaneeli.add(bluoyhteisö);
        yhteisöpaneeli.setBackground(Color.DARK_GRAY);

        esinepaneeli.add(lesine);
        esinepaneeli.add(tesinenimi);
        esinepaneeli.add(bluoesine);
        esinepaneeli.setBackground(Color.DARK_GRAY);

        lisääkäyttäjälleyhteisö.add(llisääyhteisöön);
        lisääkäyttäjälleyhteisö.add(tlisääkäyttäjäyhteisöön_ynimi);
        lisääkäyttäjälleyhteisö.add(tlisääkäyttäjäyhteisöön_knimi);
        lisääkäyttäjälleyhteisö.add(blisääyhteisö);
        lisääkäyttäjälleyhteisö.setBackground(Color.DARK_GRAY);

        lisääpelikäyttäjälle.add(llisääpelikäyttäjälle);
        lisääpelikäyttäjälle.add(tlisääpelikäyttäjälle_pnimi);
        lisääpelikäyttäjälle.add(tlisääpelikäyttäjälle_knimi);
        lisääpelikäyttäjälle.add(blisääpeli);
        lisääpelikäyttäjälle.setBackground(Color.DARK_GRAY);

        lisääesinekäyttäjälle.add(llisääesinekäyttäjälle);
        lisääesinekäyttäjälle.add(tlisääesinekäyttäjälle_enimi);
        lisääesinekäyttäjälle.add(tlisääesinekäyttäjälle_knimi);
        lisääesinekäyttäjälle.add(blisääesine);
        lisääesinekäyttäjälle.setBackground(Color.DARK_GRAY);

        aloitus.add(steamheader1);
        aloitus.add(steamlogokuva1);
        aloitus.add(bLUO1);
        aloitus.add(bLIITÄ1);
        aloitus.add(bMUOKKAA1);
        aloitus.add(bLUE1);
        aloitus.add(bPOISTA1);
        aloitus.setBackground(Color.DARK_GRAY);

        kaikkiluomiset.add(steamheader2);
        kaikkiluomiset.add(steamlogokuva2);
        kaikkiluomiset.add(bLUO2);
        kaikkiluomiset.add(bLIITÄ2);
        kaikkiluomiset.add(bMUOKKAA2);
        kaikkiluomiset.add(bLUE2);
        kaikkiluomiset.add(bPOISTA2);
        kaikkiluomiset.add(käyttäjäpaneeli);
        kaikkiluomiset.add(pelipaneeli);
        kaikkiluomiset.add(yhteisöpaneeli);
        kaikkiluomiset.add(esinepaneeli);
        kaikkiluomiset.setBackground(Color.DARK_GRAY);

        kaikkiliittämiset.add(steamheader3);
        kaikkiliittämiset.add(steamlogokuva3);
        kaikkiliittämiset.add(bLUO3);
        kaikkiliittämiset.add(bLIITÄ3);
        kaikkiliittämiset.add(bMUOKKAA3);
        kaikkiliittämiset.add(bLUE3);
        kaikkiliittämiset.add(bPOISTA3);
        kaikkiliittämiset.add(lisääpelikäyttäjälle);
        kaikkiliittämiset.add(lisääesinekäyttäjälle);
        kaikkiliittämiset.add(lisääkäyttäjälleyhteisö);
        kaikkiliittämiset.setBackground(Color.DARK_GRAY);

        kaikkimuokkaamiset.add(steamheader4);
        kaikkimuokkaamiset.add(steamlogokuva4);
        kaikkimuokkaamiset.add(bLUO4);
        kaikkimuokkaamiset.add(bLIITÄ4);
        kaikkimuokkaamiset.add(bMUOKKAA4);
        kaikkimuokkaamiset.add(bLUE4);
        kaikkimuokkaamiset.add(bPOISTA4);
        kaikkimuokkaamiset.add(muokkaarankpaneeli);
        kaikkimuokkaamiset.add(muokkaapelitunnitpaneeli);
        kaikkimuokkaamiset.setBackground(Color.DARK_GRAY);

        kaikkipoistamiset.add(steamheader5);
        kaikkipoistamiset.add(steamlogokuva5);
        kaikkipoistamiset.add(bLUO5);
        kaikkipoistamiset.add(bLIITÄ5);
        kaikkipoistamiset.add(bMUOKKAA5);
        kaikkipoistamiset.add(bLUE5);
        kaikkipoistamiset.add(bPOISTA5);
        kaikkipoistamiset.add(poistaesinepaneeli);
        kaikkipoistamiset.add(poistapelipaneeli);
        kaikkipoistamiset.setBackground(Color.DARK_GRAY);
        
        kaikkilukemiset.add(steamheader6);
        kaikkilukemiset.add(steamlogokuva6);
        kaikkilukemiset.add(bLUO6);
        kaikkilukemiset.add(bLIITÄ6);
        kaikkilukemiset.add(bMUOKKAA6);
        kaikkilukemiset.add(bLUE6);
        kaikkilukemiset.add(bPOISTA6);
        kaikkilukemiset.add(luepelitunnitpaneeli);
        kaikkilukemiset.add(luepelinkuvauspaneeli);
        kaikkilukemiset.add(lhaunotsikko);
        kaikkilukemiset.add(lhauntulos);
        kaikkilukemiset.setBackground(Color.DARK_GRAY);

        sisältöpaneeli.add(aloitus, "1");
        sisältöpaneeli.add(kaikkiliittämiset, "2");
        sisältöpaneeli.add(kaikkiluomiset, "3");
        sisältöpaneeli.add(kaikkimuokkaamiset, "4");
        sisältöpaneeli.add(kaikkipoistamiset, "5");
        sisältöpaneeli.add(kaikkilukemiset, "6");
        cl.show(sisältöpaneeli, "1");
        add(sisältöpaneeli);
        pack();
        setVisible(true);
        
        bLUO1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "3");
            }
        });
        bLUO2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "3");
            }
        });
        bLUO3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "3");
            }
        });
        bLUO4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "3");
            }
        });
        bLUO5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "3");
            }
        });
        bLUO6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "3");
            }
        });

        bLIITÄ1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "2");
            }
        });
        bLIITÄ2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "2");
            }
        });
        bLIITÄ3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "2");
            }
        });
        bLIITÄ4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "2");
            }
        });
        bLIITÄ5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "2");
            }
        });
        bLIITÄ6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "2");
            }
        });

        bMUOKKAA1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "4");
            }
        });
        bMUOKKAA2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "4");
            }
        });
        bMUOKKAA3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "4");
            }
        });
        bMUOKKAA4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "4");
            }
        });
        bMUOKKAA5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "4");
            }
        });
        bMUOKKAA6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "4");
            }
        });

        bPOISTA1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "5");
            }
        });
        bPOISTA2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "5");
            }
        });
        bPOISTA3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "5");
            }
        });
        bPOISTA4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "5");
            }
        });
        bPOISTA5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "5");
            }
        });
        bPOISTA6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "5");
            }
        });
        bLUE1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "6");
            }
        });
        bLUE2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "6");
            }
        });
        bLUE3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "6");
            }
        });
        bLUE4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "6");
            }
        });
        bLUE5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "6");
            }
        });
        bLUE6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(sisältöpaneeli, "6");
            }
        });
        bluokäyttäjä.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.luoKäyttäjä(tkäyttäjänimi.getText());
            }
        });
        
        bluopeli.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.luoPeli(tpelinimi.getText(), tpelikuvaus.getText());
            }
        });
        
        bluoesine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.luoEsine(tesinenimi.getText());
            }
        });
        
        bluoyhteisö.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.luoYhteisö(tyhteisönimi.getText(), tyhteisökuvaus.getText());
            }
        });
        blisääyhteisö.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.lisääKäyttäjäRyhmään(tlisääkäyttäjäyhteisöön_knimi.getText(),
                        tlisääkäyttäjäyhteisöön_ynimi.getText());
            }
        });
        blisääpeli.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.lisääKäyttäjällePeli(tlisääpelikäyttäjälle_knimi.getText(),
                        tlisääpelikäyttäjälle_pnimi.getText());
            }
        });
        blisääesine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.lisääKäyttäjälleEsine(tlisääesinekäyttäjälle_knimi.getText(),
                        tlisääesinekäyttäjälle_enimi.getText());
            }
        });
        bmuutarank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.muutaRank(tmuokkaarank_knimi.getText(),
                        Integer.parseInt(tmuokkaarank_rankmäärä.getText()));
            }
        });
        
        bmuutapelitunnit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.muutaPelitunnit(tmuokkaapelitunnit_knimi.getText(),
                        Double.parseDouble(tmuokkaapelitunnit_pelitunnit.getText()));
            }
        });
        bluepelitunnit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lhauntulos.setText(String.valueOf(ohjain.luePelitunnit(tluepelitunnit_knimi.getText())));
            }
        });
        
        bluepelinkuvaus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lhauntulos.setText(ohjain.luePelikuvaus(tluepelinkuvaus_pnimi.getText()));
            }
        });
        
        bpoistaesine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.poistaEsine(tpoistaesine_enimi.getText());
            }
        });
        
        bpoistapeli.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ohjain.poistaPeli(tpoistapeli_pnimi.getText());
            }
        });
        
       

        setSize(700, 450);
        setResizable(false);
    }
}