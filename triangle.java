package Graphics;
import java.util.Scanner;

public class triangle implements area_cal{
    double b,h;
    @Override
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length");
        b=sc.nextDouble();
        System.out.println("Input breadth");
        h=sc.nextDouble();
        System.out.println("area of triangle"+(0.5*b*h));
    }
    
}