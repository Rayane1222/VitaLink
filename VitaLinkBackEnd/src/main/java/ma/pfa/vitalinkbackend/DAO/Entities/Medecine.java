package ma.pfa.vitalinkbackend.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medecine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private Double quantity;
    private Double discount;
    private String code;
    private String brand;
    private Boolean active;
    private String emailCompany;
    private LocalDate expiryDate;

    @Lob
    private byte[] image;
}

