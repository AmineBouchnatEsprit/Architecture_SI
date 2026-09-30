package tn.esprit.elyes_chaouch_4ssa3.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
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
public class Vehicule {
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    @ManyToMany
    @JoinTable(
            name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "vehicule_id"),
            inverseJoinColumns = @JoinColumn(name = "equipement_id")
    )
    private Set<Equipement> equipements;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idVehicule;

    public String immatriculation;
    public String marque;
    public String modele;

    @Enumerated(EnumType.STRING)
    public CategorieVehicule categorie;

    public BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    public StatutVehicule statut;
}
