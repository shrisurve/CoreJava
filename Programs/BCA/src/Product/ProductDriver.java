package Product;

public class ProductDriver {
    public static void main(String[] args)
    {
        Product p1=new Clothes("T-Shirt",499,"Western");

        Product p2=new Electronics("Samsung note 10",55909,2);

        System.out.println("********************************Upcasting*******************************");
        p1.display();
        System.out.println("************************************************************************");
        p2.display();
        System.out.println("******************************Downcasting*******************************");

        ((Clothes)p1).displayClothes();
        System.out.println("******************************Downcasting*******************************");
        ((Electronics)p2).displayElectronics();
        System.out.println("****************************************************************************");

    }
}
