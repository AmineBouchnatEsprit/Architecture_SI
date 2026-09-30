package tn.esprit.elyes_chaouch_4ssa3.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
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
public class Paiement {
    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private Contrat contrat;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idPaiement;

    public BigDecimal montant;
    public LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    public ModePaiement modePaiement;
}
