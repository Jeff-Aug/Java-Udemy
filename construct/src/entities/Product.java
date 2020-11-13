package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	/*construtor, necessariamente esse construtor ja recebe os parametros */
	public Product (String name1 , double price2,int quantity2) {
		/*this eh a forma de referencia, poderia ser o msm nome*/
		/*name ->paremetro do objeto (linha 4)
		 * name1 -> atributo do metodo*/
		this.name = name1;
		this.price = price2;
		this.quantity = quantity2;
	}	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) /*Configuracao*/
		+ ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}