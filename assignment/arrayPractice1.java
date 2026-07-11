// Create an array contains num and return true when num repeating 
// import java.util.*;
// public class arrayPractice1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of arr: ");
//         int size = sc.nextInt();
//         System.out.println("Enter values: ");
//         int[] val = new int[size];
//         for (int i=0; i<=size-1; i++) {
//             val[i]=sc.nextInt();
//         }
//         sc.close();
//         //print the final answer here!
//         System.out.println(repeatele(val));
//     }
//     public static boolean repeatele(int val[]) {
//         int size = val.length;
//         for (int i=0; i<size-1; i++) {
//             for (int j=i+1; j<size; j++) {
//                 if (val[i]==val[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// Create an array and print the target element
import java.util.*;
class arrayPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of an array: ");
        short size = sc.nextShort();
        short[] val = new short[size];
        System.out.print("Enter an element: ");
        for (short i = 0; i<val.length; i++) {
            val[i] = sc.nextShort();
        }
        for (short i = 0; i<val.length; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.print("Enter a target: ");
        short n = sc.nextShort();
        sc.close();
        System.out.print(tNum(val, n));
    }
    static short tNum(short val[], short n) {
        for (short i=0; i<val.length; i++) {
            if (n == val[i]) {
                return i;
            }
        }
        return -1;
    }
}