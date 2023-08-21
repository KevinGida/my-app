package test;

public class Calculator {

    public static int calculation(String num1, String num2, String op) {
        int n1 = Integer.valueOf(num1);
        int n2 = Integer.valueOf(num2);
        switch (op) {
            case "ADDITION":
                return n1+n2;
            case "SUBSTACTION":
                return n1-n2;
            case "MULTIPLICATION":
                return n1*n2;
            case "DIVISION":
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

