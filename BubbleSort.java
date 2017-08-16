
import java.util.Arrays;

public class BubbleSort{
  public static void main(String[]args){
  int[] testMe= new int[]{10,9,5,4,7,11,12};
   System.out.println("Hello there World! Today I am going to show you how I can implement bubbleSort in Java!");
   System.out.println("Before our wonderful bubbleSort the Array looks like: "+Arrays.toString(testMe));
   printArray(testMe);
   }
public static void printArray(int []arr){
    boolean flag=true;
    int temp;
    while(flag){
    flag=false;
    for(int j=0;j<arr.length-1;j++){
      
      if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        flag=true;
        
        }//end if
      }//end for
    }//end while
    System.out.println("After: "+Arrays.toString(arr));
  }//end method
}//end class
