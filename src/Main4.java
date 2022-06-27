public class Main4 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations(){
            int x = 13;
        };
        op.printToHundred(13);
        System.out.println(op.sumAndAverage());
        op.printBackwards(100, 42);
        System.out.println(op.getAverageInRange(111,8899));
        System.out.println(op.getAverageForEvenInInterval(1,100));


}
    }
