package ma.pfa.vitalinkbackend.Services.Managers;

import ma.pfa.vitalinkbackend.DAO.Entities.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentManager {
    List<Appointment> getAllAppointments();
    Optional<Appointment> getAppointmentById(Long id);
    Appointment createAppointment(Appointment appointment);
    Appointment updateAppointment(Long id, Appointment appointment);
    void deleteAppointment(Long id);
}

