import java.lang.reflect.Array;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {
        Reader read = new Reader();
        int x = read.getInt();
        System.out.println(x);
        LogicalOperations op = new LogicalOperations();
        op.wait(1000);
        System.out.println(read.scanInt());
        System.out.println(read.doubleScanner());
        System.out.println(read.floatScanner());
        System.out.println(read.stringScanner());
        Scanner scan = new Scanner(System.in);
        op.printArray(read.arrayScanner(scan.nextInt()));
        read.tryCatchArray(new int[] {1, 2, 3, 4, 5, 8}, 7);

    }
}
