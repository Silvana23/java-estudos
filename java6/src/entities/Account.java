package entities;

import exceptions.BussinesException;

public class Account {

public int number;
public String holder;
public Double balance;
public Double withdrawLimit;
public Double withdraw;


public  Account() {
	
}


public Account(int number, String holder, Double balance, Double withdrawLimit) {
	
	this.number = number;
	this.holder = holder;
	this.balance = balance;
	this.withdrawLimit = withdrawLimit;
}


public int getNumber() {
	return number;
}


public void setNumber(int number) {
	this.number = number;
}


public String getHolder() {
	return holder;
}


public void setHolder(String holder) {
	this.holder = holder;
}


public Double getBalance() {
	return balance;
}


public void setBalance(Double balance) {
	this.balance = balance;
}


public Double getWithdrawLimit() {
	return withdrawLimit;
}


public void setWithdrawLimit(Double withdrawLimit) {
	this.withdrawLimit = withdrawLimit;
}
public void deposit(double amount) {
	balance += amount;
}
public void withdraw(double amount) {
	validateWithdraw(amount);
	balance -= amount;
}
private void validateWithdraw(double amount) {
	if(amount > getWithdrawLimit()) {
		throw new BussinesException("a quantia excede o limite de saque");
}
	if(amount > getBalance()) {
		throw new BussinesException  (" erro de saque : saldo insuficiente");
	}

}
}