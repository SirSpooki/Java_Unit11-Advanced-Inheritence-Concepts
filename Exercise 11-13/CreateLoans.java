import java.util.*;
public class CreateLoans implements LoanConstants {
    public static void main(String[] args) {
        // Scanner object for user input
	    Scanner scanner = new Scanner(System.in);
	    
	    // variable declaration(s)
        double prime_interest_rate;
        
        // array of loan objects
        Loan loans[] = new Loan[5];
        
        // welcome message 
        System.out.println("================== Welcome to Sanchez Construction =====================");
        
        // user input for prime interest rate
        System.out.println("Enter the current prime interest rate as a decimal number, for example, .05");
        prime_interest_rate = scanner.nextDouble();
        for(int i=0; i<5; i++) {
            System.out.print("\nLoan #" + (i+1) + "->\nIs this a (1) Business loan or (2) Personal loan: ");
            int loanType = scanner.nextInt();
            while(loanType != 1 && loanType != 2) {
                System.out.println("Invalid input. Try again..");
                System.out.print("Is this a (1) Business loan or (2) Personal loan: ");
                loanType = scanner.nextInt();
            }
            
            System.out.print("Enter account number: ");
            int accountNum = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter loan amount: $");
            double loanAmount = scanner.nextDouble();
            
            System.out.print("Enter term: ");
            int term = scanner.nextInt();
            
            if(loanType == 1)
                loans[i] = new BusinessLoan(accountNum, name, loanAmount, term, prime_interest_rate);
            else 
                loans[i] = new PersonalLoan(accountNum, name, loanAmount, term, prime_interest_rate);
        }
        
        // printing loan details
        System.out.println("\n===================== OUTPUT =======================");
        System.out.println("Sanchez Construction");
        for(int i=0; i<5; i++) {
            System.out.println("Loan #" + (i+1) + "->");
            System.out.println(loans[i]);
            System.out.println();
        }
    }
}
