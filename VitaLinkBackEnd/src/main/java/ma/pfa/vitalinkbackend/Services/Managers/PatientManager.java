package ma.pfa.vitalinkbackend.Services.Managers;

import ma.pfa.vitalinkbackend.DAO.Entities.Patient;
import java.util.List;
import java.util.Optional;

public interface PatientManager {
    List<Patient> getAllPatients();
    Optional<Patient> getPatientById(Long id);
    Patient createPatient(Patient patient);
    Patient updatePatient(Long id, Patient patient);
    void deletePatient(Long id);
}
