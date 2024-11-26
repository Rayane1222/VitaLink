package ma.pfa.vitalinkbackend.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.YearMonth;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String city;
    private String medical_condition;
    private Boolean gender;
    private String dateOfBirth;
    private String address;

    @Lob
    private byte[] picture;

    private String message;
}
