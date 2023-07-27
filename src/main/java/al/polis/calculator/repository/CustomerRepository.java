package al.polis.calculator.repository;

import al.polis.calculator.model.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findByCity(String city);

    List<Customer> findByNameAndCity(String name, String city);
    
    // Java Persistence Query Language -> JPQL
    @Query("select c from Customer c where c.name = :name")
    List<Customer> kerkoiClientEmri(String name);
}
