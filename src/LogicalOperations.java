public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";
    }

    public String verifyText(String textInput) {
        if (textInput.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
    public void verifyNumber(int number) {
        if (number >= 2 && number <= 8) {
            System.out.println(number);
        } else {
            System.out.println("Number is not within range");
        }
    }

    public String verifyForecast(int number) {
        if (number > 8 || number == 6)
            return ("The amount of snow this winter was(cm): " + number);
        else {
            return ("The forecast snow is(cm): " + number);
        }

    }
    public String verifyNumbers (int number) {
        if (number>3 && number!=4)
            return "The number is greater than 3 and not equal to 4.";
        else if (number==4)
            return "The number is equal to 4.";
        else if (number<3)
            return "The number is lower than 3.";
        else
            return "None of the conditions is fulfilled";
    }

    public String isNumberEven (int number) {
        if (number % 2== 0){
            return "True";}
        else {
            return "False";
        }
    }
    public String isEligibleToVote (int number){
        if (number >= 18){
            return "True";}
        else
            return "False";
            }
    public int biggestNumber (int first, int second, int third){
        if(first>=second && first>=third){
            return first;
        }
        else if (second>=first && second>=third) {
            return second;
        }
        else {
            return third;
        }
    }
    //Tema for loops
    public void printToHundred (int x){
        for (int i = x; i <= 100; i++){
            System.out.println(i);
        }
    }
    public void printToMinusHundred (int x){
        for (int i = x; i >= -100; i--){
            System.out.println(i);
        }
    }
    public void printFromNumberToNumber (int x, int y){
        for (int i = x; i <= y; i++){
            System.out.println(i);
        }
    }
    public void printFromSmallerToLargerNumber (int x, int y){
        int minimum = Math.min(x,y);
        int maximum = Math.max(x,y);
        for (int i = minimum; i <= maximum; i++){
            System.out.println(i);
        }
    }
    public void printEvenNumberFrom1to100 (){
        int n = 100;
        for (int i = 1; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
     public void printOddNumbersFrom1to100 (){
        int n = 100;
        for (int i = 1; i <=n; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
    public int sumOfNumbers (){
        int sum = 0;
        for (int i = 56; i <=100; i++){
            sum = sum + i;
        }
        return sum;
    }
    public double sumAndAverage (){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum+=i;
        }
        System.out.println(sum);
        return sum/100d;
    }
    public void printBackwards (int x, int y){
        for (int i = x; i >= y; i--){
            System.out.println(i);
        }
    }
    public float getAverageInRange (int start, int finish) {
        int sum = 0;
        float count = 0;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }
        return (sum / count);
    }

    public float getAverageForOddInRange(int start, int finish){
        int sum = 0;
        float count = 0f;
        while (start <= finish) {
            if (start % 2 != 0) {
                sum = sum + start;
                count++;
            }
            start++;
        }
        return (sum/count);
    }
    public void printTrianglePattern (){
        int size = 7;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printToMinus100 (){
        int i = -78;
        while (i>=-100){
            System.out.println(i);
            i--;
        }
    }
    public void printFromFirstToLast (int first, int last) {
        while (first < last) {
            first++;
            System.out.println(first);
        }

    }
    public void printFromSmallestToLargest (int first, int last){
        int minimum = Math.min(first, last);
        int maximum = Math.max(first, last);
        while (minimum<=maximum){
            System.out.println(minimum);
            minimum++;
        }
    }

    public void printEvenNumbersInRange (){
        int first = 1;
        int last =100;
        while (first<=last){
            if (first%2==0){
                System.out.println(first);
            }
            first++;
            }
        }
    public void printOddNumbersInRange (){
        int first = 1;
        int last =100;
        while (first<=last){
            if (first%2!=0){
                System.out.println(first);
            }
            first++;
        }
    }
    public void getAverageInRanges (int start, int finish) {
        int sum = 0;
        float count = 0;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }
        System.out.println(sum / count);
    }
    public float getAverageDivisibleTo7 (int start, int finish) {
        int sum = 0;
        float count = 0;
        while (start<=finish){
            if (start%7==0) {
                sum = sum + start;
                count++;
            }
            start++;
        }
        return (sum/count);
    }
    public void getFirstNumbersInFibonacciSeries (int x){
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = 0;
        int count = 0;
        while (count<x-2){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            count++;
        }
    }
    public void printPattern (int first, int last){
        int count = 0;
        while (first<=last){
            if (count%11==0){
                System.out.print("\n");
            }
            if (first%3==0 && first%5==0 && first%7==0){
                System.out.print("CozaLozaWoza ");
            }
            else if (first%5==0 && first%7==0){
                System.out.print("WozaLoza ");
            }
            else if (first%3==0 && first%7==0){
                System.out.print("CozaWoza ");
            }
            else if (first%3==0 && first%5==0){
                System.out.print("CozaLoza ");
            }
            else if (first%7==0){
                System.out.print("Woza ");
            }
            else if (first%5==0){
                System.out.print("Loza ");
            }
            else if (first%3==0){
                System.out.print("Coza ");
            }
            else {
                System.out.print(first + " ");
            }
            first++;
            count++;
        }

    }
}







