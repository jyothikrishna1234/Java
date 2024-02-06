public class Product
{
    int pcode;
    String pname;
    double price;
    void data(int c,String n,double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display(){
        System.out.println("pcode\t"+pcode+"\t\t");
        System.out.println("pname\t"+pname+"\t\t");
        System.out.println("price\t"+price+"\t\t");
    }
    public static void main(String args[])
    {
        Product obj1=new Product();
        Product obj2=new Product();
        Product obj3=new Product();
        obj1.data(101,"Product_1",100.0);
        obj2.data(102,"Product_2",128.40);
        obj3.data(103,"Product_3",790.00);
        System.out.println("Product Information:\n Product_Code\tProduct_Name\tProduct_Price");
        obj1.display();
        obj2.display();
        obj3.display();




    }
}