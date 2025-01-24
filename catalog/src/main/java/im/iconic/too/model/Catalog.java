package im.iconic.too.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalog")
public class Catalog {

    @Id
    @JsonIgnore
    private Long id;

    @Column
    private String name;

    @Column
    private String marca;

    @Column
    private String modello;

    @Column
    private Long unitaDisponibili;

    @Column
    private Long unitaContenute;

    @Column
    private String tipologia;

    @Column(name = "codice", unique = true, nullable = false, length = 50)
    private String codice;

}
