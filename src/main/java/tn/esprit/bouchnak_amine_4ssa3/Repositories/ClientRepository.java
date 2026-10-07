package tn.esprit.bouchnak_amine_4ssa3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.bouchnak_amine_4ssa3.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
