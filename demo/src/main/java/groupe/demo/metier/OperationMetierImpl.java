package groupe.demo.metier;

import java.util.Date;

import javax.management.RuntimeErrorException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import groupe.demo.dao.CompteRepository;
import groupe.demo.dao.OperationRepository;
import groupe.demo.entity.Compte;
import groupe.demo.entity.Operation;
import groupe.demo.entity.Retrait;
import groupe.demo.entity.Versement;
@Service
public class OperationMetierImpl implements OperationMetier{
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Override
	@Transactional
	public boolean verser(String code, double montant) {
		Compte cp =compteRepository.getOne(code);
		Operation o = new Versement();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()+montant);
		return true;
	}

	@Override
	@Transactional
	public boolean retrait(String code, double montant) {
		Compte cp =compteRepository.getOne(code);
		if(cp.getSolde()<montant) throw new RuntimeException("Solde Insuffisant");
		Operation o = new Retrait();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()-montant);
		return true;
	}

	@Override
	@Transactional
	public boolean virement(String cpt1, String cpt2, double montant) {
		retrait(cpt1, montant);
		verser(cpt2, montant);
		return true;
	}

	@Override
	public PageOperations getoperations(String codeCompte, int Page, int size) {
		Page<Operation> ops = operationRepository.getOperations
				(codeCompte,PageRequest.of(Page, size));
		System.out.println("codecompte is "+codeCompte);
		PageOperations pOperation = new PageOperations();
		pOperation.setOperations(ops.getContent());
		pOperation.setNombreOperations(ops.getNumberOfElements());
		pOperation.setPage(ops.getNumber());
		pOperation.setTotalPages(ops.getTotalPages());
		pOperation.setTotalOperations((int)ops.getTotalElements());
		return pOperation; 
	}
}
