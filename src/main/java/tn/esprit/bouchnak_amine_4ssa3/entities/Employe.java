package tn.esprit.bouchnak_amine_4ssa3.entities;

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

public class Employe {
    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idEmploye;

    public String nom;
    public String prenom;

    @Enumerated(EnumType.STRING)
    public RoleEmploye role;
}
