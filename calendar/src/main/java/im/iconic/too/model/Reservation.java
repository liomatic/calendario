package im.iconic.too.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    private Long id;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date endReservation;

    @Column
    private  String objectName;

}
