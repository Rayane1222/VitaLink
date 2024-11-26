package ma.pfa.vitalinkbackend.Services.Managers;

import ma.pfa.vitalinkbackend.DAO.Entities.Doctor;
import java.util.List;
import java.util.Optional;

public interface DoctorManager {
    List<Doctor> getAllDoctors();
    Optional<Doctor> getDoctorById(Long id);
    Doctor createDoctor(Doctor doctor);
    Doctor updateDoctor(Long id, Doctor doctor);
    void deleteDoctor(Long id);
}

