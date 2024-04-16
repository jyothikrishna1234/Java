package Graphics;
import java.util.Scanner;

public class square implements area_cal{
    int a;
    @Override
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side");
        a=sc.nextInt();
        System.out.println("area of square"+(a*a));
    }
    
}
