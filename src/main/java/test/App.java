package test;

public class App 
{
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();

        System.out.println (calc.calculation(args[0], args[1], args[2]));
        ;
    }
}
