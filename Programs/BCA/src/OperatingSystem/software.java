package OperatingSystem;

public class software extends operatingSystem
{
    private String softwareName;
    private  String type;
    private  double size;
    public  software()
    {
        super();
    }
    public software(String osName, int bit, String softwareName, String type, double size)
    {
        super(osName, bit);
        this.softwareName = softwareName;
        this.type = type;
        this.size = size;
    }
    public  void displaySoftware()
    {
        System.out.println("Software Name:"+softwareName);
        System.out.println("Software Type:"+type);
        System.out.println("Software Size:"+size);
    }
}
