package builder;

import reiseplanung.Notfallinformationen;
import reiseplanung.Reise;

public class NotfallinformationenBuilder {
	private ReiseBuilder reiseBuilder;
	private Notfallinformationen notfallinformationen;
	
	public NotfallinformationenBuilder(ReiseBuilder reiseBuilder, Reise reise) {
	    this.reiseBuilder = reiseBuilder;
	    this.notfallinformationen = new Notfallinformationen();
	    reise.setNotfallinformationen(notfallinformationen); 
	}

	public NotfallinformationenBuilder kontakt(String kontakt) {
	    notfallinformationen.setKontakt(kontakt);
	    return this;
	}

	public NotfallinformationenBuilder adresse(String adresse) {
	    notfallinformationen.setAdresse(adresse);
	    return this;
	}
	
	public NotfallinformationenBuilder telefonnummer(String telefonnummer) {
	    notfallinformationen.setTelefonnummer(telefonnummer);
	    return this;
	}

	public ReiseBuilder endeNotfallinformationen() {
	    return reiseBuilder;
	}



}
