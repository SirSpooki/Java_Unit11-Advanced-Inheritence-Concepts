public class BusinessLoan extends Loan {
    public BusinessLoan(int num, String name, double amt, int yrs, double prime) {
        // calling super class constructor
        super(num, name, amt, yrs);
        
        // business interest rate is 1% more than the prime interest rate
        rate = prime*100 + 1;
    }
}
