//String Manipulation
import java.util.Scanner;
public class String_man{
    public static void main(String[]args){
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("length of string= "+str1.length());
        System.out.println("Character at first position ="+str1.charAt(1));
        System.out.println("String contains'col' sequence : "+str1.contains("col"));
        System.out.println("String ends with e:"+str1.endsWith("e"));
        System.out.println("Replace 'col'with'kol': "+str1.replaceAll("col","kol"));
        System.out.println("LOWERCASE :"+str1.toLowerCase());
        System.out.println("UPPERCASE :"+str1.toUpperCase());
    }
}