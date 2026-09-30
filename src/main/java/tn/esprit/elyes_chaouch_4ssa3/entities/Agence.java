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
public class Agence {
    @OneToMany(mappedBy = "agence")
    private Set<Vehicule> vehicules;

    @OneToMany(mappedBy = "agence")
    private Set<Employe> employes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idAgence;

    public String nom;
    public String ville;
    public String adresse;
    public String telephone;
}
