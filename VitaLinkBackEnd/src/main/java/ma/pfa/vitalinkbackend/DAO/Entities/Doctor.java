package ma.pfa.vitalinkbackend.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String specialist;
    private String name;
    private String email;
    private String contact;

    @Lob
    private byte[] picture;
}

