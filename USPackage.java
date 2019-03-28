/*import java.util.ArrayList;
import java.util.Collections;

class USPackage
{
    private double weight;
    private double girth;
    private Dimension d;    // Instantiate variable d of type Dimension. This will encapsulate the length, height and width.

    public USPackage(double n1,double n2,double n3,double n4)  // Constructor for USPackage
    {
        weight = n4;                             // As we know the last parameter passed is weight, store it.
        d = new Dimension(n1,n2,n3);             // Implementation. Will call the constructor of class Dimension
    }


    public class Dimension                      // Sub class to determine length and encapsulate the 3 dimensions of the package together.
    {
        public double length;
        public double width;
        public double height;

        public Dimension(double val1, double val2, double val3)   // Constructor for class Dimension
        {
            ArrayList<Double> vals = new ArrayList<Double>();     // Create an ArrayList vals to store the 3 dimensions.
            vals.add(val1);                                       // Adds the value of val1 in the ArrayList
            vals.add(val2);                                       // Adds the value of val2 in the ArrayList
            vals.add(val3);                                       // Adds the value of val3 in the ArrayList
            Collections.sort(vals,Collections.reverseOrder());    // Sorts the ArrayList in desc order using Collections.sort method.

            this.length = vals.get(0);                            // 0th index will have the highest value so store it in length.
            this.height = vals.get(1);
            this.width = vals.get(2);
        }
    }           // This class is created to return length along with its corresponding height and width as 1 object.


    public Dimension rearrangeDim()
    {
        return (d);
    }


    public double calculateGirth()
    {
        //d = rearrangeDim();
        girth = (2 * d.width) + (2 * d.height);
        return (girth);
    }

    public int validatePackage()
    {
        girth = calculateGirth();
        double size = d.length + girth;
        if(size >100  && weight > 70)
        {
            return 1;
        }

        else if(weight > 70 && size <=100)
        {
            return 2;
        }

        else if(size > 100 && weight<=70 )
        {
            return 3;
        }

        else if(weight == 0 || d.length == 0 || girth == 0)
        {
            return 4;
        }

        else
        {
            return 5;
        }
    }

    public void print(int n)
    {
        int code = n;
        if(code == 5)
        {
            System.out.println("\n\nThe Package is Acceptable.");
        }

        else if(code == 1)
        {
            System.out.println("\n\nThe Package is too Large and too Heavy");
            System.out.println("The Length of Package is: "+d.length);
            System.out.println("The Girth of Package is: "+girth);
            System.out.println("The Weight of the Package is: "+weight);
        }

        else if(code == 2)
        {
            System.out.println("\n\nThe Package is too Heavy");
            System.out.println("The Weight of the Package is: "+weight);
        }

        else if(code == 3)
        {
            System.out.println("\n\nThe Package is too Large");
            System.out.println("The Length of Package is: "+d.length);
            System.out.println("The Girth of Package is: "+girth);
        }

        else if(code == 4)
        {
            System.out.println("\n\nInvalid input");
        }

    }



}

*/