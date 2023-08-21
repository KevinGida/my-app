package test.service;

public class App 
{
    public static void main( String[] args )
    {
        int test = Calculator.calculation(args[0], args[1], args[2]);
        System.out.println(test);
}
}
