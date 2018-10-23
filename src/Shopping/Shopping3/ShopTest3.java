package Shopping.Shopping3;

import java.util.Scanner;

public class ShopTest3 {
    public static void main(String[] args){
        boolean z = true;
        String name;
        int quant;
        double price;
        String input;

        ShoppingCart3 myCart = new ShoppingCart3();

        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to go shopping? (yes or no)");
        input = scan.nextLine();
        if (input.equals("yes")){
            while (z) {
                System.out.println("What would you like to buy? ");
                name = scan.nextLine();
                System.out.println("How much does it cost? ");
                price = scan.nextDouble();
                System.out.println("How many do you want? ");
                quant = scan.nextInt();
                myCart.addToCart(name,price,quant);
                scan.nextLine();
                System.out.println("Would you like to get anything else? (yes or no) ");
                input = scan.nextLine();
                if (input.equals("no")){
                    z = false;
                }
            }
        }
        System.out.println(myCart.toString());
    }
}

