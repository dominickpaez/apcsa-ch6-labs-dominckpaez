package Sales;
/**
 * Name:
 * Date:
 * Period:
 *
 * Sales.Sales.java
 *
 * Reads in and stores sales for each of 5 salespeople.  Displays
 * sales entered by salesperson id and total sales for all salespeople.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        //TODO 4) Prompt the user for the number of sales people that they need to enter
        //TODO 4) and modify the program to create an appropriately sized array.
        System.out.println("How many salespeople do you want? ");
        final int SALESPEOPLE = scan.nextInt();

        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        //print the array for verification
        //System.out.println(Arrays.toString(sales));

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i < sales.length; i++)
        {
            System.out.println("\t " + (i+1)+ "\t\t\t" + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);


        //TODO 1b) Use your average method to print the average sales
        System.out.println("Average sales: " + average(sales));

        //TODO 2b) Use your indexOfMax method to print the index of the best sales person
        //TODO 2b) and the sales amount for that sales person.
        System.out.println("Best seller is salesperson " + (indexOfMax(sales) + 1) + ": " + sales[indexOfMax(sales)]);


        //TODO 3b) Do the same for the worst sales person
        System.out.println("Worst seller is salesperson " + (indexOfMin(sales) + 1) + ": " + sales[indexOfMin(sales)]);



    }

    public static double average(int[] arr) throws IllegalStateException
    {
        //TODO 1a) compute and return the average of arr
        //Be sure to use the length instance variable and you may assume that the array is full.
        //If the array does not have at least 1 element in it, throw an IllegalStateException
        if(arr.length == 0){
            throw new IllegalStateException();
        }
        double total = 0;
        double avg;
        for(int i = 0;i < arr.length;i++){
            total += arr[i];
        }
        avg = (total/arr.length);
        return avg;
    }

    public static int indexOfMax(int[] arr)
    {
        //TODO 2a) find and return the index of the max value in arr
        int max = arr[0];
        int maxLocation = 0;
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] > max){
                max = arr[i];
                maxLocation = i;
            }
        }
        return maxLocation;
    }

    //TODO 3a) Do the same for an indexOfMin method
    public static int indexOfMin(int[] arr)
    {
        //TODO 2a) find and return the index of the max value in arr
        int min = arr[0];
        int minLocation = -1;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < min) {
                min = arr[i];
                minLocation = i;
            }
        }
        return minLocation;
    }


}
