package im.iconic.too.controller;

import im.iconic.too.dto.ReservationDto;
import im.iconic.too.dto.ReservationsDto;
import im.iconic.too.model.Reservation;
import im.iconic.too.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @Autowired
    private ReservationRepository repository;

    //Quali funzioni deve avere il controller del calendario?
    //1. Visualizzare il calendario:
    //   Elenco dei giorni di un mese con le prenotazioni
    //   Una prenotazione è composta da:
    //   - Data
    //   - Ora di inizio
    //   - Ora di fine
    //   - Nome del dipendente
    //   - Nome dell'oggeto prenotato
    //2. Aggiungere una prenotazione: Inserimento di una prenotazione
    //   inviare un oggetto DTP (Data Transfer Object)
    //   con i dati della prenotazione
    //3. Modificare una prenotazione: Modifica di una pre
    //4. Eliminare una prenotazione: Cancellazione di una prenotazione

    //1. Visualizzare il calendario
    @GetMapping(value = "/show", produces = "application/json")
    public ResponseEntity<ReservationsDto> showCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        Date date = calendar.getTime();

        ReservationsDto reservations = new ReservationsDto();
        reservations.setDate(date.toString());
        ArrayList<ReservationDto> rsv = new ArrayList<>();
        reservations.setReservations(rsv);

        ReservationDto one = new ReservationDto();
        one.setDay("0");
        one.setMonth("0");
        one.setYear("2025");
        one.setStartTime("10:00");
        one.setEndTime("12:00");
        one.setEmployeeName("Mario Rossi");
        one.setObjectName("Lab portatile");
        rsv.add(one);

        return ResponseEntity.ok().body(reservations);
    }

    //- Registrare una nuova prenotazione in un determinato giorno
    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Reservation> addReservation(ReservationDto reservation) {
        Reservation save = new Reservation();
        return ResponseEntity.ok().body(save);
    }

    //- Eliminare una prenotazione esistente
    @DeleteMapping(value = "/delete/{id}", produces = "application/json")
    public ResponseEntity<Reservation> deleteReservation(@PathVariable Long id) {
        Reservation delete = new Reservation();
        return ResponseEntity.ok().body(delete);
    }

    //- Ottenere la lista delle prenotazioni per un determinato giorno
    @GetMapping(value = "/get/{day}/{month}/{year}", produces = "application/json")
    public ResponseEntity<ReservationsDto> getReservations(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        ReservationsDto reservations = new ReservationsDto();
        ArrayList<ReservationDto> rsv = new ArrayList<>();
        reservations.setReservations(rsv);

        ReservationDto one = new ReservationDto();
        rsv.add(one);

        return ResponseEntity.ok().body(reservations);
    }

    //-Restituire la disponibilità per un periodo specifico
    //Se la prenotazione è possibile, allora risponde con true, altrimenti false
    @GetMapping(value = "/check", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Boolean> checkAvailability(@RequestBody ReservationDto reservation) {
        return ResponseEntity.ok().body(true);
    }
}
