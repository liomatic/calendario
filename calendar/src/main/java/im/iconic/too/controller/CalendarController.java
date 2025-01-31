package im.iconic.too.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/calendar")

public class CalendarController {
    //Funzionalità calendario
    //1. Visualizzare calendario: Elenco dei giorni di un mese con le prenotazioni
    // Prenotazione composta da:
    // - Data
    // - Ora di inizio
    // - Ora di fine
    // - Nome dipendente
    // - Nome oggetto prenotato
    //2. Aggiungere una prenotazione: Inserimento di una prenotazione
    //      inviare un oggetto DTO (Data Transfer Object) con i dati prenotazione
    //3. Modificare una prenotazione: modifica di una prenotazione
    //4. Eliminare una prenotazione: cancellazione

    @GetMapping("/show")
    public ResponseEntity<String> showCalendar(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        Date date = calendar.getTime();
        return ResponseEntity.ok(date.toString());
    }
}
