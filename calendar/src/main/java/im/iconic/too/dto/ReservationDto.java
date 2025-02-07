package im.iconic.too.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDto {

    private String day;
    private String month;
    private String year;
    private String startTime;
    private String endTime;
    private String employeeName;
    private String objectName;

}
