import java.util.Scanner;
public class Student
{
    int rollno;
    int m1;
    int m2;
    int m3;
    int total;
    String name;
    float average;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter name,rollno and marks of 3 subjects");
        name=scan.nextLine();
        rollno=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
    }
    void cal()
    {
        total=m1+m2+m3;
        average=total/3.0f;
        System.out.println("Total:"+total);
        System.out.println("Average:"+average);
        
    }
    public static void main(String[] args)
    {
        Student stud1=new Student();
        stud1.getdata();
        System.out.println("Student details");
        System.out.println("\trollno:"+stud1.rollno);
        System.out.println("\tname:"+stud1.name);
        stud1.cal();
    }
    }
