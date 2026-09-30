package tn.esprit.bouchnak_amine_4ssa3.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
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
public class Contrat {
    @OneToOne(mappedBy = "contrat")
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat")
    private Set<Paiement> paiements;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idContrat;

    public LocalDate dateSignature;
    public BigDecimal montantTotal;
    public boolean valide;
}
