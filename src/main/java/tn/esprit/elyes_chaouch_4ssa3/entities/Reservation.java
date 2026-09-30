package tn.esprit.elyes_chaouch_4ssa3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Reservation {
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;

    @OneToOne
    @JoinColumn(name = "contrat_id")
    private Contrat contrat;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idReservation;

    public LocalDate dateDebut;
    public LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    public StatutReservation statut;
}
