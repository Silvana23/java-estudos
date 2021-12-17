package model.entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date finish;
	
	private Vehicle vehicle;
	private Envoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(Date start, Date finish, Vehicle vehicle) {
		
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Object getEnvoice() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEnvoice(Envoice envoice) {
		// TODO Auto-generated method stub
		
	}
	
}
