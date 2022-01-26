package donguler;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int number, element;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number of elements of the set: ");
        number = scanner.nextInt();
        System.out.print("How many elements combination: ");
        element = scanner.nextInt();
        //factorial of number
        int factorialOfNumber=1;
        for(int i=1; i<=number; i++){
            factorialOfNumber *= i;
        }
        //factorial of element
        int factorialOfElement=1;
        for(int i=1; i<=element; i++){
            factorialOfElement *= i;
        }
        //factorial of difference between number and element
        int difference = (number - element);
        int factorialOfDifference=1;
        for(int i=1; i<=difference; i++){
            factorialOfDifference *= i;
        }
        int combination = factorialOfNumber / (factorialOfElement*factorialOfDifference);
        System.out.println(element + " combination of " +number +": " + combination);
    }
}
