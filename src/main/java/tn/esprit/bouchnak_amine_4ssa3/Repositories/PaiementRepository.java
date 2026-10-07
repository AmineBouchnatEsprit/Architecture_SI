package tn.esprit.bouchnak_amine_4ssa3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.bouchnak_amine_4ssa3.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
