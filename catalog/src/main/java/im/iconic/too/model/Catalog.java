package im.iconic.too.model;

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
    private Long id;

    private String name;

    private String marca;

    private String modello;

    private Long unitaDisponibili;

    private Long unitaContenute;

    @Column(name = "codice", unique = true, nullable = false, length = 50)
    private String codice;

}
