package Product;

public class Product
{
    String productName;
    int a=12;
    double price;
    public  void test()
    {
        System.out.println("Testing");
    }
    public  Product()
    {
        super();
    }
    public  Product(String productName,double price)
    {
        this.productName=productName;
        this.price=price;
    }
    public  void display()
    {
        System.out.println("Product Name:"+productName);
        System.out.println("Product Price:"+price);
    }
}
