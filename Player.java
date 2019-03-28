package My_Package;

public abstract class Player
{
    private String name;
    private int age;
    private int total_points = 0;




    protected Player(String name, int age)   // Constructor
    {
        this.name = name;
        this.age = age;
    }

    protected String getName()    // Getter method for name
    {
        return name;
    }

    protected int getTotal_points()    // Getter method for total points
    {
        return total_points;
    }

    protected void setTotal_points(int pts)     // Setter method for total points
    {
        total_points = pts;
    }

    protected void printInfo()     // Print info method in parent class which will be overridden in child classes
    {
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age+" Years");
    }

    abstract void cal_total_points(int earned, int lost); // Abstract method whose implementation is provided in child classes

    //abstract void trial_method();



    static
    {
        System.out.println("Hi from static player" );

    }




    protected boolean isLeading(Player p1, Player p2)
    {
        if (p1.total_points > p2.total_points)
        {
            return true;
        }

        else if(p2.total_points > p1.total_points)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

}
