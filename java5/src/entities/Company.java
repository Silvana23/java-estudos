package entities;

public  class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company () {
		
	}
	
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			return getAnualIncome() *10;
		}else {
			return getAnualIncome() *0.16;
		}
	}
}