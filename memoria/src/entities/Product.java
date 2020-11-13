package entities;

public class Product {
	
	private String produto;
	private double price;
	private double media=0;
	
	
	public Product(String produto, double price,double media) {
	
		this.produto = produto;
		this.price = price;
		this.media += media;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	public double getMedia() {
		return media;
	}
	
	public String toString() {
		return "Account "
				+ produto
				+ ", Holder: "
				+ price;
	}
	
}
