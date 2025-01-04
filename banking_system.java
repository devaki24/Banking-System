import java.util.Scanner;

public class Main
{
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int Pin_number = 1315;
	   System.out.println("Enter the Pin number:");
	   int pin_num = sc.nextInt();
	   if(Pin_number==pin_num)
       {
           System.out.println("Welcome Back DEVAKI!");
           System.out.println("Account Number :131524043553");
	  
	    
	   System.out.println("Choose one Option:");
	   System.out.println("1.Deposit");
	   System.out.println("2.Withdrawal");
	   System.out.println("3.Check Balance");
	   System.out.println("4.Any Offers");
	   System.out.println("5.Exit");
	   int choose = sc.nextInt();
	   float current_balance= 25000;
	  
	   
	   switch(choose){
	       case 1:
	            System.out.println("Enter the amount need to deposit:");
	            float deposit_amount = sc.nextFloat();
	            System.out.println("Total Amount="+(current_balance+deposit_amount));
	            break;
	       case 2:
	            
	            System.out.println("Enter the amount need to withdraw:");
	            float withdraw_amount = sc.nextFloat();
	            System.out.println("Total Amount="+(current_balance-withdraw_amount));
	            break;
	       case 3:
	            System.out.println("Current balance="+current_balance);
	            break;
	       case 4:
	            System.out.println("1.Home Loan");
	            System.out.println("2.Personal Loan");
	            int option = sc.nextInt();
	            switch(option){
	                case 1:
	                    System.out.println("Thank You for choosing Home Loan. Our Team will contact you soon.");
	                    break;
	                case 2:
	                    System.out.println("Thank You for choosing Personal Loan. Our Team will contact you soon.");
	                   break;
	            }
	            break;
	       case 5 : 
	            System.out.println("Exit");
	            break;
	     
	       
	   }
	   
       }
       else{
           System.out.println("Wrong PIN Number");
       }

	}	
}