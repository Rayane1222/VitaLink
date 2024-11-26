package ma.pfa.vitalinkbackend.Services.ManagersImpl;

import ma.pfa.vitalinkbackend.DAO.Entities.Appointment;
import ma.pfa.vitalinkbackend.DAO.Repositories.AppointmentRepository;
import ma.pfa.vitalinkbackend.Services.Managers.AppointmentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentManagerImpl implements AppointmentManager {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentManagerImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<Appointment> getAppointmentById(Long id) {
        return appointmentRepository.findById(id);
    }

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Long id, Appointment appointment) {
        if (appointmentRepository.existsById(id)) {
            appointment.setId(id);
            return appointmentRepository.save(appointment);
        } else {
            return null;
        }
    }

    @Override
    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }
}

