package tn.esprit.elyes_chaouch_4ssa3.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
@Table(name = "car")

public class voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Enumerated (EnumType.STRING)

    public couleur c;
}
