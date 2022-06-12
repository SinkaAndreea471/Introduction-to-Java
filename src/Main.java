public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        String name = "Andreea";
//        System.out.println(name);
       printMyName("Andreea");
//        int x = 6;
//        int y = 12;
//        int sum = x + y;
        System.out.println(sum(6, 12));
//        int a = 15;
//        float b = 6;
//        float div = a/b;
        System.out.println(division(15, 6));
//        int c = -5;
//        int d = 8;
//        int e = 6;
        System.out.println("result for a. is " + sum(-5, multiplication(8,6)));
//        int f = 55;
//        int g = 9;
//        int h = 9;
        System.out.println("result for b. is " + modulo(sum(55, 9),9));
//        int i = 20;
//        int j = -3;
//        int k = 5;
//        float l = 8;
        System.out.println("result for c. is " + sum(20, division(multiplication(-3,5), 8)));
//        int m = 5;
//        int n = 15;
//        int o = 3;
//        int p = 2;
//        int q = 8;
//        int r = 3;
        System.out.println("result for d. " + substraction(sum(5, multiplication(division(15,3), 2)), modulo(8,3)));
        System.out.println(sum(4,5));
        System.out.println(substraction(12, 6));
        System.out.println(multiplication(4, 10));
        System.out.println(division(10,2));
        printpattern();
        System.out.println(average(1,2,3));
        printnewpattern();
        System.out.println(modulo(7, 3));
        System.out.println("C = " + degreeconversion(152));
        System.out.println("meters = " + metricconversion(40));
        speed(1000, 2, 30, 58);
    }
    public static void printMyName(String Name){
        System.out.println("Hello\n" + Name);
    }
    public static float sum (float x, float y) {
        return x+y;
    }
    public static float multiplication (float x, float y){
        return x*y;
    }
    public static float modulo (float x, float y){
        return x%y;
    }
    public static float division (float x, float y){
        return x/y;
    }
    public static float substraction (float x, float y){
        return x-y;
    }
    //overriding existing methods to use integer parameters and return integer values
    public static int sum (int x, int y) {return x+y;}
    public static int substraction (int x, int y) {return x-y;}
    public static int multiplication (int x, int y) {return x*y;}
    public static int division (int x, int y) {return x/y;}
    public static void printpattern (){
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
    public static int average (int x, int y, int z){
        return (x+y+z)/3;
    }
    public static void printnewpattern (){
        System.out.println("   +\"\"\"\"\"+ ");
        System.out.println("  [| o o |]");
        System.out.println("   |  ^  |");
        System.out.println("   | '-' |");
        System.out.println("   +-----+");
    }
    //overriding existing method to use integer parameters and return integer values
    public static int modulo (int x, int y){
        return x%y;
    }
    public static float degreeconversion (int x){
        return 5/9f*(x-32);
    }
    public static float metricconversion (float inches){
        return (inches*2.54f)/100;
    }
    public static void speed (int meters, int hour, int minutes, int seconds) {
        System.out.println("meters per seconds:  " + meters / (hour * 3600f + minutes * 60f + seconds));
        System.out.println("km per hours:  " + meters/(1000f * (hour + minutes / 60f + seconds / 3600f)));
        System.out.println("miles per hours:  " + meters /(1609f * (hour + minutes / 60f + seconds / 3600f)));
    }

}
