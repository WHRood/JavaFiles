//created by wrood on 8/16/2017
//created in order to echo the input based on the user's input.
//Simply prints what is given to the user
import java.util.Scanner;

public class SimpleScanner{
  public static void main(String[] args){
   
   Scanner s= new Scanner(System.in)//creates a new instance of a Scanner object in order to accept input from the user.
   
   System.out.println("What would you like to echo?");
   
   String input=s.getNextLine();
   
   System.out.println(input);// print to the console the input from the user
   
   s.close();//Always a good practice to close scanner objects although they close automatically.
   
  }//end main
}//end class
