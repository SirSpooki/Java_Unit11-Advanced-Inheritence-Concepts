public abstract class Loan implements LoanConstants {
    // variable declarations
    protected int loanNum;
    protected String lastName;
    protected double amount;
    protected double rate;
    protected int term;
    
    // constructor
    public Loan(int num, String name, double amt, int yrs) {
        loanNum = num;
        lastName = name;
        
        // validating amount to be less than or equal to 100000
        if(amt > 100000)
            amount = 100000;
        else 
            amount = amt;
        
        // validating term to be those defined in LoanConstants interface
        if(yrs != SHORT_TERM && yrs != MEDIUM_TERM && yrs != LONG_TERM)
            term = SHORT_TERM;
        else
            term = yrs;
    }
    
    // returns loan details
    public String toString() {
        return "Name: " + lastName + ", " +
                "$" + amount + " for " + term + " year(s)" +
                " at " + rate + "% interest";
    }
    
    // returns if two loans are for the same person
    public boolean equals(Loan loan) {
        return loan.loanNum == loanNum;
    }
}
