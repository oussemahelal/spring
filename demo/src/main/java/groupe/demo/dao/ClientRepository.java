package groupe.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import groupe.demo.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>  {

}
