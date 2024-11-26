package ma.pfa.vitalinkbackend.DAO.Repositories;

import ma.pfa.vitalinkbackend.DAO.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}

