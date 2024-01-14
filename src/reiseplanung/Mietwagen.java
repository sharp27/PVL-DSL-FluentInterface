package reiseplanung;

public class Mietwagen {
    private String typ; 
    private String abholort;
    private String rueckgabeort;
    private String extras; 

    public Mietwagen() {}

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getAbholort() {
        return abholort;
    }

    public void setAbholort(String abholort) {
        this.abholort = abholort;
    }

    public String getRueckgabeort() {
        return rueckgabeort;
    }

    public void setRueckgabeort(String rueckgabeort) {
        this.rueckgabeort = rueckgabeort;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return  '\n' +
                "Typ: " + typ + '\n' +
                "Abholort: " + abholort + '\n' +
                "Rückgabeort: " + rueckgabeort + '\n' +
                "Extras: " + extras + '\n'
                ;
    }
}
