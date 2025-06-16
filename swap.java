import java.util.*;
class swap{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a=ob.nextInt();
        System.out.println("Enter the Second Number:");
        int b=ob.nextInt();

        System.out.println("First  number after swapping:"+a);
        System.out.println("Second number after swapping:"+b);

        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("First  number before swapping:"+a);
        System.out.println("Second number before swapping:"+b);
                      
        
    }
}