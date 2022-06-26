public class Main3 {
    public static void main(String[] args) {
        int first = 5;
        int second = 6;
        LogicalOperations op = new LogicalOperations();
        System.out.println("Greater number is " + op.getGreaterNumber(first, second));
        //String textInput = "FastTracker";
        //int number = 5;
        String textInput = "FastTrack";
        String variableText = op.verifyText(textInput);
        System.out.println(variableText);
        textInput = "FastTracked";
        variableText = op.verifyText(textInput);
        System.out.println(variableText);
        int number = 5, number1 = 9;
        op.verifyNumber(number);
        op.verifyNumber(number1);
        int number2 = 9, number3 = 5;
        op.verifyForecast(number2);
        op.verifyForecast(number3);
        System.out.println(op.verifyForecast(number2));
        System.out.println(op.verifyForecast(number3));
        int number4 = 5, number5 = 4, number6 = 2;
        System.out.println(op.verifyNumbers(number4));
        System.out.println(op.verifyNumbers(number5));
        System.out.println(op.verifyNumbers(number6));
        int number7 = 1, number8 = 6, number9 = 7, number10 = 8;
        switchCaseExample sc = new switchCaseExample();
        sc.switchCase(number7);
        sc.switchCase(number8);
        sc.switchCase(number9);
        sc.switchCase(number10);
        int number11 = 2; int number12= 3;
        System.out.println(op.isNumberEven(number11));
        System.out.println(op.isNumberEven(number12));
        int number13 = 18; int number14= 4;
        System.out.println(op.isEligibleToVote(number13));
        System.out.println(op.isEligibleToVote(number14));
        System.out.println(op.biggestNumber(3,7, 10));
        System.out.println(op.biggestNumber(5,2, 1));
        System.out.println(op.biggestNumber(5,6, 3));
        System.out.println(op.biggestNumber(7, 7,7));

     }
}
