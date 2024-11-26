package ma.pfa.vitalinkbackend.Web;


import ma.pfa.vitalinkbackend.DAO.Entities.Patient;
import ma.pfa.vitalinkbackend.Services.Managers.PatientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientManager patientManager;

    @Autowired
    public PatientController(PatientManager patientManager) {
        this.patientManager = patientManager;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientManager.getAllPatients();
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id) {
        return patientManager.getPatientById(id);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientManager.createPatient(patient);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientManager.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientManager.deletePatient(id);
    }
}

