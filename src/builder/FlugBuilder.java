package builder;

import reiseplanung.Flug;
import reiseplanung.Reise;

import java.time.LocalDateTime;

public class FlugBuilder {
    private ReiseBuilder reiseBuilder;
    private Flug flug;

    public FlugBuilder(ReiseBuilder reiseBuilder, Reise reise) {
        this.reiseBuilder = reiseBuilder;
        this.flug = new Flug();
        reise.addFlug(flug);
    }

    public FlugBuilder von(String von) {
        flug.setVon(von);
        return this;
    }

    public FlugBuilder nach(String nach) {
        flug.setNach(nach);
        return this;
    }

    public FlugBuilder abflug(LocalDateTime abflug) {
        flug.setAbflug(abflug);
        return this;
    }

    public FlugBuilder ankunft(LocalDateTime ankunft) {
        flug.setAnkunft(ankunft);
        return this;
    }

    public FlugBuilder flugnummer(String flugnummer) {
        flug.setFlugnummer(flugnummer);
        return this;
    }

    public FlugBuilder sitz(String sitz) {
        flug.setSitz(sitz);
        return this;
    }

    public FlugBuilder gepaeck(String gepaeck) {
        flug.setGepaeck(gepaeck);
        return this;
    }

    public ReiseBuilder endeFlug() {
        return reiseBuilder;
    }
}
