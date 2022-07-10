public class Main5 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        int[] myArray = op.populateArrayUpToNumber(100);
        op.printArray(myArray);
        int[] secondArray = {1,2,45,123123,111,333};
        System.out.println(op.getAverageFromArray(secondArray));
        String[] myArrayOfStrings = {"John", "Joe", "GI Joe", "Jane"};
        System.out.println(op.isValueInArray(myArrayOfStrings, "Kane"));
        int[] populateArrayWithEvenNumbers = op.populateArrayWithEvenNumber(135);
        op.printArray(populateArrayWithEvenNumbers);
        int[] thirdArray = {1, 4, 6, 7, 86, 898, 78778};
        System.out.println("\n" + op.isNumberInArray(thirdArray, 1));
        op.printPatternUsingArray();
        int[] fourthArray = {22, 444, 666, 7, 8, 11};
        int[] removeValueFromArray1 = op.removeValueFromArray(fourthArray, 11);
        op.printArray(removeValueFromArray1);
        int[] printArrayos = op.copyValuesFromArray(fourthArray, new int[fourthArray.length]);
        System.out.println("\n");
        op.printArray(printArrayos);
        op.bubbleSort(fourthArray);
        System.out.println("\n");
        op.printArray(fourthArray);
        System.out.println("Second smallest number " + fourthArray[1]);

    }

}
