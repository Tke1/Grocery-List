import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
      out.print("Please list three items on your grocery shopping list. \n"); 
      Scanner keyboard = new Scanner(System.in);
      String Item1;
      out.print("Item 1? ");
      Item1 = keyboard.nextLine();
      
      String Item2;
      out.print("Item 2? ");
      Item2 = keyboard.nextLine();
      
      String Item3;
      out.print("Item 3? ");
      Item3 = keyboard.nextLine();
      out.print("\n");
      
      out.println("Now, please enter the quantity of each item. ");
      int Item1quant;
      out.print("How many " + Item1 + " ?  ");
      Item1quant = keyboard.nextInt();
      
      int Item2quant;
      out.print("How many " + Item2 + " ?  ");
      Item2quant = keyboard.nextInt();
      
      int Item3quant;
      out.print("How many " + Item3 + " ?  ");
      Item3quant = keyboard.nextInt();
      out.print("\n");
      
      out.println("Now, please enter the price of each item.");
      float Item1price;
      out.print("How much deos one " + Item1+ " cost?  ");
      Item1price = keyboard.nextFloat();
      
      float Item2price;
      out.print("how much does one " + Item2+ " cost?  ");
      Item2price = keyboard.nextFloat();
      
      float Item3price;
      out.print("how much does one " + Item3+ " cost?  ");
      Item3price = keyboard.nextFloat();
      out.print("\n");
      
      out.print("Calculating your grocery bill. \n");
      float pricetotal = (Item1quant*Item1price) + (Item2quant*Item2price) + (Item3quant*Item3price);
      out.println("Your total cost is  " + pricetotal);
    
      
      
        
      
      
      
      
      
    }  
}