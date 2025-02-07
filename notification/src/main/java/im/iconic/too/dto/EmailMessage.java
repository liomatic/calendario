package im.iconic.too.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessage {
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;

    private String subject;

    private String emailBody;


}
