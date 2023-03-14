package tugas_14_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = in.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = in.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = in.nextDouble();
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException("Invalid input. Interest rate, number of years, and loan amount must be greater than zero.");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Invalid input. Interest rate must be greater than zero.");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Invalid input. Number of years must be greater than zero.");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Invalid input. Loan amount must be greater than zero.");
        }
        this.loanAmount = loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}
