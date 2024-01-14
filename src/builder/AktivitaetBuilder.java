package builder;

import reiseplanung.Aktivitaet;
import reiseplanung.Reise;

import java.time.LocalDate;
import java.time.LocalTime;

public class AktivitaetBuilder {
    private ReiseBuilder reiseBuilder;
    private Aktivitaet aktivitaet;

    public AktivitaetBuilder(ReiseBuilder reiseBuilder, Reise reise) {
        this.reiseBuilder = reiseBuilder;
        this.aktivitaet = new Aktivitaet();
        reise.addAktivitaet(aktivitaet);
    }

    public AktivitaetBuilder beschreibung(String beschreibung) {
    	aktivitaet.setBeschreibung(beschreibung);
        return this;
    }

    public AktivitaetBuilder datum(LocalDate datum) {
    	aktivitaet.setDatum(datum);
        return this;
    }

    public AktivitaetBuilder zeit(LocalTime zeit) {
    	aktivitaet.setZeit(zeit);
        return this;
    }

    public AktivitaetBuilder ort(String ort) {
    	aktivitaet.setOrt(ort);
        return this;
    }

    public ReiseBuilder endeAktivitaet() {
        return reiseBuilder;
    }
}
