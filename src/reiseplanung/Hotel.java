package reiseplanung;

import java.time.LocalDate;

public class Hotel {
    private String name;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String zimmerTyp; 
    private String spezielleAnforderungen; 

    public Hotel() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getZimmerTyp() {
        return zimmerTyp;
    }

    public void setZimmerTyp(String zimmerTyp) {
        this.zimmerTyp = zimmerTyp;
    }

    public String getSpezielleAnforderungen() {
        return spezielleAnforderungen;
    }

    public void setSpezielleAnforderungen(String spezielleAnforderungen) {
        this.spezielleAnforderungen = spezielleAnforderungen;
    }


    @Override
    public String toString() {
        return  '\n' + 
                "Name: " + name + '\n' +
                "CheckIn: " + checkIn + '\n' +
                "CheckOut: " + checkOut + '\n' +
                "Zimmer Typ: " + zimmerTyp +  '\n' +
                "Spezielle Anforderungen: " + spezielleAnforderungen + '\n'
                ;
    }
}
