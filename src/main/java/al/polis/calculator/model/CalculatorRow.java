package al.polis.calculator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CalculatorRow {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private double firstNumber;
    @Column
    private double secondNumber;
    @Column
    private double result;
    @Column
    private String operator;

    
}
