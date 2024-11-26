package ma.pfa.vitalinkbackend.Web;


import ma.pfa.vitalinkbackend.DAO.Entities.Doctor;
import ma.pfa.vitalinkbackend.Services.Managers.DoctorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorManager doctorManager;

    @Autowired
    public DoctorController(DoctorManager doctorManager) {
        this.doctorManager = doctorManager;
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorManager.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable Long id) {
        return doctorManager.getDoctorById(id);
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorManager.createDoctor(doctor);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        return doctorManager.updateDoctor(id, doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorManager.deleteDoctor(id);
    }
}

