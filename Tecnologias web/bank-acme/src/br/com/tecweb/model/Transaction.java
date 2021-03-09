/**
 * 
 */
package br.com.tecweb.model;

/**
 * @author nando
 *
 */
public class Transaction {

	private Account account;
	private Double value;
	private String typeTransaction;
	private String dataTimeTransaction;
	
	public Transaction(Account account, Double value, String typeTransaction, String dataTimeTransaction) {		
		this.account = account;
		this.value = value;
		this.typeTransaction = typeTransaction;
		this.dataTimeTransaction = dataTimeTransaction;
	}
	
	public Transaction() {}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
	}

	public String getDataTimeTransaction() {
		return dataTimeTransaction;
	}

	public void setDataTimeTransaction(String dataTimeTransaction) {
		this.dataTimeTransaction = dataTimeTransaction;
	}
	
	
	
	
}
