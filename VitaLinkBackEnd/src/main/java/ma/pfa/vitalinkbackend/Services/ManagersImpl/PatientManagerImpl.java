package ma.pfa.vitalinkbackend.Services.ManagersImpl;


import ma.pfa.vitalinkbackend.DAO.Entities.Patient;
import ma.pfa.vitalinkbackend.DAO.Repositories.PatientRepository;
import ma.pfa.vitalinkbackend.Services.Managers.PatientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientManagerImpl implements PatientManager {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientManagerImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Long id, Patient patient) {
        if (patientRepository.existsById(id)) {
            patient.setId(id);
            return patientRepository.save(patient);
        } else {
            return null;
        }
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}

