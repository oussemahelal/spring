package groupe.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import groupe.demo.metier.OperationMetier;
import groupe.demo.metier.PageOperations;

@RestController
public class OperationRestService {
	@Autowired
	private OperationMetier operationMetier;
	@RequestMapping(value = "/operations", method = RequestMethod.GET)
	public PageOperations getoperations(@RequestParam String codeCompte,
			@RequestParam int Page,@RequestParam int size) {
		System.out.println("codecompte  "+codeCompte);
		return operationMetier.getoperations(codeCompte, Page, size);
	}

	@RequestMapping(value = "/versement" ,method = RequestMethod.PUT)
	public boolean verser(@RequestParam String code,
			@RequestParam double montant) {
		return operationMetier.verser(code, montant);
	}

	@RequestMapping(value = "/retrait" ,method = RequestMethod.PUT)
	public boolean retrait(@RequestParam String code,
			@RequestParam double montant){
		return operationMetier.retrait(code, montant);
	}
	
	@RequestMapping(value = "/virement" ,method = RequestMethod.PUT)
	public boolean virement(@RequestParam String cpt1,
			@RequestParam String cpt2,
			@RequestParam double montant) {
		return operationMetier.virement(cpt1, cpt2, montant);
	}

}
