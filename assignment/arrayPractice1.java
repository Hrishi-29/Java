import java.util.*;
public class arrayPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arr: ");
        int size = sc.nextInt();
        System.out.println("Enter values: ");
        int[] val = new int[size];
        for (int i=0; i<=size-1; i++) {
            val[i]=sc.nextInt();
        }
        sc.close();
        //print the final answer here!
        System.out.println(repeatele(val));
    }
    public static boolean repeatele(int val[]) {
        int size = val.length;
        for (int i=0; i<size-1; i++) {
            for (int j=i+1; j<size; j++) {
                if (val[i]==val[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}