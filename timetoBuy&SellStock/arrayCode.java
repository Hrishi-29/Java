import java.util.*;
public class arrayCode {
    public static void main(String[] args) {
        //input days and stockPrices
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of days: ");
        int size = sc.nextInt();
        int[] price = new int[size];
        System.out.println("List of Prices in a days: ");
        for (int i=0; i<price.length; i++) {
            price[i] = sc.nextInt();
        }
        sc.close();
        //calling profit function
        System.out.println(profitPrice(price));
    }
    public static int profitPrice(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profitPrice = 0;
        //putting min price in buyPrice
        for (int i = 0; i<price.length; i++) {
            if (buyPrice>price[i]) {
                buyPrice=price[i];
            }
                //calculating profit
            else {
                int profit = price[i] - buyPrice;
                profitPrice = Math.max(profitPrice, profit);
            }
        }
        //get the profit in profitPrice
        return profitPrice;
    }
}
