import java.util.*;
class covert{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a Intger Number:");
         int Value = ob.nextInt();
         float val1=(float) Value;
         double val2=(double) Value;
         String val3=Integer.toString(Value);

         System.out.println("Original Integer Value:"+Value);
         System.out.println("Convert to Float:"+val1);
         System.out.println("Convert to Double:"+val2);
         System.out.println("Convert to String:"+val3);


    }
}
