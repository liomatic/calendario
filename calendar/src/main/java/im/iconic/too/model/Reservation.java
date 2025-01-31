package im.iconic.too.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    private long id;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date startReservation;

    @Column @Temporal(TemporalType.TIMESTAMP)
    private Date endReservation;

    @Column
    private String objectName;
}
