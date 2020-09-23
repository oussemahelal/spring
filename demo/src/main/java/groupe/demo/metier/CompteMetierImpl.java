package groupe.demo.metier;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groupe.demo.dao.CompteRepository;
import groupe.demo.entity.Compte;
@Service
public class CompteMetierImpl implements CompteMetier{
	@Autowired
	private CompteRepository compteRepository;
	@Override
	public Compte SaveCompte(Compte C) {
		C.setDateCreation(new Date());
		return compteRepository.save(C);
	}

	@Override
	public Compte getCompte(String code) {
		try {
			return compteRepository.findById(code).get();
		} catch (Exception e) {
			return null;
		}
		
	}

}
