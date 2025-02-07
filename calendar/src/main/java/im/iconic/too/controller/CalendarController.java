package im.iconic.too.controller;

import im.iconic.too.dto.ReservationDto;
import im.iconic.too.dto.ReservationsDto;
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
}
