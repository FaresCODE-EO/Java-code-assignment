package Day2;

import java.util.Scanner;

public class InstaPayCheck {
    // what we have?
    static double requiredSalary = 25000.0;
    static int requiredCreditScorePoint = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScores();
        boolean qualified = isQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Please Enter Your Salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScores() {
        System.out.println("Please Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isQualified(double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScorePoint) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congratulations, You are Qualified for the Loan");
        } else {
            System.out.println("Unfortunately you're not qualified for the Loan");
        }
    }
}