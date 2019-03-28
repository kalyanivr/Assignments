import java.util.ArrayList;
import java.util.Collections;

public class RaneKalyaniA5
{
    // Declare private variables.

    private double weight;
    private double length;
    private double height;
    private double width;
    private double girth;

    public RaneKalyaniA5(double n1, double n2, double n3, double n4)  //Constructor for class RaneKalyaniA5
    {
        weight = n4;
        length = n1;
        width = n2;
        height = n3;
    }

    public static void main (String[] args)
    {

        RaneKalyaniA5 parcel1 = new RaneKalyaniA5(5, 13.5, 2, 40);                     // Create an object of type RaneKalyaniA5 called parcel1
        parcel1.rearrangeDim(parcel1.length, parcel1.height, parcel1.width);           // Call the rearrangeDim method to assign the longest side as length.
        parcel1.girth = parcel1.calculateGirth(parcel1.height, parcel1.width);               // Call the calculateGirth method
        int code1 = parcel1.validatePackage(parcel1.length, parcel1.weight, parcel1.girth);  // Call the validatePackage and store its result in code1
        parcel1.print(code1);                                                       // Call the print method to print if the package is acceptable or not.

        RaneKalyaniA5 parcel2 = new RaneKalyaniA5(15.7, 25, 54, 47.6);
        parcel2.rearrangeDim(parcel2.length, parcel2.height, parcel2.width);
        parcel2.girth = parcel2.calculateGirth(parcel2.height, parcel2.width);
        int code2 = parcel2.validatePackage(parcel2.length, parcel2.weight, parcel2.girth);
        parcel2.print(code2);

        RaneKalyaniA5 parcel3 = new RaneKalyaniA5(13, 10.9, 21, 90.5);
        parcel3.rearrangeDim(parcel3.length, parcel3.height, parcel3.width);
        parcel3.girth = parcel3.calculateGirth(parcel3.height, parcel3.width);
        int code3 = parcel3.validatePackage(parcel3.length, parcel3.weight, parcel3.girth);
        parcel3.print(code3);

        RaneKalyaniA5 parcel4 = new RaneKalyaniA5(43, 45, 10.8, 102.0);
        parcel4.rearrangeDim(parcel4.length, parcel4.height, parcel4.width);
        parcel4.girth = parcel4.calculateGirth(parcel4.height, parcel4.width);
        int code4 = parcel4.validatePackage(parcel4.length, parcel4.weight, parcel4.girth);
        parcel4.print(code4);

        System.out.println("\n\nProgram Completed.");

    }



        public void rearrangeDim(double l, double h, double w)    // Assigns the longest side as the length.
        {
            ArrayList<Double> vals = new ArrayList<Double>();     // Create an ArrayList vals to store the 3 dimensions.
            vals.add(l);                                          // Adds the value of val1 in the ArrayList
            vals.add(h);                                          // Adds the value of val2 in the ArrayList
            vals.add(w);                                          // Adds the value of val3 in the ArrayList
            Collections.sort(vals,Collections.reverseOrder());    // Sorts the ArrayList in desc order using Collections.sort method.
           // double varr = Collections.max(vals);
            //System.out.println("Max is"+varr);
            length = vals.get(0);                            // 0th index will have the highest value so store it in length.
            height = vals.get(1);
            width = vals.get(2);
        }

        public double calculateGirth(double height, double width)
        {
            girth = (2 * width) + (2 * height);
            return girth;
        }

    public int validatePackage(double length, double weight, double girth)
    {
        double size = length + girth;
        if(size >100  && weight > 70)
        {
            return 1;                       // Return 1 if the Package is too large and too heavy.
        }

        else if(weight > 70 && size <=100)
        {
            return 2;                      // Return 2 if the Package is too heavy.
        }

        else if(size > 100 && weight<=70 )
        {
            return 3;                     // Return 3 if the Package is too large.
        }

        else if(weight == 0 || length == 0 || girth == 0)
        {
            return 4;                     // Return 4 if the dimensions required are 0.
        }

        else
        {
            return 5;                     // Return 5 if the Package is acceptible and satisfies the conditions.
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
            System.out.println("The Length of Package is: "+length);
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
            System.out.println("The Length of Package is: "+length);
            System.out.println("The Girth of Package is: "+girth);
        }

        else if(code == 4)
        {
            System.out.println("\n\nInvalid input");
        }

    }

}
/*

https://www.tutorialspoint.com/java/java_arraylist_class.htm
https://www.tutorialspoint.com/java/util/collections_sort_comparable.htm

 */
