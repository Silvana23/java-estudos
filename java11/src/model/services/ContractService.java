package model.services;

import model.entities.Contratc;
import services.OnlinePaymentService;
public class ContractService {

	
	private OnlinePaymentService  onlinepaymentService;
	
	public ContractService(OnlinePaymentService onlinepaymentService) {
		this.onlinepaymentService = onlinepaymentService;
	}
     public void processContract(Contratc contract, int moths) {}
}