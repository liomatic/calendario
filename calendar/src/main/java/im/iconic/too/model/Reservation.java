package im.iconic.too.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    private Long id;

    @Column
    @Temporal(TemporalType.TIMESTAMP);
    private Date startReservation;

}
