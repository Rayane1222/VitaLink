package ma.pfa.vitalinkbackend.DAO.Repositories;

import ma.pfa.vitalinkbackend.DAO.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}

