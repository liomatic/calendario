package im.iconic.too.controller;

import im.iconic.too.dto.ReservationDTO;
import im.iconic.too.dto.ReservationsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/calendar")

public class CalendarController {

    //quali funzioni deve avere il controller del calendario
    //visualizzazione del calendario:
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





}
