package My_Package;

public class RaneKalyaniA6
{


    public static void main(String args[])
    {
        System.out.println("Hi from static main1" );

        //Player.trial();



        Attacker a = new Attacker("Lionel Messi", 29, 3, 0);  // Create object of class Attacker
        Player p_a = a;
        System.out.println(Attacker.trail_var);

        Goalkeeper g = new Goalkeeper("Petr Cech", 34, 5, 1);  // Create object of class Goalkeeper
        Player p_g = g;

        boolean flag = a.isLeading(a, g);           // Call to isLeading method and store the result in flag variable

        if(flag == true)
        {
            if (a.getTotal_points() > g.getTotal_points())            // Compare the total points for both the objects
            {
                System.out.println("\n"+a.getName() + " leads " + g.getName() + " by " + Math.abs(a.getTotal_points() - g.getTotal_points()) );
            }

            else
            {
                System.out.println("\n"+g.getName()+" leads "+a.getName()+" by "+ Math.abs(a.getTotal_points() - g.getTotal_points()));
            }
        }

        else
        {
            System.out.println("\nNo one is leading");
        }

        System.out.println("\nProgram Completed.");

    }
    static
    {
        System.out.println("Hi from static main2" );

    }

}