package groupe.demo.metier;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import groupe.demo.dao.ClientRepository;
import groupe.demo.entity.Client;
@Service
public class ClientMetierImpl implements ClientMetier{
	@Autowired
	private ClientRepository clientRepository;
	@Override
	public Client SaveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
