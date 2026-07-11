import java.util.*;
public class arrayCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of days: ");
        int size = sc.nextInt();
        int[] price = new int[size];
        System.out.println("List of Prices in a days: ");
        for (int i=0; i<price.length; i++) {
            price[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(profitPrice(price));
    }
    public static int profitPrice(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profitPrice = 0;
        for (int i = 0; i<price.length; i++) {
            if (buyPrice>price[i]) {
                buyPrice=price[i];
            }
            else {
                int profit = price[i] - buyPrice;
                profitPrice = Math.max(profitPrice, profit);
            }
        }
        return profitPrice;
    }
}