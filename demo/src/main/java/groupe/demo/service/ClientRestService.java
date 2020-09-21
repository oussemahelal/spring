package groupe.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import groupe.demo.entity.Client;
import groupe.demo.metier.ClientMetier;

@RestController
public class ClientRestService {
	@Autowired
	private ClientMetier clientMetier;

	@RequestMapping(value = "/clients", method = RequestMethod.POST)
	public Client SaveClient(@RequestBody Client c) {
		System.out.println(c.getNomClient());
		return clientMetier.SaveClient(c);
	}

	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}

}
