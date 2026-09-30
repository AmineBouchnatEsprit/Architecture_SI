package tn.esprit.elyes_chaouch_4ssa3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Maintenance {
    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMaintenance;

    public LocalDate dateDebut;
    public LocalDate dateFin;
    public String description;
}
