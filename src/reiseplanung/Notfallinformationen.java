package reiseplanung;

public class Notfallinformationen {
    private String kontakt;
    private String adresse;
    private String telefonnummer;

    
    public Notfallinformationen() {}


    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }


    @Override
    public String toString() {
        return  
                "Kontakt: " + kontakt + '\n' +
                "Adresse: " + adresse + '\n' +
                "Telefonnummer: " + telefonnummer + '\n'
                ;
    }
}
