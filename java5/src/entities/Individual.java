package entities;

public class Individual extends TaxPayer {

private Double healtExpenditures;

   public Individual () {
	   
   }
	
	
	public Individual(String name, Double anualIncome, Double healtExpenditures) {
		super(name, anualIncome);
		this.healtExpenditures = healtExpenditures;
	}

	public Double getHealtExpenditures() {
		return healtExpenditures;
	}

	public void setHealtExpenditures(Double healtExpenditures) {
		this.healtExpenditures = healtExpenditures;
	}
	@Override
	public double tax() {
	  double basicTax = 0;
	  if(getAnualIncome() < 20000.0 ) {
		  basicTax = getAnualIncome() *0.15;
	  }else {
		  basicTax = basicTax - getHealtExpenditures()*0.5;
		  if(basicTax < 0.0) {
			  basicTax = 0.0;
			  
		  }
	  }
		return basicTax;
}
}
