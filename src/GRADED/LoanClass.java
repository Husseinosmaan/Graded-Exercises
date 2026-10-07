package GRADED;
import java.util.Date;

public class LoanClass {

    // Attributes
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // No-argument constructor
    public LoanClass() {
        this(2.5, 1, 1000);
    }

    // Constructor with parameters
    public LoanClass(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    // Getter for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Getter for numberOfYears
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // Getter for loanAmount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Getter for loanDate
    public Date getLoanDate() {
        return loanDate;
    }

    // Setter for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Setter for numberOfYears
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // Setter for loanAmount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Calculate monthly payment
    public double getMonthlyPayment() {

        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfPayments = numberOfYears * 12;

        double monthlyPayment =
                loanAmount * monthlyInterestRate /
                        (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        return monthlyPayment;
    }

    // Calculate total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}