package reiseplanung;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reise {
	private String bezeichnung;
    private List<Flug> fluege;
    private List<Hotel> hotels;
    private List<Mietwagen> mietwagen;
    private List<Aktivitaet> aktivitaeten;
    private List<Restaurant> restaurants;
    private Notfallinformationen notfallinformationen;

    
    
    public Reise(String bezeichnung) {
        this.bezeichnung = Objects.requireNonNull(bezeichnung, "Bezeichnung darf nicht null sein");
        this.fluege = new ArrayList<>();
        this.hotels = new ArrayList<>();
        this.mietwagen = new ArrayList<>();
        this.aktivitaeten = new ArrayList<>();
        this.restaurants = new ArrayList<>();
    }


	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = Objects.requireNonNull(bezeichnung, "Bezeichnung darf nicht null sein");
    }


	public List<Flug> getFluege() {
		return fluege;
	}
	public void addFlug(Flug flug) {
		this.fluege.add(flug);
	}


	public List<Hotel> getHotels() {
		return hotels;
	}
	public void addHotel(Hotel hotel) {
		this.hotels.add(hotel);
	}


	public List<Mietwagen> getMietwagen() {
		return mietwagen;
	}
	public void addMietwagen(Mietwagen mietwagen) {
		this.mietwagen.add(mietwagen);
	}


	public List<Aktivitaet> getAktivitaeten() {
		return aktivitaeten;
	}
	public void addAktivitaet(Aktivitaet aktivitaet) {
		this.aktivitaeten.add(aktivitaet);
	}


	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	public void addRestaurant(Restaurant restaurant) {
		this.restaurants.add(restaurant);
	}
	
	
	public Notfallinformationen getNotfallinformationen() {
		return notfallinformationen;
	}
	public void setNotfallinformationen(Notfallinformationen notfallinformationen) {
		this.notfallinformationen = notfallinformationen;
	}
	
	@Override
    public String toString() {
        return "Reise:" + '\n' +
                "Bezeichnung:" + bezeichnung +  '\n' + '\n' +
                "Flüge:" + '\n' + fluege + '\n' + '\n' +
                "Hotels:" + '\n' + hotels + '\n' + '\n' +
                "Mietwagen:" + '\n' + mietwagen + '\n' + '\n' +
                "Aktivitäten:" + '\n' + aktivitaeten + '\n' + '\n' +
                "Restaurants:" + '\n' + restaurants + '\n' + '\n' +
                "Notfallinformationen:" + '\n' + notfallinformationen + '\n'
                ;
    }

}


