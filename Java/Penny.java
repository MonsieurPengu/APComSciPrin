import java.util.*;

public class Penny
{

   

   public static void main(String[] args)
   {
   
      int penNum;
      int penQuarts;
      int penLeft;
      
      
      Scanner keyborad = new Scanner(System.in);
      
      System.out.print("Enter a number of pennies:" + " ");
      
      penNum = keyborad.nextInt();
      
      penQuarts = (penNum/25);
      
      penLeft = (penNum%25);
      
      if(penQuarts == 1)
      {
         System.out.println("There is" + " " + penQuarts + " " + "quarter in" + " " + penNum + " " + "pennies");
      }
      else
      {
         System.out.println("There are" + " " + penQuarts + " " + "quarters in" + " " + penNum + " " + "pennies");
      }
      
      
      
      
      
      if(penLeft == 1)
      {
         System.out.println("There is" + " " + penLeft + " " + "penny left.");   
      }
      else
      {
         System.out.println("There are" + " " + penLeft + " " + "pennies left.");
      }
      
      
   }
}
