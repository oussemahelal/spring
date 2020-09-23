package groupe.demo.metier;

import groupe.demo.entity.Compte;
import java.util.List;
public interface CompteMetier {
	public Compte SaveCompte(Compte C);
	public Compte getCompte(String code);

}
