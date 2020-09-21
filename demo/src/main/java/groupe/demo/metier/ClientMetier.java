package groupe.demo.metier;

import java.util.List;

import groupe.demo.entity.Client;

public interface ClientMetier {
	public Client SaveClient(Client c);
	public List<Client> listClient();

}
