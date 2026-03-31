package br.com.marcus.exercises.poo.encapsulation.bankaccount.test;

import br.com.marcus.exercises.poo.encapsulation.bankaccount.domain.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12332312","Petrov");
        BankAccount account1 = new BankAccount("1234444","Dimitrov");
        BankAccount account2 = new BankAccount("11123331","Djokovic");
        BankAccount[] accounts = {account, account1, account2};

        account.deposit(1200);
        account1.deposit(2400);
        account2.deposit(-3600);

        account.withdraw(1000);
        account1.withdraw(2500);
        account2.withdraw(3000);

        for (BankAccount bankAccount : accounts) {
            bankAccount.imprime();
        }

    }
}
