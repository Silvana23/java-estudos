package entites;

public class Products {

	public String name; 
   public Double price;
   public int qtd;
	
	public Products() {
		
	}

	public Products(String name, Double price, int qtd) {
		super();
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
public double total() {
	return price * qtd;
}
}
