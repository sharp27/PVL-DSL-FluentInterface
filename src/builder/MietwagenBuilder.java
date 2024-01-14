package builder;

import reiseplanung.Mietwagen;
import reiseplanung.Reise;

public class MietwagenBuilder {
	private ReiseBuilder reiseBuilder;
	private Mietwagen mietwagen;
	
	public MietwagenBuilder(ReiseBuilder reiseBuilder, Reise reise) {
		this.reiseBuilder = reiseBuilder;
		this.mietwagen = new Mietwagen();
		reise.addMietwagen(mietwagen);
	}
	
	public MietwagenBuilder typ(String typ) {
		mietwagen.setTyp(typ);
		return this;
	}
	
	public MietwagenBuilder abholort(String abholort) {
		mietwagen.setAbholort(abholort);
		return this;
	}
	
	public MietwagenBuilder rueckgabeort(String rueckgabeort) {
		mietwagen.setRueckgabeort(rueckgabeort);
		return this;
	}
	
	public MietwagenBuilder extras(String extras) {
		mietwagen.setExtras(extras);
		return this;
	}
	
	public ReiseBuilder endeMietwagen() {
        return reiseBuilder;
    }

}
