package Secao14_PolimorfismoHeranca.programs;

import Secao14_PolimorfismoHeranca.entidades.Account;
import Secao14_PolimorfismoHeranca.entidades.BusinessAccount;
import Secao14_PolimorfismoHeranca.entidades.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Account acc = new Account(1000, "Alex", 0.0);
        
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        
        //Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0 , 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        
        //DowCasting / Eu nao posso atribuir do maior para o menor, a menos que faca um Casting
        
        BusinessAccount acc4 = (BusinessAccount) acc2;  //fiz um casting manual
        acc4.loan(100.0);
        
        //O Casting abaixo nao sera permitido, pois um objeto do Busines nao pode receber abaixo
        
       // BusinessAccount acc5 = (BusinessAccount) acc3;  //(aqui so vai dar erro na era da execucao)
        
        if (acc3 instanceof BusinessAccount ){
        	BusinessAccount acc5 = (BusinessAccount) acc3;
        	acc5.loan(200.0);
        	System.out.println("Loan!");
        }
        
        if (acc3 instanceof SavingsAccount){
        	SavingsAccount acc5 = (SavingsAccount) acc3;
        	acc5.updateBalance();
        	System.out.println("Update!");
        	
        }
        
        
        

}
	
}
