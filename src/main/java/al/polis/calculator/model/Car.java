package al.polis.calculator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String plate;
    @Column
    private String model;
    
    @ManyToOne
    private Person owner;
}
