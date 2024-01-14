package builder;

import reiseplanung.Reise;

public class ReiseBuilder {
	private Reise reise;

	public ReiseBuilder(String bezeichnung) {
        reise = new Reise(bezeichnung);
    }
    
    public FlugBuilder flug() {
        return new FlugBuilder(this, reise);
    }
    
    public HotelBuilder hotel() {
        return new HotelBuilder(this, reise);
    }

    public MietwagenBuilder mietwagen() {
        return new MietwagenBuilder(this, reise);
    }

    public AktivitaetBuilder aktivitaet() {
        return new AktivitaetBuilder(this, reise);
    }

    public RestaurantBuilder restaurant() {
        return new RestaurantBuilder(this, reise);
    }
    
    public NotfallinformationenBuilder notfallinformationen() {
        return new NotfallinformationenBuilder(this, reise);
    }

   
    public Reise build() {
        
        return reise;
    }

}
