package tn.esprit.elyes_chaouch_4ssa3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Vehicule {
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
