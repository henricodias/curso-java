package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import javax.swing.*;

public class ProgramBank {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //upcasting (associação de um tipo específico com o tipo genérico)
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //douncasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc5 = new SavingsAccount(1005, "Maria", 1000.0, 0.01);
        acc5.withdraw(200.0);
        System.out.println(acc5.getBalance());

        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());


        //polimorfismo:

        //duas variáveis do tipo Account com comportamentos diferentes
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}