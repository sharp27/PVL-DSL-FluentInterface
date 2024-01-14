package reiseplanung;

import java.time.LocalDate;
import java.time.LocalTime;

public class Restaurant {
    private String name;
    private String artDerKueche;
    private LocalDate datum;
    private LocalTime uhrzeit;
    private String spezielleWuensche;

    
    public Restaurant() {}

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtDerKueche() {
        return artDerKueche;
    }

    public void setArtDerKueche(String artDerKueche) {
        this.artDerKueche = artDerKueche;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(LocalTime uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getSpezielleWuensche() {
    	return spezielleWuensche;
    }
    
    public void setSpezielleWuensche(String spezielleWuensche) {
        this.spezielleWuensche = spezielleWuensche;
    }
    
    @Override
    public String toString() {
        return  '\n' +
                "Name: " + name + '\n' +
                "Art der Küche: " + artDerKueche + '\n' +
                "Datum: " + datum + '\n' +
                "Uhrzeit: " + uhrzeit + '\n' +
                "Spezielle Wünsche: " + spezielleWuensche + '\n'
                ;
    }
}
    
