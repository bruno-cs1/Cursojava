package applicatons;

import Entities.Clients;
import java.util.Locale;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Clients client = new Clients();
        String z;
        
        System.out.println("Enter account number: ");
        client.setNumberAccount(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account holder: ");
        client.setHolder(sc.nextLine());
        System.out.println("Is there na initial deposit?(y/n) ");
        z = sc.next();
        
        if("y".equals(z)){
        System.out.println("Enter initial deposit value: ");
        client.setInitialDeposit(sc.nextInt());
        
        
        System.out.print("Account data:");
        System.out.println("Account " + client.getNumberAccount() + ", Holder: " + client.getHolder() + ", Balance: $" + client.getInitialDeposit() );
        
        System.out.println("Enter a deposit value: ");
        client.deposit(sc.nextDouble());
        sc.nextDouble();
        System.out.print("Updated account data:");
        System.out.println("Account " + client.getNumberAccount() + ", Holder: " + client.getHolder() + ", Balance: $" + client.getInitialDeposit() );
        System.out.println();
        System.out.println("Enter a withdraw value: ");
        client.withdraw(sc.nextDouble());
        System.out.println("Account " + client.getNumberAccount() + ", Holder: " + client.getHolder() + ", Balance: $" + client.getInitialDeposit());
        
        }
        
        

        
       
        
    }
}
