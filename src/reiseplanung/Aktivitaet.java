package reiseplanung;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aktivitaet {
    private String beschreibung;
    private LocalDate datum;
    private LocalTime zeit;
    private String ort;

    public Aktivitaet() {}

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getZeit() {
        return zeit;
    }

    public void setZeit(LocalTime zeit) {
        this.zeit = zeit;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return  '\n' +
                "Beschreibung: " + beschreibung + '\n' +
                "Datum: " + datum + '\n' +
                "Zeit: " + zeit + '\n' +
                "Ort: " + ort + '\n'
                ;
    }
 }
                
