//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void maxByteValue(){
        byte maxValue = 127;
        System.out.println("Initial value: " + maxValue);

        maxValue++;
        System.out.println("Increased value: " + maxValue);
    }

    public static boolean isDivide(double num){
        return num % 5 == 0 && num % 11 == 0;
    }

    public static String polygonType(int sides) {
        String polygonType;
        switch (sides) {
            case 3:
                polygonType = "трикутник";
                break;
            case 4:
                polygonType = "чотирикутник";
                break;
            case 5:
                polygonType = "п'ятикутник";
                break;
            case 6:
                polygonType = "шестикутник";
                break;
            case 7:
                polygonType = "семикутник";
                break;
            case 8:
                polygonType = "восьмикутник";
                break;
            case 9:
                polygonType = "дев'ятикутник";
                break;
            case 10:
                polygonType = "десятикутник";
                break;
            default:
                polygonType = "невідомий тип багатокутника";
                break;
        }
        return polygonType;

    }

    public static void printMultiplicationTable(int number){
        int multiNum = 1;
        while(multiNum < 10){
            System.out.println(number + " * " + multiNum + " = " + (number * multiNum));
            multiNum++;
        }
    }

    public static int[] joinArr(int[] arr1, int[] arr2){
        int[] joinedArr = new int[arr1.length + arr2.length];
        int k,i=0,j=0;

        for (k = 0; k < joinedArr.length; k++) {
            if (i < arr1.length && (j >= arr2.length || arr1[i] <= arr2[j])) {
                joinedArr[k] = arr1[i];
                i++;
            } else if (j < arr2.length) {
                joinedArr[k] = arr2[j];
                j++;
            }
        }
        return joinedArr;
    }

    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        maxByteValue();

        //task 2
        System.out.println("Task 2");
        System.out.println("Number 55: " + isDivide(55));
        System.out.println("Number 56: " + isDivide(56));

        //task 3
        System.out.println("Task 3");
        System.out.println("Багатокутник з " + 5 + " сторонами - це " + polygonType(5));

        //task 4
        System.out.println("Task 4");
        printMultiplicationTable(5);

        //task 5
        System.out.println("Task 5");
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8};
        int[] joinedArr = joinArr(arr1, arr2);
        for(int i = 0; i < joinedArr.length; i++){
            System.out.print(joinedArr[i] + " ");
        }

    }
}