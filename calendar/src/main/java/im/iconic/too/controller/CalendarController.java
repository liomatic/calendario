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

    @GetMapping("/show")
    public ResponseEntity<String> showCalendar(int month, int year) {
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
        one.setEmployerName("Mario Rossi");
        one.setObjectName("Lab portatile");
        rsv.add(one);

        return ResponseEntity.ok().body(reservations);
    }

}
