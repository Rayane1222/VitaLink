package ma.pfa.vitalinkbackend.Services.ManagersImpl;


import ma.pfa.vitalinkbackend.DAO.Entities.Doctor;
import ma.pfa.vitalinkbackend.DAO.Repositories.DoctorRepository;
import ma.pfa.vitalinkbackend.Services.Managers.DoctorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorManagerImpl implements DoctorManager {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorManagerImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Optional<Doctor> getDoctorById(Long id) {
        return doctorRepository.findById(id);
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(Long id, Doctor doctor) {
        if (doctorRepository.existsById(id)) {
            doctor.setId(id);
            return doctorRepository.save(doctor);
        } else {
            return null;
        }
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}

