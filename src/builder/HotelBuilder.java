package builder;

import reiseplanung.Hotel;
import reiseplanung.Reise;

import java.time.LocalDate;

public class HotelBuilder {
    private ReiseBuilder reiseBuilder;
    private Hotel hotel;

    public HotelBuilder(ReiseBuilder reiseBuilder, Reise reise) {
        this.reiseBuilder = reiseBuilder;
        this.hotel = new Hotel();
        reise.addHotel(hotel);
    }

    public HotelBuilder name(String name) {
        hotel.setName(name);
        return this;
    }

    public HotelBuilder checkIn(LocalDate checkIn) {
        hotel.setCheckIn(checkIn);
        return this;
    }

    public HotelBuilder checkOut(LocalDate checkOut) {
        hotel.setCheckOut(checkOut);
        return this;
    }

    public HotelBuilder zimmerTyp(String zimmerTyp) {
        hotel.setZimmerTyp(zimmerTyp);
        return this;
    }

    public HotelBuilder spezielleAnforderungen(String spezielleAnforderungen) {
        hotel.setSpezielleAnforderungen(spezielleAnforderungen);
        return this;
    }

    public ReiseBuilder endeHotel() {
        return reiseBuilder;
    }
}
