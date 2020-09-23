package groupe.demo.metier;

public interface OperationMetier {
	public boolean verser (String code, double montant);
	public boolean retrait (String code, double montant);
	public boolean virement (String cpt1, String cpt2 ,double montant);
	public PageOperations getoperations(String codeCompte, int Page, int size);
}
