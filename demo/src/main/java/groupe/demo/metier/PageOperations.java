package groupe.demo.metier;

import java.io.Serializable;
import java.util.List;

import groupe.demo.entity.Operation;

public class PageOperations implements Serializable{
	private List<Operation> operations;
	private int Page;
	private int TotalOperations;
	private int NombreOperations;
	private int TotalPages;
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	public int getPage() {
		return Page;
	}
	public void setPage(int page) {
		Page = page;
	}
	public int getTotalOperations() {
		return TotalOperations;
	}
	public void setTotalOperations(int totalOperations) {
		TotalOperations = totalOperations;
	}
	public int getNombreOperations() {
		return NombreOperations;
	}
	public void setNombreOperations(int nombreOperations) {
		NombreOperations = nombreOperations;
	}
	public int getTotalPages() {
		return TotalPages;
	}
	public void setTotalPages(int totalPages) {
		TotalPages = totalPages;
	}

}
