package groupe.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import groupe.demo.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{

}
