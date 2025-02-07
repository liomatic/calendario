package im.iconic.too.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    private String form;
    private String to;
    private String objectName;
    private String email;
}
