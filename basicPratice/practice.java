import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers and a Operator: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        char ch = sc.next().charAt(0);
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
        // Is a person eligible to vote
        if (num2<18) {
            System.out.println("This person is not able to vote because his age is "+num2);
        }else if (num2>=18) {
            System.out.println("This person is able to vote because his age is "+num2);
        }else {
            System.out.println("Invalid age!!");
        }
        // has a student passed or failed
        if (num2<=23) {
            System.out.println("This Student needs to repeat this exam because his marks is "+num2);
        }else if (num2>23) {
            System.out.println("This Student passed in exam because his marks is "+num2);
        }else {
            System.out.println("Invalid marks!!");
        }
        // grade of a student based on marks
        if (num2<=33) {
            System.out.println("Grade E: "+num2);
        }else if (num2<=45) {
            System.out.println("Grade D: "+num2);
        }else if (num2<=60) {
            System.out.println("Grade C: "+num2);   
        }else if (num2<=85) {
            System.out.println("Grade B: "+num2);
        }else if (num2<=100) {
            System.out.println("Grade A: "+num2);
        }else {
            System.out.println("Invalid marks!!");
        }
        // Is a year or leap year
        if (num3%4==0&&num3%100!=0||num3%400==0) {
            System.out.println("This is a Leap year: "+num3);
        }else {
            System.out.println("This is not a Leap year: "+num3);
        }
        // Is a number divisible by 5 and 11
        if (num2%5==0&&num2%11==0) {
            System.out.println("This is divisible by 5 and 11: "+num2);
        }else {
            System.out.println("This is not divisible by 5 and 11: "+num2);
        }
        // is there any profit or loss
        if (num>num1) {
            int profit = num - num1;
            float perProfit = (profit/num1)*100;
            System.out.println("Profit: "+profit);
            System.out.println("Percentage of the profit: "+perProfit);
        }else if (num<num1) {
            int loss = num1 - num;
            float perLoss = (loss/num1)*100;
            System.out.println("Loss: "+loss);
            System.out.println("Percentage of the loss: "+perLoss);
        }else {
            System.out.println("No Profit.. No Loss..");
        }
        // make a simple calculator
        switch (ch) {
            case '*': System.out.println("Multiplication: "+(num*num1));
                break;
            case '/': System.out.println("Division: "+(num/num1));
                break;
            case '+': System.out.println("Addition: "+(num+num1));
                break;
            case '-': System.out.println("Subtraction: "+(num-num1));
                break;
            default:
                System.out.println("Invalid Operator!! "+ch);
        }
        // get day of a week
        switch (num) {
            case 1: System.out.println("Monday!!");
                break;
            case 2: System.out.println("Tuesday!!");
                break;
            case 3: System.out.println("Wednesday!!");
                break;
            case 4: System.out.println("Thrusday!!");
                break;
            case 5: System.out.println("Friday!!");
                break;
            case 6: System.out.println("Saturday!!");
                break;
            case 7: System.out.println("Sunday!!");
                break;
            default:
                System.out.println("Invalid DAYY!! "+num);
        }
        // get month of a year
        switch (num) {
            case 1: System.out.println("January!!");
                break;
            case 2: System.out.println("February!!");
                break;
            case 3: System.out.println("March!!");
                break;
            case 4: System.out.println("April!!");
                break;
            case 5: System.out.println("May!!");
                break;
            case 6: System.out.println("June!!");
                break;
            case 7: System.out.println("July!!");
                break;
            case 8: System.out.println("August!!");
                break;
            case 9: System.out.println("September!!");
                break;
            case 10: System.out.println("October!!");
                break;
            case 11: System.out.println("November!!");
                break;
            case 12: System.out.println("December!!");
                break;
            default:
                System.out.println("Invalid MONTH!! "+num);
        }
        // get 1 to n number in a output
        System.out.print("1 to "+num+"numbers:");
        for (int i = 1; i<=num; i++) {
            System.out.print(" "+i);
        }
        System.out.println();
        // get n to 1 number in a output
        System.out.print(num+" to 1 numbers:");
        for (int i = num; i>=1; i--) {
            System.out.print(" "+i);
        }
        System.out.println();
        // get all even numbers 1 to n in a output
        System.out.print("Even numbers from 1 to "+num+":");
        for (int i = 1; i<=num; i++) {
            if (i%2==0) {
                System.out.print(" "+i);
            }
        }
        System.out.println();
        // get all odd numbers 1 to n in a output
        System.out.print("Odd numbers from 1 to "+num+":");
        for (int i = 1; i<=num; i++) {
            if (i%2!=0) {
                System.out.print(" "+i);
            }
        }
        System.out.println();
        // sum of the first n natural numbers
        System.out.println("Sum of "+num+" natural numbers: "+(num*(num+1)/2));
        // multiplication table of n numbers
        System.out.println("Here is table of "+num+":");
        for (int i = 1; i<=10; i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}