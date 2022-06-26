import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       //        System.out.println("Hello");
//        String name = "Andreea";
//        System.out.println(name);
       Printer printer = new Printer();
       printer.printMyName("Andreea");
//        int x = 6;
//        int y = 12;
//        int sum = x + y;
        System.out.println(calculator.sum(6, 12));
//        int a = 15;
//        float b = 6;
//        float div = a/b;
        System.out.println(calculator.division(15, 6));
//        int c = -5;
//        int d = 8;
//        int e = 6;
        System.out.println("result for a. is " + calculator.sum(-5, calculator.multiplication(8,6)));
//        int f = 55;
//        int g = 9;
//        int h = 9;
        System.out.println("result for b. is " + calculator.modulo(calculator.sum(55, 9),9));
//        int i = 20;
//        int j = -3;
//        int k = 5;
//        float l = 8;
        System.out.println("result for c. is " + calculator.sum(20, calculator.division(calculator.multiplication(-3,5), 8)));
//        int m = 5;
//        int n = 15;
//        int o = 3;
//        int p = 2;
//        int q = 8;
//        int r = 3;
        System.out.println("result for d. " + calculator.substraction(calculator.sum(5, calculator.multiplication(calculator.division(15,3), 2)), calculator.modulo(8,3)));
        System.out.println(calculator.sum(4,5));
        System.out.println(calculator.substraction(12, 6));
        System.out.println(calculator.multiplication(4, 10));
        System.out.println(calculator.division(10,2));

        printer.printpattern();
        System.out.println(calculator.average(1,2,3));
        printer.printnewpattern();
        System.out.println(calculator.modulo(7, 3));
        Conversions conversions = new Conversions();
        System.out.println("C = " + conversions.degreeconversion(152));
        System.out.println("meters = " + conversions.metricconversion(40));
        conversions.speed(1000, 2, 30, 58);

    }


  }
