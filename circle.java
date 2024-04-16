package Graphics;
import java.util.Scanner;

public class circle implements area_cal{
    double radius;
    @Override
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input radius of circle");
        radius=sc.nextDouble();
        System.out.println("area of circle"+(3.14*radius*radius));
    }
    
}