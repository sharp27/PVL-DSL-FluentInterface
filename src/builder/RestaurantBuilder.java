package builder;

import reiseplanung.Restaurant;
import reiseplanung.Reise;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantBuilder {
    private ReiseBuilder reiseBuilder;
    private Restaurant restaurant;

    public RestaurantBuilder(ReiseBuilder reiseBuilder, Reise reise) {
        this.reiseBuilder = reiseBuilder;
        this.restaurant = new Restaurant();
        reise.addRestaurant(restaurant); 
    }

    public RestaurantBuilder name(String name) {
        restaurant.setName(name);
        return this;
    }

    public RestaurantBuilder artDerKueche(String artDerKueche) {
        restaurant.setArtDerKueche(artDerKueche);
        return this;
    }

    public RestaurantBuilder datum(LocalDate datum) {
        restaurant.setDatum(datum);
        return this;
    }

    public RestaurantBuilder uhrzeit(LocalTime uhrzeit) {
        restaurant.setUhrzeit(uhrzeit);
        return this;
    }

    public RestaurantBuilder spezielleWuensche(String spezielleWuensche) {
        restaurant.setSpezielleWuensche(spezielleWuensche);
        return this;
    }

    public ReiseBuilder endeRestaurant() {
        return reiseBuilder;
    }
}
