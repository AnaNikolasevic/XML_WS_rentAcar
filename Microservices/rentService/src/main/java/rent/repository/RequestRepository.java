package rent.repository;

import rent.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface RequestRepository extends JpaRepository<Request, Long> {


}
