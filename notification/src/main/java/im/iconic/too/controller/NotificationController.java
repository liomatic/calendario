package im.iconic.too.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    //Inviare una conferma di prenotazione a un utente
    @PostMapping(value = "/send", produces = "application/json")
    public ResponseEntity<Boolean> sendNotification() {
        return ResponseEntity.ok().body(true);
    }

}
