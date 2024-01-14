package reiseplanung;

import java.time.LocalDateTime;

public class Flug {
	private String von;
    private String nach;
    private LocalDateTime abflug;
    private LocalDateTime ankunft;
    private String flugnummer;
    private String sitz;
    private String gepaeck;

    
    public Flug() {}
    
    
    public String getVon() {
        return von;
    }

    public void setVon(String von) {
        this.von = von;
    }

    public String getNach() {
        return nach;
    }

    public void setNach(String nach) {
        this.nach = nach;
    }

    public LocalDateTime getAbflug() {
        return abflug;
    }

    public void setAbflug(LocalDateTime abflug) {
        this.abflug = abflug;
    }

    public LocalDateTime getAnkunft() {
        return ankunft;
    }

    public void setAnkunft(LocalDateTime ankunft) {
        this.ankunft = ankunft;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }

    public String getSitz() {
        return sitz;
    }

    public void setSitz(String sitz) {
        this.sitz = sitz;
    }

    public String getGepaeck() {
        return gepaeck;
    }

    public void setGepaeck(String gepaeck) {
        this.gepaeck = gepaeck;
    }


    @Override
    public String toString() {
        return  '\n' +
        		"von: " + von + '\n' +
                "nach: " + nach + '\n' +
                "Abflug: " + abflug + '\n' +
                "Ankunft: " + ankunft + '\n' +
                "Flugnummer: " + flugnummer + '\n' +
                "Sitz: " + sitz + '\n' +
                "Gepäck: " + gepaeck + '\n'
                ;
    }
}

