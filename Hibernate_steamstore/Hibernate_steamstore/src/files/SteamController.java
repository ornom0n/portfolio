	

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
     
    package files;
     
    /**
     *
     * @author henrikra && erikr
     */
    public class SteamController {
       
        private SteamView näkymä;
        DatabaseOperations database = new DatabaseOperations();
        public SteamController(SteamView näkymä) {
            this.näkymä = näkymä;
        }
       
        public static void main(String[] args) {
            SteamView näkymä = new SteamView();
            SteamController ohjain = new SteamController(näkymä);
            näkymä.rekisteröiOhjain(ohjain);  
        }
       
        public void luoKäyttäjä(String käyttäjänimi) {
            database.luoKäyttäjä(käyttäjänimi);
        }
        
        public void luoPeli(String nimi, String kuvaus){
            database.luoPeli(nimi, kuvaus);
        }
        
        public void luoYhteisö(String nimi, String kuvaus){
            database.luoYhteisö(nimi, kuvaus);
        }
       
        public void luoEsine(String nimi){
            database.luoEsine(nimi);
        }
        
        public void lisääKäyttäjäRyhmään(String kayttajanimi, String yhteisonimi){
            database.lisääKäyttäjäRyhmään(kayttajanimi, yhteisonimi);
        }
        
        public void lisääKäyttäjällePeli(String kayttajanimi, String pelinimi) {
            database.lisääKäyttäjällePeli(kayttajanimi, pelinimi);
        }
        
        public void lisääKäyttäjälleEsine(String kayttajanimi, String esinenimi) {
            database.lisääKäyttäjälleEsine(kayttajanimi, esinenimi);
        }
        
        public void muutaRank(String kayttajanimi, int rank) {
            database.muutaRank(kayttajanimi, rank);
        }
        
        public void muutaPelitunnit(String kayttajanimi, double tunnit) {
            database.muutaPelitunnit(kayttajanimi, tunnit);
        }
        
        public double luePelitunnit(String kayttajanimi) {
            return database.luePelitunnit(kayttajanimi);
        }
        
        public String luePelikuvaus(String pelinimi) {
            return database.luePelikuvaus(pelinimi);
        }
        
        public void poistaEsine(String esinenimi) {
            database.poistaEsine(esinenimi);
        }
        
        public void poistaPeli(String pelinimi) {
            database.poistaPeli(pelinimi);
        }
    }

