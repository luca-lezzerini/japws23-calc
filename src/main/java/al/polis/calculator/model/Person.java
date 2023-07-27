package al.polis.calculator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String firstName;
    @Column
    private String lastName;
    
    // the name of the corresponding property on the other side (Car)
    @OneToMany(mappedBy = "owner")
    private List<Car> ownedCars = new ArrayList<>();
}
