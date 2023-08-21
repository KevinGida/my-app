package test.service;

public class Calculator {

    public static int calculation(String num1, String num2, String operation) {
        int n1 = Integer.valueOf(num1);
        int n2 = Integer.valueOf(num2);
        String op = operation.toLowerCase();
        switch (op) {
            case "addition":
                return n1+n2;
            case "subtraction":
                return n1-n2;
            case "multiplication":
                return n1*n2;
            case "division":
                {
                if(n2 == 0) 
                    throw new IllegalArgumentException("Divided by zero (0)");
                return n1/n2;
                }
            default:
                throw new IllegalArgumentException("Unknown operator " + op);
        }

    }
}