
import java.util.Scanner;

public class BankingProject {
   static  Scanner  scanner =new  Scanner(System.in);

   public static void main(String[] args) {
    
       Double Balance;
       Boolean isRunning;
       isRunning = true;
        Balance = 0.0;
        while (isRunning) {
            System.out.println("Menu");
            System.out.println("1.Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
            System.out.print("Enter your choice (1 - 4):");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Your balance:" + Balance);
                case 2 -> {
                    System.out.print("Enter Withdraw Amount:");
                    int withDraw = scanner.nextInt();
                    int withDrawMoney = removeAmount(withDraw, Balance);
                    if (withDrawMoney == 0) {
                        System.out.println("Please deposit Amount to withdraw");
                    } else if (withDrawMoney == -1) {
                       System.out.println("You Enterd wrong amount");
                    }
                    else {
                       
                        System.out.println("your Amount withdraw successfully " +withDrawMoney);
                        double newBalance = Balance -= withDrawMoney;
                        System.out.println("Your current balance is: "+ newBalance );
                    }
               }
                case 3 -> {
                    System.out.print("Please Enter Amount to deposit:");
                    int depositMoney = scanner.nextInt();
                    int isDeposit = addMoney(depositMoney, Balance);
                    if (isDeposit == 0) {
                        System.out.println("please add amount greater than 0");
                    } else {
                        Double newBalance = Balance += isDeposit;
                        System.out.println("Your amount added successfully " + isDeposit);
                        System.out.println("Your current balance is: "+ newBalance);
                        
                    }
               }
               case 4 -> {
                    isRunning = false;
                   System.out.println("Thank Your for using our banking service");
               }
                default -> System.out.println("You Entered Invalid Input");
            }

        }
       
        
        scanner.close();
    }

    public static int removeAmount(int withDraw, double Balance) {
        if (Balance < withDraw) {
            System.out.println("Your balance is insufficent");
        } else if (withDraw < 0) {
            
            return -1;
        }
        else {
            return withDraw;
        }
        return 0;
    }

    public static int addMoney(int depositMoney, double balance) {
        if (depositMoney <= 0) {
            return 0;
        }
        return depositMoney;
    }   
}
