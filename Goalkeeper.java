package My_Package;

public class Goalkeeper extends Player
{

    private int GoalsSaved;
    private int GoalsConceded;

    static
    {
        System.out.println("\nHi from static goal" );

    }

    protected Goalkeeper(String name, int age, int saved, int conceded)  // Constructor
    {
        super(name,age);
        this.GoalsConceded = conceded;
        this.GoalsSaved = saved;
        printInfo();
    }



    protected void printInfo()           //Overridden print info method in child class
    {
        //System.out.println("Name: "+super.getName());
        //System.out.println("Age: "+super.getAge());
        super.printInfo();
        System.out.println("Type: Goalkeeper");
        System.out.println("Goals Saved: "+GoalsSaved);
        System.out.println("Goals Conceded: "+GoalsConceded);
        cal_total_points(GoalsSaved,GoalsConceded);
        System.out.println("Total Points: "+  super.getTotal_points()); //cal_total_points(GoalsSaved, GoalsConceded));
    }


    protected void cal_total_points(int earned, int lost)   // Method to calculate total points
    {
        // earned is for the points earned, lost is for points lost
        lost = -1 * lost;
        super.setTotal_points(earned + lost);
    }






}
