package br.com.marcus.exercises.poo.encapsulation.bankaccount.domain;

public class BankAccount {
    private  String accountNumber;
    private  String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("O valor digitado para deposito é invalido!");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount){
        if(this.balance < amount){
            if(amount<0) {
                System.out.println("O valor digitado para saque é invalido!");
                return;
            } else if (this.balance > 0) {
                System.out.println("Conta " +this.accountNumber+ " sem saldo suficiente para saque.");
                return;
            }
        } else if (amount >= 0) {
            this.balance -= amount;
        }

    }

    public void imprime(){
        System.out.println("------------------------");
        System.out.println("Account: "+getAccountNumber());
        System.out.println("Holder: "+getAccountHolder());
        System.out.println("Balance: "+getBalance());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

}
