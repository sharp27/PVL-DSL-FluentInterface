package planer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import builder.ReiseBuilder;
import reiseplanung.Reise;

public class Reiseplaner {

	public static void main(String[] args) {
		
		ReiseBuilder builder = new ReiseBuilder("Sommerurlaub 2024");

        Reise meineReise = builder
            .flug()
                .von("Berlin")
                .nach("Paris")
                .abflug(LocalDateTime.of(2024, 7, 10, 8, 0))
                .ankunft(LocalDateTime.of(2024, 7, 10, 10, 0))
                .flugnummer("AB123")
                .sitz("12A")
                .gepaeck("Handgepäck")
                .endeFlug()
            .flug()
                .von("Paris")
                .nach("Berlin")
                .abflug(LocalDateTime.of(2024, 7, 20, 18, 0))
                .ankunft(LocalDateTime.of(2024, 7, 20, 20, 0))
                .flugnummer("AB456")
                .sitz("12B")
                .gepaeck("Handgepäck")
                .endeFlug()
            .hotel()
                .name("Hotel Paris Central")
                .checkIn(LocalDate.of(2024, 7, 10))
                .checkOut(LocalDate.of(2024, 7, 20))
                .zimmerTyp("Deluxe")
                .spezielleAnforderungen("Blick auf Eifelturm")
                .endeHotel()
            .mietwagen()
            	.typ("Kleinwagen")
            	.abholort("Paris Flughafen")
            	.rueckgabeort("Paris Flughafen")
            	.extras("Navi, Klimaanlage")
            	.endeMietwagen()
            .aktivitaet()
                .beschreibung("Besuch des Louvre")
                .datum(LocalDate.of(2024, 7, 12))
                .zeit(LocalTime.of(10, 0))
                .ort("Louvre Museum, Paris")
                .endeAktivitaet()
            .restaurant()
                .name("Chez Louis")
                .artDerKueche("Französisch")
                .datum(LocalDate.of(2024, 7, 13))
                .uhrzeit(LocalTime.of(19, 30))
                .spezielleWuensche("vegetarisch")
                .endeRestaurant()
            .notfallinformationen()
                .kontakt("Deutsche Botschaft in Paris")
                .adresse("Pariser Platz, Paris")
                .telefonnummer("+33 1 23456789")
                .endeNotfallinformationen()
            .build();

        System.out.println(meineReise);
    }
}

