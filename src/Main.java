import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Employee Object

      Employee e1 = new Employee("123" , "Shahad",10000);

      //Employee Setter

      e1.setId("321");

      e1.setName("Amal");

      e1.setSalary(12000);

      System.out.println("toString Function - Employee object 1 \n"+e1.toString());

      System.out.println("Annual Salary is "+e1.AnnualSalary());

      double raised= 0.10;

      System.out.println("Salary After "+ raised+" raising percentage is "+e1.raisedSalary(raised));

      // Account Object

      System.out.println("\nAccount Object");

      Account a1 = new Account("312","Shahad",129);
      // Account setter
      a1.setBalance(130);
      System.out.println("toString Function - Account object 1\n"+a1.toString());

      // Deposit Function
      System.out.println("Please Enter amount you want to deposit");
      int x = input.nextInt();
      System.out.println("Your new balance is "+a1.debit(x));

      // withdrawal Function
      System.out.println("Please Enter amount you want to withdrawal");
      int y = input.nextInt();
      a1.credit(y);

      // Transfer Function
      Account a2 = new Account("534","Amal",50);
      System.out.println("\ntoString Function - Account object 2 \n"+a2.toString());
      System.out.println("Please Enter amount you want to transfer to Customer 2");
      int z = input.nextInt();
      a1.TransferTo(a2,z);



    }
}