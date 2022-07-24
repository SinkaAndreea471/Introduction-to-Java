import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Reader {
    public int scanInt (){
        Scanner scan = new Scanner(System.in);
        int data1 = scan.nextInt();
        return data1;
    }

    public double doubleScanner () {
        Scanner scan = new Scanner(System.in);
        double data1 = scan.nextDouble();
        return data1;
    }
    public float floatScanner () {
        Scanner scan = new Scanner(System.in);
        float data1 = scan.nextFloat();
        return data1;
    }

    public String stringScanner () {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }
    public int[] arrayScanner(int index){
        int[] array = new int[index];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }


    public int getInt (){
        int number = 0;
        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Not a number!");
                repeat = true;
            }
        }while (repeat);
        return number;
    }

    public void tryCatchArray (int[] arrayOfInt, int index){
        try {
            System.out.println(arrayOfInt[index]);
        } catch (Exception exception) {
            System.err.println("Inside catch, number too large");
        }
    }
}
