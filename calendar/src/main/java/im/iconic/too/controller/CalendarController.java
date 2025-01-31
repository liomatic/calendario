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
    //1 Visualizzare le prenotazioni:
    //Una prenotazione è composta da:
    // - Data
    // - Ora di inizio
    // - Ora di fine
    // - Nome del dipendente
    // - Nome dell'oggetto prenotato
    //2 Aggiungere prenotazioni:

    //3 Modificare prenotazoini
    //4 Eliminare prenotazioni

    // Visualizzare il calendario

    @GetMapping("/show")
    public ResponseEntity<String> showCalendar(int month, int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month, 1);
        Date date = calendar.getTime();

        ReservationDto reservations = new ReservationDto();
        reservations.setDay(date.toString());
        ArrayList<ReservationsDto> rsv = new ArrayList<>();
        reservations.setReservations(rsv);
        ReservationDto one = new ReservationDto();
        one.setDay("0");
        one.setMonth("0");
        one.setYear("2025");
        one.setEmployeeName("10:00");
        one.setEndTime("12:00");
        one.setEmployeeName("Mario Rossi");
        one.set
        return ResponseEntity.ok(date.toString());
    }
}
