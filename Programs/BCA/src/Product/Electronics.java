package Product;

public class Electronics extends Product
{
    int warranty;
    public Electronics()
    {
        super();
    }

    public Electronics(String productName, double price, int warranty) {
        super(productName, price);
        this.warranty = warranty;
    }

    public  void displayElectronics()
    {
        display();
        System.out.println("Warranty"+warranty);
    }
}
