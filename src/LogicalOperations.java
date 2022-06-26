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
}


