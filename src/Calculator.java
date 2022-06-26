public class Calculator {
    public float sum(float x, float y) {
        return x + y;
    }

    public static float multiplication(float x, float y) {
        return x * y;
    }

    public float modulo(float x, float y) {
        return x % y;
    }

    public float division(float x, float y) {
        return x / y;
    }

    public float substraction(float x, float y) {
        return x - y;
    }

    //overriding existing methods to use integer parameters and return integer values
    public int sum(int x, int y) {
        return x + y;
    }

    public int substraction(int x, int y) {
        return x - y;
    }

    public int multiplication(int x, int y) {
        return x * y;
    }

    public int division(int x, int y) {
        return x / y;
    }
    public int average (int x, int y, int z){
        return (x+y+z)/3;
    }
    //overriding existing method to use integer parameters and return integer values
    public int modulo (int x, int y){
        return x%y;
    }
}
