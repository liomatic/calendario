package im.iconic.too.controller;

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
    // - Data
    // - Nome del dipendente
    // - Nome dell'oggetto prenotato


    @GetMapping("/show")
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);
        Date date = calendar.getTime();

        reservations.setReservations(rsv);
        one.setDay("0");
        one.setMonth("0");
        one.setYear("2025");
    }
}
