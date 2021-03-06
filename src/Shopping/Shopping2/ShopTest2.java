package Shopping.Shopping2;

import java.util.Scanner;

public class ShopTest2 {
    public static void main(String[] args){
        boolean z = true;
        String name;
        int quant;
        int index = 0;
        double price;
        String input;

        ShoppingCart2 myCart = new ShoppingCart2();

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
                index++;
                if (index == myCart.getCartLength()){
                    System.out.println("Cart overflowed, bigger cart added.");
                    myCart.increaseSize();
                }
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

