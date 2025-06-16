import java.util.*;
class diff{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the Float value:");
        float a=ob.nextFloat();
        System.out.println("Enter the Double value:");
        double b=ob.nextDouble();

        System.out.println("Float value is:"+a);
        System.out.println("Double value is:"+b);

        a=a*100000f;
        b=b*100000;
        
        System.out.println("Float value is:"+a);
        System.out.println("Double value is:"+b);
                      
        
    }
}