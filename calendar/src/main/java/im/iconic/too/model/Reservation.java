package im.iconic.too.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date endReservation;

    @Column
    private  String objectName;
}
