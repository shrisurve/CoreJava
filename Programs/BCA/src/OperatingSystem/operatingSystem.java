package OperatingSystem;

public class operatingSystem
{
	private  String osName;
    private int bit;
    public  operatingSystem()
    {
        super();
    }

    public operatingSystem(String osName, int bit) {
        this.osName = osName;
        this.bit = bit;
    }
    public  void displayOs()
    {
        System.out.println("Name:"+osName);
        System.out.println("Type:"+bit);
    }
}
