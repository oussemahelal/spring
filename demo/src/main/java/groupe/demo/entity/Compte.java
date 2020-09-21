package groupe.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public abstract class Compte implements Serializable {
	@Id
	private String CodeCompte;
	private Date DateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name = "CODE_CLI")
	private Client client;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Compte(String codeCompte, Date dateCreation, double solde) {
		super();
		CodeCompte = codeCompte;
		DateCreation = dateCreation;
		this.solde = solde;
	}

	public String getCodeCompte() {
		return CodeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		CodeCompte = codeCompte;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

}
