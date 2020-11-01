package entities;

public class Product {
	
	public String name;
	public double Price;
	public  int qte;
	
	public double totalValueInStock() {
		return Price * qte;
	}
	
	public void alterar(int Mqt) {
		
		this.qte += Mqt;
		
	}
	public void remover(int Mqt) {
		
		this.qte -= Mqt;
		
	}
	
	public String toString() {
		
		return name + " ,$ " + String.format("%.2f", Price)+ ", " 
		+ qte + " units,Total: $ " + totalValueInStock();
					
	}
	
	
	
	

}
