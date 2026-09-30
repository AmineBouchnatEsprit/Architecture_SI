package tn.esprit.elyes_chaouch_4ssa3.entities;

import jakarta.persistence.*;
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

public class Equipement {
    @ManyToMany(mappedBy = "equipements")
    private Set<Vehicule> vehicules;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idEquipement;

    public String libelle;
}
