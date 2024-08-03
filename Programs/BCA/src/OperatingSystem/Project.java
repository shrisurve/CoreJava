package OperatingSystem;

public class Project extends software 
{
    private  String projectName;
    private  String projectDomain;
    private  int duration;

    public  Project()
    {
        super();
    }
    public Project(String osName, int bit, String softwareName, String type, double size, String projectName, String projectDomain, int duration)
    {
        super(osName, bit, softwareName, type, size);
        this.projectName = projectName;
        this.projectDomain = projectDomain;
        this.duration = duration;
    }
    public  void displayProject()
    {
        System.out.println("Project Name: "+projectName);
        System.out.println("Project Domain: "+projectDomain);
        System.out.println("Project Duration: "+duration);
        System.out.println("************************************************************");
        System.out.println("----------------Software Details----------------------------");
        displaySoftware();
        System.out.println("************************************************************");
        System.out.println("----------------Operating System Details--------------------");
        displayOs();
        System.out.println("************************************************************");

    }
}

