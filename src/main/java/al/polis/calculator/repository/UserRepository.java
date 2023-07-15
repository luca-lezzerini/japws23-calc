package al.polis.calculator.repository;

import al.polis.calculator.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUsername(String name);

    User findByUsernameAndPassword(String name, String psw);
}
