import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // Add two numbers
        int tNum = num + num1;
        System.out.println("Add two numbers: "+tNum);
        // Subtract two numbers
        int tsNum = num - num1;
        System.out.println("Subtract two numbers: "+tsNum);
        // Multiply two numbers
        int tmNum = num * num1;
        System.out.println("Multiply two numbers: "+tmNum);
        // Divide two numbers
        int tqNum = num / num1;
        System.out.println("Divide two numbers: "+tqNum);
        // Remender of divide two numbers
        int trNum = num % num1;
        System.out.println("Reminder two numbers: "+trNum);
        // Area of rectangle
        int rArea = num * num1;
        System.out.println("Area of rectangle: "+rArea);
        // Perimeter of rectangle
        int rPerimeter = 2 * tNum;
        System.out.println("Perimeter of rectangle: "+rPerimeter);
        // Area of circle
        float cArea = 3.14f * num * num;
        System.out.println("Area of circle: "+cArea);
        // Celsius to Fahrenheit
        float fconvert = num * 1.8f + 32;
        System.out.println("Celsius to Fahrenheit: "+fconvert);
        // Swap two numbers without third variable
        num = num + num1;
        num1 = num - num1;
        num = num - num1;
        System.out.println("Swapped Number1: "+num);
        System.out.println("Swapped Number2: "+num1);
        // Average of three numbers
        int sum = num + num1 + num2;
        int avg = sum/3;
        System.out.println("Average of three numbers: "+avg);
        // Largest number between two numbers
        if (num<num1) {
            System.out.println("Largest between two numbers: "+num1);
        }else {
            System.out.println("Largest between two numbers: "+num);
        }
        // Largest number between three numbers
        if (num<num1&&num2<num1) {
            System.out.println("Largest between three numbers: "+num1);
        }else if (num1<num2&&num<num2) {
            System.out.println("Largest between three numbers: "+num2);
        }else {
            System.out.println("Largest between three numbers: "+num);
        }
        // Is a number even or odd
        if (num%2==0) {
            System.out.println("Number is even: "+num);
        }else {
            System.out.println("Number is odd: "+num);
        }
        // Is a number negative or positive or zero
        if (num<0) {
            System.out.println("Number is negative: "+num);
        }else if (num>0) {
            System.out.println("Number is positive: "+num);
        }else {
            System.out.println("Number is zero: "+ num);
        }

    }
}