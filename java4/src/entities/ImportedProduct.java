package entities;


public class ImportedProduct extends Product{
	private Double CustomsFee;
	
	public ImportedProduct(String name , Double price , Double customsFee) {
		super(name, price);
		this.CustomsFee= customsFee;

	}

	public ImportedProduct(Double customsFee) {
		
		CustomsFee = customsFee;
	}

	public Double getCustomsFee() {
		return CustomsFee;
	}

	public void setCustomsFee(Double customsFee) {
		CustomsFee = customsFee;

	}
		public Double totalPrice() {
		return getPrice() + CustomsFee ;
	}
	
		@Override
		public String priceTag() {
			return getName() 
					+ " $ " 
					+ String.format("%.2f", totalPrice())
					+ " (Customs fee: $ " 
					+ String.format("%.2f", CustomsFee)
					+ ")";
		}	
}


