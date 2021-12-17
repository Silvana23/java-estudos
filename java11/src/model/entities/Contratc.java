package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contratc {
	
	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment>  installments = new ArrayList<Installment>();
	
	public void Contract() {
		
	}

	public Contratc(Integer number, Date data, Double totalValue) {
		this.number = number;
		this.date = data;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getData() {
		return date;
	}

	public void setData(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

}
