import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader {
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
}
