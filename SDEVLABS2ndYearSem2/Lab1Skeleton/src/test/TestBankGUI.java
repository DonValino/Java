package Lab1Skeleton.src.test;

import Lab1Skeleton.src.Lab1GUI.BankGUI;

import Lab1Skeleton.src.model.Bank;
import Lab1Skeleton.src.model.BankAccount;



public class TestBankGUI {

	public static void main(String args[]) {
		Bank aib = new Bank();

		BankAccount[] b = { new BankAccount("Peter Brady", "Savings", 20500),
				new BankAccount("Tom Jones", "Current", 2500),
				new BankAccount("kate Wynn", "Savings", 100500.60) };

		for (int i = 0; i < b.length; i++) {
			aib.addAccount(b[i]);
		}

		 BankGUI bg = new BankGUI(aib);

	}

}
