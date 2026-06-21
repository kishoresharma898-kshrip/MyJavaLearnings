// Note: Do not forget to change the name of the class to the name of the file while creating a Java project.
public class Main
{
    public static void main(String[] args) {
            // This is a single-line comment in Java
        /*This is a
        Multi-line comment in Java. 
        Supports any number of new-lines.*/
        System.out.println("Hello, World!!!"); // println() function/method 
        // prints the output on to the java console/screen and produces a 
        // new-line(i.e., \n) after printing the output.
        System.out.print("Hello, Java!"); // print() function/method 
        // prints the output on to the java console/screen without producing 
        // a new-line(i.e., \n) after printing the output.

        // To produce a new-line while printing the output using print() 
        // function we need to use the escape character \n which produces a 
        // new-line. Thus, the println() function is used quite often than the 
        // print() function.

        // Below examples show the differences between println() and print() 
        // methods with even more clarity.
        System.out.print(" So, this is an example with print() without using \\n (new-line character/char).");

        System.out.print("\nAnd so this, is an example with print() \\n (new-line character/char).\n");

        System.out.println("So, you can see the difference between from the above examples itself.");

        System.out.println("Now, this is an example using println() method. No need to use the \\n for new line."); 
        // \\n, \\t, \\r, \\b and \\f - The double back-slashes escape this 
        // escape character i.e., single back-slash(\) so that the characters 
        // after them will not get affected.

        /*\\ → backslash
        \" → double quote
        \' → single quote
        \n → new line
        \t → tab
        \r → carriage return
        \b → backspace
        \f → form feed*/

        // There is another function which is the printf() method. This method 
        // is very much similat to the printf() function in C Programming. The 
        // only difference is that it should be accessed from the class System. 
        // Here is a exmaple for it.

        System.out.printf("This is a line/string using printf() method. \nThis printf() method also uses the escape sequence character \\n. Similar to print() method.\n");
        // Use of %s... is an optional for this method if we use only 
        // strings to print as output.

        // But, if we want to use this function to print numbers and 
        // decimals than you need to use,
        /*%f - for Floats
        %f%n - for doubles
        %.2f - for 2 decimal floats
        %.xf - for x number of decimal floats
        %.2f%n - for 2 decimal doubles
        %.xf%n - for x number of decimal doubles*/
        // The below examples show the uses.

        System.out.println(); // Blank line to make gap.

        double pi = Math.PI; // Math.PI is a constant(i.e., invariable)
        double amount = 12345.6789;

        // Default precision (6 dedimal places)
        System.out.printf("Default: %f%n", pi);

        // Two decimal places
        System.out.printf("Two decimals: %.2f%n", pi);

        // Grouping separator with two decimals
        System.out.printf("With commas: %.2f%n", amount);

        // Width 12, zero-padded, two decimals
        System.out.printf("Zero padded: %012.2f%n", amount);

        // Same kind of formatting follows for the floating points as well.

    }
}