package im.iconic.too.controller;

import im.iconic.too.dto.ReservationDTO;
import im.iconic.too.dto.ReservationsDTO;
import im.iconic.too.model.Reservation;
import im.iconic.too.repository.ReservationRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Setter
@Getter
@RestController
@RequestMapping("/calendar")

public class CalendarController {

    @Autowired
    private ReservationRepository reservation;

    //quali funzioni deve avere il controller del calendario
    //visualization del calendario:
    //elenco dei giorni di un mese con le prenotazioni
    //una prenotazione è composta da:
    // - Data
    // - Ora inizio
    // - Ora fine
    // - Nome del dipendente
    // - Nome dell'oggetto prenotato
    //aggiungere una prenotazione
    //inviare un oggetto DTO (data transfer object)
    //modificare una prenotazione
    //eliminare una prenotazione


    //1. visualizzare il calendario
    @GetMapping("/show")
    public ResponseEntity<ReservationsDTO> showCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        Date date = calendar.getTime();

        ReservationsDTO reservations = new ReservationsDTO();
        reservations.setDate(date.toString());
        ArrayList<ReservationDTO> rsv = new ArrayList<>();
        reservations.setReservations(rsv);

        ReservationDTO one = new ReservationDTO();
        one.setDay("0");
        one.setMonth("0");
        one.setYear("2025");
        one.setStartTime("10:00");
        one.setEndTime("10:30");
        one.setEmployeeName("mario rossi");
        one.setObjectName("lab portatile");
        rsv.add(one);

        return ResponseEntity.ok().body(reservations);
    }

    @PostMapping(value= "/add", consumes= "application/json", produces="application/json")
    public ResponseEntity<Reservation> addReservation(ReservationDTO reservation) {
        Reservation save = new Reservation();
        return ResponseEntity.ok().body(save);
    }

    @DeleteMapping(value="/remove", consumes = "application/json", produces="application/json")
    public ResponseEntity<Reservation> removeReservation(ReservationDTO reservation) {
        Reservation save = new Reservation();

        return ResponseEntity.ok().body(save);
    }

    @PutMapping(value="/update", consumes="application/json", produces="application/json")
    public ResponseEntity<Reservation> updateReservation(ReservationDTO reservation, String day, String month, String year, String employeeName, String objectName) {
        Reservation save = new Reservation();

        return ResponseEntity.ok().body(save);
    }


}
