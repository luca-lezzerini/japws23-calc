package al.polis.calculator.repository;

import al.polis.calculator.model.CalculatorRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRowRepository extends JpaRepository<CalculatorRow, Long>{

}
