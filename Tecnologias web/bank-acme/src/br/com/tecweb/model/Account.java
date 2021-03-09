/**
 * 
 */
package br.com.tecweb.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nando
 *
 */

public class Account {

	private Long id;
	private String number;
	private String agency;
	private Double balance;
	private Client client;
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
	
	
	public Account(Long id, String number, String agency, Double balance, Client client,
			List<Transaction> transactions) {	
		this.id = id;
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.client = client;
		this.transactions = transactions;
	}

	public Account() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Double withdraw(Double value) {
		if(this.balance >= value) {
			this.balance -= value;
		}
		this.transactions.add(createTransaction(this, value, "withdraw", LocalDateTime.now()));
		return this.balance;
	}
	
	public Double deposit(Double value) {
		this.transactions.add(createTransaction(this, value, "withdraw", LocalDateTime.now()));
		return this.balance += value;
	}
	
	public Double transfer(Account account, Double value) {

		if(this.balance >= value) {
			this.withdraw(value);
			account.deposit(value);
		}
		this.transactions.add(createTransaction(this, value, "withdraw", LocalDateTime.now()));
		return this.balance;
	}
	
	public List<Transaction> transaction(){
		return this.transactions;
	}
	
	private Transaction createTransaction(Account account, Double value, String typeTransaction, 
			LocalDateTime localDateTime) {
		Transaction transaction = new Transaction();
		transaction.setAccount(account);
		transaction.setValue(value);
		transaction.setTypeTransaction(typeTransaction);
		transaction.setDataTimeTransaction(formatDate(LocalDateTime.now()));
		
		return transaction;
	}
	
	private String formatDate(LocalDateTime date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dateNow = date.format(formatter);
		
		return dateNow;
	}
	
}







