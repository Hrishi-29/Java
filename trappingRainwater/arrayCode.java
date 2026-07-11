import java.util.*;
public class arrayCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of tower: ");
        int size = sc.nextInt();
        int[] height = new int[size];
        System.out.print("List the height of towers: ");
        for (int i=0; i<size; i++) {
            height[i]= sc.nextInt();
        }
        sc.close();
        System.out.print(trappedwater(height));
    }
    public static int trappedwater(int height[]) {
        int n = height.length;
        //max left height
        int lmax[] = new int[n];
        lmax[0] = height[0];
        for (int i=1; i<n; i++) {
            lmax[i] = Math.max(height[i], lmax[i-1]);
        }
        //max right height
        int rmax[] = new int[n];
        rmax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--) {
            rmax[i] = Math.max(height[i], rmax[i+1]);
        }
        //min height
        int trappedwater = 0;
        //no trapped water
        for (int i=0; i<n; i++) {
            int waterl = Math.min(lmax[i], rmax[i]);
            trappedwater += waterl-height[i];
        }
        //trapped water
        return trappedwater;
    }
}
