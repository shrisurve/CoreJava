package Product;

public class Clothes extends  Product
{
    String type;
   public Clothes()
   {
       super();
   }
    public Clothes(String productName, double price, String type)
    {
        super(productName, price);
        this.type = type;
        System.out.println(super.a);
        super.test();
    }
    public  void displayClothes()
    {
        display();
        System.out.println("Type:"+type);
    }
}

