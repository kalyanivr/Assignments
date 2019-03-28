public class calculator
{
    static int credit_fee;
    static int dept_fee;
    static double  state_fee;

    calculator(double sf, int df, int cf)      // Create parameterised constructor
    {
        state_fee = sf;
        dept_fee = df;
        credit_fee = cf;
    }

    public static double tuition_calculator()    // Method to calculate total fees
    {
        state_fee = state_fee * credit_fee;
        double tf = state_fee + dept_fee + credit_fee;    // Type promotion causes int to be converted into double while evaluating the expression.
        return (tf);      // Return the calculated fee to the calling class.
    }

}
