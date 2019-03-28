public class RaneKalyaniA3
{
    static String string1 = "sea";
    static String string2 = "eat";
    static String string3 = "The little drops of water, little grains of sand, Make the mighty ocean and the beauteous land. And the little moments, Humble though they be, Make the mighty ages of eternity. so our little errors lead the soul away.";
    static String search_word = "little";

    public static void main(String [] args)
    {
        string3 = string3 + " ";     // Add space after the last word to help separate the words.
        System.out.println("String 1 is: "+string1);
        System.out.println("String 2 is: "+string2);
        System.out.println("String 3 is: "+string3);

        /*if(string1.length() > string2.length())
        {
            System.out.println("\nIs new String 1 and String 2 equal: "+compute(string1,string2,string2.length()));
        }
        else
        {
            System.out.println("\nIs new String 1 and new String 2 equal: "+compute(string1,string2,string1.length()));
        }*/

        compute_1(string1,string2);

        // Print the number of occurences after calling the method.
        System.out.println("\nThe number of occurences of the word "+ search_word +" is: "+occurences(search_word));
        // Print the longest word after giving a call to the method.
        System.out.println("\nLongest word in String 3 is: " + longest_word(string3));
        //Reverse the string
        System.out.println("\nThe Reversed Capital Paragraph is: "+reverse(string3));
        System.out.println("\nPROGRAM COMPLETED.");
    }

    public static String longest_word(String s3)  // Method to calculate the longest word.
    {
        s3 = s3.replace("."," ");  // Remove '.' to separate the word and '.'
        s3 = s3.replace(","," ");// Remove ',' to separate the word and ','
        String single_word = "";    // Stores a single word.
        String l_word = "";          // To store the longest word.
        char ch;                     // To store a single character of each word while traversing the string until a complete word is found.
        int length = s3.length();
        for(int i = 0; i < s3.length(); i++)
        {
            ch = s3.charAt(i);                // Will store single character
            if( ch != ' ')                        // A word is complete when a blank space is encountered.
            {
                single_word = single_word + ch;      // Stores a single word, one character at a time until a complete word is found.
            }
            else                                  // Enter this once a complete word is found
            {
                if(single_word.length() > l_word.length())         // Compare the current single word with the previously found longest word.
                {
                    l_word = single_word;         // If current word is longer than the previous longest word then store it.
                }
                single_word = "";                 // Empty this variable to store the next complete word.
            }
        }
        return l_word;                     // Returns the longest word to the main function.
    }

   public static int occurences(String s_word)
    {
        int count = 0;
        s_word = s_word.toLowerCase();   // Convert to lower case so that all the occurences are counted irrespective of the case.
        String string_lower = string3.toLowerCase();  // Convert to lower case so that all the occurences are counted irrespective of the case.
        String sep_words[] = string_lower.split(" ");  // Use split function to separate the words in the sentence into elements in an array
        for(int i = 0; i < sep_words.length; i++)
        {
            if(s_word.equals(sep_words[i]))   // Check if the word to be searched is equal to the current word in array.
            {
                count++;    // If yes increase the count.
            }
        }
        return count;
    }

    // Different logic for String1 and String2 task.
    /*public static boolean compute(String s1, String s2, int l)   // The 2 strings have been compared to check if they have a common string
    {                                               // As given in sample input and output, this function checks if sea and eat have common substring ea in them. If yes return true else false.
        for(int i = 0; i < l-1; i++)
        {
            if(s1.contains(s2.substring(i,l)))     //Check if s1 contains a substring present in s2, excluding letters from front till the common substring is found.
            {
                string1 = s2.substring(i,l);
                string2 = s2.substring(i,l);
                System.out.println("\nNew string 1 is: "+string1);
                System.out.println("\nNew string 2 is: "+string2);
                return true;
            }
            else if(s1.contains(s2.substring(0,l-i))) //Check if s1 contains a substring present in s2, excluding letters from back till the common substring is found.
            {
                string1 = s2.substring(0,l-i);
                string2 = s2.substring(0,l-i);
                System.out.println("\nNew string 1 is: "+string1);
                System.out.println("\nNew string 2 is: "+string2);
                return true;
            }
        }
        System.out.println("The two strings do not have a common substring");
        return false;
    }*/

    public static String reverse(String s3)
    {
        s3 = s3.toUpperCase();    // Convert ot upper case
        s3 = s3.replace("."," ");   // Remove '.' and ',' from the original sentence
        s3 = s3.replace(","," ");
        s3 = s3.replace("  "," ");  // Remove double spaces
        String a3[] = s3.split(" ");   //Use split function to separate the words in the sentence into elements in an array
        String finals = "";
        for(int i = a3.length-1; i >= 0 ; i--)  // Start from the last element in the array.
        {
            finals = finals + a3[i] + " ";   // Empty string starts storing the last element of the array with blank space in between every element.
        }
        return finals;
    }


public static void compute_1(String s1, String s2)
    {
        String result = "";
        for(int i = 0; i < s1.length(); i++)
        {
            for(int j = 0; j < s2.length(); j++)
            {
                if((s1.charAt(i)) == (s2.charAt(j)))
                {
                    result = result + s1.charAt(i);
                }
                continue;
            }
        }
        string1 = result;
        string2 = result;
        System.out.println("\nThe new string 1 is: "+string1);
        System.out.println("\nThe new string 2 is: "+string2);
        if(string1.equals(string2))
        {
            System.out.println("\nIs new String 1 and String2 equal: "+compare(string1,string1));
        }
    }

    public static boolean compare(String s1, String s2)
    {
        if( s1.equals(s2) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

