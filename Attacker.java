package My_Package;

public class Attacker extends Player
{
    private int GoalsScored;
    private int GoalsMissed;
    int k;
    static int trail_var = 0;


    protected Attacker(String name, int age, int scored, int missed)   // Constructor
    {
        super(name,age);
        this.GoalsScored = scored;
        this.GoalsMissed = missed;
        printInfo();
    }


    protected void printInfo()             //Overridden print info method in child class
    {
        //System.out.println("Name: "+super.getName());
        //System.out.println("Age: "+super.getAge());
        //System.out.println(super.getName());
        super.printInfo();
        System.out.println("Type: Attacker");
        System.out.println("Goals Scored: "+GoalsScored);
        System.out.println("Goals Missed: "+GoalsMissed);
        cal_total_points(GoalsScored,GoalsMissed);
        System.out.println("Total Points: "+ super.getTotal_points()    );//cal_total_points(GoalsScored, GoalsMissed));
    }

     void cal_total_points(int earned, int lost)   // Method to calculate total points
    {
        // earned is for the points earned, lost is for points lost
        earned = 3 * earned;
        lost = -1 * lost;
        super.setTotal_points(earned + lost);
    }

    public  static void trial()
    {
        System.out.println("Hi from static method player" );
    }



    static
    {
        System.out.println("Hi from static attacker");

    }



}
