import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int tNum = num + num1;
        System.out.println("Add two numbers: "+tNum);
        int tsNum = num - num1;
        System.out.println("Subtract two numbers: "+tsNum);
        int tmNum = num * num1;
        System.out.println("Multiply two numbers: "+tmNum);
        int tqNum = num / num1;
        System.out.println("Divide two numbers: "+tqNum);
        int trNum = num % num1;
        System.out.println("Reminder two numbers: "+trNum);
        int rArea = num * num1;
        System.out.println("Area of rectangle: "+rArea);
        int rPerimeter = 2 * tNum;
        System.out.println("Perimeter of rectangle: "+rPerimeter);
        float cArea = 3.14f * num * num;
        System.out.println("Area of circle: "+cArea);
        float fconvert = num * 1.8f + 32;
        System.out.println("Celsius to Fahrenheit: "+fconvert);
        num = num + num1;
        num1 = num - num1;
        num = num - num1;
        System.out.println("Swapped Number1: "+num);
        System.out.println("Swapped Number2: "+num1);
        int sum = num + num1 + num2;
        int avg = sum/3;
        System.out.println("Average of three numbers: "+avg);
        if (num<num1) {
            System.out.println("Largest between two numbers: "+num1);
        }else {
            System.out.println("Largest between two numbers: "+num);
        }
        if (num<num1) {
            System.out.println("Largest between three numbers: "+num1);
        }else if (num1<num2) {
            System.out.println("Largest between three numbers: "+num2);
        }else {
            System.out.println("Largest between three numbers: "+num);
        }
        if (num%=0) {
            System.out.println("Number is even: "+num);
        }else {
            System.out.println("Number is odd: "+num1);
        }
        if (num<0) {
            System.out.println("Number is negative: "+num);
        }else if (num>0) {
            System.out.println("Number is positive: "+num1);
        }else {
            System.out.println("Number is zero: "+ num);
        }

    }
}