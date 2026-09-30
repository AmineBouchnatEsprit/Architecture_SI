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
public class Client {
    @OneToMany(mappedBy = "client")
    private Set<Reservation> reservations;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idClient;

    public String nom;
    public String prenom;
    public String email;
    public String telephone;
    public String numPermis;
    public LocalDate dateInscription;
}
