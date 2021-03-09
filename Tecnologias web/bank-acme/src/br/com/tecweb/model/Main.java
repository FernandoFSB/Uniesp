/**
 * 
 */
package br.com.tecweb.model;

/**
 * @author nando
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Client client = new Client();
		client.setId(1L);
		client.setName("Fernando Figueiredo");
		client.setEmail("fernando@gemail.com");
		client.setPhone("83 9 9125-6658");
		
		Account account = new Account();
		account.setId(1L);
		account.setAgency("001");
		account.setNumber("001-x");
		account.setBalance(300.0);
		account.setClient(client);
		
		System.out.println(client.getName()+" - "+ account.getAgency());

	}

}
