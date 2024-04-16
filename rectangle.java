package Graphics;
import java.util.Scanner;

public class rectangle implements area_cal{
    double l,b;
    @Override
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length");
        l=sc.nextDouble();
        System.out.println("Input breadth");
        b=sc.nextDouble();
        System.out.println("area of rectangle"+(l*b));
    }
    
}