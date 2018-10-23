package Shopping.Shopping3;

/**
 * Name:
 * Date:
 * Period:
 *
 * Shopping.Shopping1.ShoppingCart.java
 *
 * Represents a shopping cart as an array of items
 */

import Shopping.Item;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart3
{
    private int itemCount;      // total number of items in the cart
    private double totalPrice;  // total price of items in the cart
    //TODO 1a) Declare a cart instance variable
    private ArrayList<Item> cart;



    /**
     * Creates an empty shopping cart with a capacity of 5 items
     */
    public ShoppingCart3()
    {
        itemCount = 0;
        totalPrice = 0.0;
        //TODO 1a) Initialize the cart instance variable to the appropriate size

        cart = new ArrayList<Item>();
    }

    /**
     * Adds an item to the shopping cart.
     * @param itemName
     * @param price
     * @param quantity
     */
    public void addToCart(String itemName, double price, int quantity)
    {
        //TODO 1b) Complete the addToCart method
        cart.add(new Item(itemName,price,quantity));
        totalPrice += (price * quantity);

    }

    //TODO 2b) Complete the getter method getTotalPrice. Remember the getter should not print anything.
    public String getTotalPrice(){return ("Total Price: $" + totalPrice);}


    public int getCartLength()
    {
        return cart.size();
    }


    /**
     *
     * @return the contents of the cart together with summary information
     */
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String contents = "\nShopping Cart\n";
        contents += String.format("%-15s%10s%10s%10s","Item","Price","Quantity","Total\n");


        for (int i = 0; i < cart.size(); i++)
        {
            //contents += cart[i].toString() + "\n";
            contents += String.format("%-15s%10.2f%10d%10.2f\n",cart.get(i).getName(),cart.get(i).getPrice(), cart.get(i).getQuantity(),
                    (cart.get(i).getPrice()*cart.get(i).getQuantity()));

        }

        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";

        return contents;
    }

}
