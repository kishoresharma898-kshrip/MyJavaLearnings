// Note: Do not forget to change the name of the class to the name of the file while creating a Java project.
public class Main
{
    public static void main(String[] args) {

        // Loops:

        // Loops in Java are special kind of statements that repeat a block of code present inside them until some condition specified to the loop reaches to false.
        // In Java, there are basically three kinds of loops.
        // They are:
        // 1. for loop and
        // 2. while loop
        // 3. do while loop
        // Both the loops are identical when compared with the process of producing the output.
        // But the difference will come process of execution and their structure.

        // 1. for Loop:
        // The for loop takes 3 parameters at a time and does repetitions based on them.
        // The parameters are:
        // a. the initial state of iteration variable(also known as starting point of the loop).
        // b. the condition for the iteration variable(this will control the loop till the end).
        // c. the increment or decrement of the iteration variable(this will also control the loop).
        // The construct or structure for this loop is as follows:
        // for (initial; condition; increment/decrement) {
        //     code block;
        // }

        // Example:
        
        // Let us take a basic example of for printing integers till n.
        // This can be implemented as follows:

        int n = 5; // Let n = 5 initially. Will overwritten in later examples
        System.out.println("1. Printing integers till: " + n);
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i); // This loop prints integers starting from 1 till 5. Since n is 5.
        }

        System.out.println("\n");

        // n can be given inside the structure of the for loop. 
        // Sometimes or in some cases it maybe reuirede to keep track of the count of repetitions for someother arithematic calcutions.
        // For that, we can something called as count initial it to 0 first and increase by 1 for every repetition of the loop as shown below.
        
        System.out.println("2. Printing integers till " + n + ". With n specified in the structure itself:");
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d ", i); // This loop prints integers starting from 1 till 5.
            count++;
        }
        System.out.println("\nTotal count of repetitions is: " + count); // 5

        System.out.println();

        // The iteration variable can be started from 0.
        
        System.out.println("3. Printing integers till " + n + ". With iteration variable starting from 0:");
        for (int i = 0; i <= 5; i++) {
            System.out.printf("%d ", i); // This loop prints integers starting from 0 till 5.
        }

        System.out.println("\n");

        // In some cases the requirement can be just up to n(it is like till n but, excluding the n)
        
        System.out.println("4. Printing integers up to " + n + ". With iteration variable starting from 1:");
        for (int i = 1; i < 5; i++) {
            System.out.printf("%d ", i); // This loop prints integers starting from 1 up to 5.
        }

        System.out.println("\n");

        System.out.println("5. Printing integers up to " + n + ". With iteration variable starting from 0:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", i); // This loop prints integers starting from 0 up to 5.
        }

        System.out.println("\n");

        // The iteration variable cannot be accessed outside the loop. If we try to do it, then error/exception may occur which is undesirable.
        // Uncomment the below lines of code to observe the error.
        
        // System.out.println("6. Printing integers up to " + n + ". With iteration variable starting from 0:");
        // for (int i = 0; i < 5; i++) {
        //     System.out.printf("%d ", i); // This loop prints integers starting from 1 up to 5.
        // }
        // System.out.println(i);

        /*
        Output: 
        .../Main.java:85: error: cannot find symbol
        System.out.println(i);
                           ^
        symbol:   variable i
        location: class Main
        */
        
        // System.out.println("\n");

        // Some cases may require to use conditional statements inside the loops to alter the control flow and do some other tasks.
        // One such example among the many is printing even and odd numbers till n or up to n.
        // Let till n for now.

        n = 10; // Overwriting n with 10
        System.out.println("6. Printing even integers till " + n + ". With iteration variable starting from 0:");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i); // This loop prints even integers starting from 0 up to 10.
            }
        }

        System.out.println("\n");

        System.out.println("7. Printing odd integers till " + n + ". With iteration variable starting from 0:");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i); // This loop prints odd integers starting from 0 up to 10.
            }
        }

        System.out.println("\n");

        // Loops can be used to print the tables for a given integer/numbers.
        // Following is the example for it.

        System.out.println("8. Printing table for a given integer/number n:");
        n = 14; // Overwriting n with 14
        int resf; // resf = 0 initially
        System.out.println("Following is the table for the given number: " + n + ". Starting from 1 till 20.");
        for (int i = 1; i <= 20; i++) {
            resf = n * i;
            System.out.printf("%d x %d = %d\n", n, i, resf);
        }

        System.out.println();

        // Loops can contain breaks and they can skip some values as well.
        // For that we use the break and continue keywords inside the loop's body.
        // Following examples shown the implementation for it.

        // a. using the break statement:
        // The break statement breaks the execution of the loop abruptly at one point where it is used, regardless of the condition of the iteration variable.
        // Below is the example.

        n = 10; // Overwriting n with 10
        System.out.println("9. Printing integers till " + n + ". Starting from 1:");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
            if (i == 7) {
                break; // Prints numbers till 7 and stops. As break statement is applied.
            }
        }
        System.out.println("\nPrinted numbers till here as there's a brake applied somewhere.");

        System.out.println();

        // b. using the continue statement:
        // The continue statement skips the execution of the loop for some values of iteration variable where it is used, regardless of the condition of the iteration variable.
        // Below is the example.

        // n = 10
        System.out.println("10. Printing odd integers till " + n + ". Starting from 1 and by skipping all evens by applying continue:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue; //Skips all the odd integers till 10. As continue statement is applied.
            } else {
                System.out.printf("%d ", i);
            }
        }

        System.out.println("\n");

        // n = 10
        System.out.println("11. Printing even integers till " + n + ". Starting from 1 and by skipping all odds by applying continue:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue; //Skips all the even integers till 10. As continue statement is applied.
            } else {
                System.out.printf("%d ", i);
            }
        }

        System.out.println("\n");

        // Loops can used to change the order from ascending to descending and vice-versa.
        // Below is the example for it.

        // n = 10
        System.out.println("12. Printing integers up to " + n + ". In descending order:");
        for (int i = n; i > 0; i--) {
            System.out.printf("%d ", i); // This loop prints integers starting from 10 up to 0.
        }

        System.out.println("\n");

        // 2. while loop:
        // The while loop takes only one parameter and checks its state and does the repetitions based on its condition at that instant.
        // The parameter is the condition for the iteration variable itself. But, the iteration variable should be initialised before starting the loop.
        // The increment/decrement for the iteration variable is carried later inside the loop's body.
        // Unlike the for loop, which does the repetitions based on the count, the while loop does the repetitions till the condition of the iteration variable gets failed.
        // And unlike the for loop, the iteration variable is accessible outside the loop, can even be altered for some other purposes and can also be used for tracking the count of repetitions.
        // Unlike the for loop, the while will stuck in an infinite loop if the iteration variable is not managed properly.
        // The construct or structure for this loop is as follows:
        // initial value iteration variable; // Say int i = 0;
        // while (condition) {
            // some block of code to implement;
            // increment/decrement of iteration variable;
        // }

        // Below are the examples given using while loop.

        System.out.println("13. Printing table for a given integer/number n using while loop:");
        n = 17; // Overwriting n with 17
        int resw, i = 1; // resw = 0 and i = 1 initially. i - iteration variable should be initialised
        System.out.println("Following is the table for the given number: " + n + ". Starting from 1 till 20:");
        while (i <= 20) {
            resw = n * i;
            System.out.printf("%d x %d = %d\n", n, i, resw);
            i++;
        }

        System.out.println();

        n = 10; // Overwriting n with 10 again
        System.out.println("14. Printing integers till " + n + ". Starting from 1 using while loop:");
        i = 1; // i = 1. As i will be 20 from the above example calculations.
        while (i <= n) { // i is just initialised in the above example. But, it is still accessible here.
            System.out.printf("%d ", i);
            if (i == 7) {
                break; // Prints numbers till 7 and stops. As break statement is applied.
            }
            i++;
        }
        System.out.println("\nPrinted numbers till here as there's a brake applied somewhere.");
        System.out.println("Thus the count of repetitions are: " + i); // i is accessible anywhere. Here it is now being used to keep track of the count.

        System.out.println();

        System.out.println("15. Printing odd integers till " + n + ". Starting from 1 and by skipping all evens by applying continue using while loop:");
        i = 0; // Overwriting i with 1 to get the desired output. n = 10
        while (i < n) { // Here it is required to reach up to n(i.e., till n - 1).
            i++;  // Should be placed before or after the calculations as per the requirement. Here it requires to be placed before the calculations and logical operations.
            // Else, it will result in an infinite loop
            if (i % 2 == 0) {
                continue; //Skips all the odd integers till 10. As continue statement is applied.
            } else {
                System.out.printf("%d ", i);
            }
        }

        System.out.println("\n");

        System.out.println("16. Printing even integers till " + n + ". Starting from 1 and by skipping all odds by applying continue using while loop:");
        i = 1; // n = 10. Here i can start from 1 and reach till n. The output will be as desired.
        while (i <= n) {
            i++; // Here also it requires to be placed before the calculations and logical operations.
            if (i % 2 != 0) {
                continue; //Skips all the even integers till 10. As continue statement is applied.
            } else {
                System.out.printf("%d ", i);
            }
        }

        // Note: Thus, programmers/developers need to be very careful with while loops.

        System.out.println("\n");

        System.out.println("17. Printing integers up to " + n + ". In descending order using while loop:");
        i = n; // n = 10
        while (i > 0) {
            System.out.printf("%d ", i); // This loop prints integers starting from 10 up to 0(i.e., till 1).
            i--;
        }

        System.out.println("\n");

        // 3. do-while loop:

        // The do-while loop does the work similar to while loop. 
        // But, the only difference between these two loops is that, the do-while loop does the repetition/calculations at least once even the condition in the while fails.
        // In other words this loop executes the code block at least once before evaluating the condition. Thus, this loop is also called as exit controlled loop.
        // Other than this remaining thnigs are just similar to the other loops. But, very similar to while loop.
        // Like the while loop, this loop also does the repetitions till the condition of the iteration variable gets failed.
        // Like the while loop, iteration variable is accessible outside the loop, can even be altered for some other purposes and can also be used for tracking the count of repetitions.
        // Similar to the while loop, will also stuck in an infinite loop if the iteration variable is not managed properly.
        // The syntax or construct for this loop is as follows:
        // initial value iteration variable; // Say int i = 0;
        // do {
            // some block of code to implement;
            // increment/decrement of iteration variable;
        // } while (condition);

        // Below are the examples given using while loop.

        System.out.println("18. Printing table for a given integer/number n using do-while loop:");
        n = 13; // Overwriting n with 13
        int resdw, j = 1;
        System.out.println("Following is the table for the given number: " + n + ". Starting from 1 till 20:");
        do {
            resdw = n * j;
            System.out.printf("%d x %d = %d\n", n, j, resdw);
            j++;
        } while (j <= 20);

        System.out.println();

        n = 10; // Overwriting n with 10 again
        System.out.println("19. Printing integers till " + n + ". Starting from 1 using while loop:");
        j = 1; // j = 1. As i will be 20 from the above example calculations.
        do { // j is just initialised in the above example. But, it is still accessible here.
            System.out.printf("%d ", j);
            if (j == 7) {
                break; // Prints numbers till 7 and stops. As break statement is applied.
            }
            j++;
        } while (j <= n);
        System.out.println("\nPrinted numbers till here as there's a brake applied somewhere.");
        System.out.println("Thus the count of repetitions are: " + j + " "); // j is accessible anywhere. Here it is now being used to keep track of the count.

        System.out.println();

        System.out.println("20. Printing odd integers till " + n + ". Starting from 1 and by skipping all evens by applying continue using do-while loop:");
        i = 0; // Overwriting i with 1 to get the desired output. n = 10
        do { // Here it is required to reach up to n(i.e., till n - 1).
            i++;  // Should be placed before or after the calculations as per the requirement. Here it requires to be placed before the calculations and logical operations.
            // Else, it will result in an infinite loop
            if (i % 2 == 0) {
                continue; //Skips all the odd integers till 10. As continue statement is applied.
            } else {
                System.out.printf("%d ", i);
            }
        } while (i < n);

        System.out.println("\n");

        System.out.println("21. Printing even integers till " + n + ". Starting from 1 and by skipping all odds by applying continue using do-while loop:");
        j = 1; // n = 10. Here i can start from 1 and reach till n. The output will be as desired.
        while (j <= n) {
            j++; // Here also it requires to be placed before the calculations and logical operations.
            if (j % 2 != 0) {
                continue; //Skips all the even integers till 10. As continue statement is applied.
            } else {
                System.out.printf("%d ", j);
            }
        }

        // Note: Thus, programmers/developers need to be very careful with do-while loops as well.

        System.out.println("\n");

        System.out.println("22. Printing integers up to " + n + ". In descending order using do-while loop:");
        j = n; // n = 10
        do {
            System.out.printf("%d ", j); // This loop prints integers starting from 10 up to 0(i.e., till 1).
            j--;
        } while (j > 0);

        System.out.println("\n");

        // Failing case example for do-while loop is as follows:
        System.out.println("23. Failing case for do-while loop. Prints j's value atleast once before evaluating the failing condition given in while:");
        j = 1;
        do {
            System.out.printf("%d ", j); // This loop prints just 1 as the condition given in the while fails.
            j--;
        } while (j > 1);
        System.out.println("\nThe iteration variable j is now: " + j); // 0

        System.out.println();

        // This proves that the do-while does the repetition at least once even the condition given in the while fails.

        // Nested loops:
        
        // Loops can be nested inside another loop. This can used to print desired patterns and iterate over 2-dimensional arrays and objects in Java.
        // Iterating over 2-D and n-D arrays(also referred as matrices) and objects in Java will be discussed later.
        // For now to understand the use of nested loops let us print some desired patterns.
        // Take for example we want a right-angled triangle using "*". For this we can use nested for loop as follows:

        System.out.println("24. Nested for-loop for printing right-angled triangle:");
        String s = "", result = "";
        n = 5; // Overwriting n with 5
        for (int k = 1; k <= n; k++) { // k should be within the range of n
            s = "*";
            for (int l = k; l <= k; l++) { // l should be within the range of k
                result += s;
                System.out.println(result);
            }
        }

        System.out.println();

        // Now let us say we want an inverted right-angled triangle. Then in such case we use a single for-loop as follows:
        // For this pattern we need to know some basic string methods like:
        // 1. length() - calculates the length of the string.
        // 2. substring(start, end) - fetches out the substring from the main string from start till end.
        // 3. charAt(x) - fetches out the character present at xth position. Used in later topics related string management.
        // 4. repeat(x) - repeats the string for x number of times.

        System.out.println("25. Using single for-loop for printing inverted right-angled triangle:");
        s = "*****";
        result = "";
        for (int k = s.length(); k > 0; k--) {
            result += s;
            System.out.println(result);
            s = s.substring(0, k-1);
            result = "";
        }

        System.out.println();
        
        System.out.println("26. Nested for-loop for printing inverted right-angled triangle:");
        s = "*****";
        result = ""; // Initialising result with ""(empty string)
        String temp = ""; // Initialising temp with ""
        for (int k = s.length(); k > 0; k--) {
            result += s;
            System.out.println(result);
            // Replaced substring() method with nested for-loop.
            for (int l = 0; l < k-1; l++) {
                temp += s.charAt(l);
            }
            s = temp;
            temp = "";
            result = "";
        }

        System.out.println();

        System.out.println("27. Using single for-loop to print inverted right-angled triangle with odd lines:");
        s = "*******"; result = "";
        for (int k = s.length(); k > 0; k--) {
            if (k % 2 != 0) {
                result += s;
                System.out.println(result);
                // result = ""; // Can be given here (or)
            }
            s = s.substring(0, k-1);
            result = ""; // Can be given here as well
        }

        System.out.println();

        System.out.println("28. Nested for-loop for printing inverted right-angled triangle with odd lines:");
        s = "******";
        result = ""; // Overwriting result with ""(empty string)
        temp = ""; // Overwriting temp with ""
        for (int k = s.length(); k > 0; k--) {
            if (k % 2 != 0) {
                result += s;
                System.out.println(result);
            }
            // Replaced substring() method with nested for-loop.
            for (int l = 0; l < k-1; l++) {
                temp += s.charAt(l);
            }
            s = temp;
            temp = "";
            result = "";
        }

        System.out.println();

        System.out.println("29. Using single for-loop to print equilateral inverted triangle:");
        s = "********"; result = "";
        temp = "";
        i = 1; // Overwriting i as it is already defined.
        // Note: The for loop will always run for odd values of k so that the triangle will print with sharp vertices.
        for (int k = s.length(); k > 0; k--) {
            if (k % 2 != 0) {
                result += s;
                result = temp + result;
                System.out.println(result);
                temp = " ";
                temp = temp.repeat(k - (k - i));
                i++;
            }
            s = s.substring(0, k-1);
            result = ""; // Should always be given here
        }

        System.out.println();

        System.out.println("30. Nested for-loop for printing equilateral triangle:");
        s = "*"; // Overwriting s with "*"
        result = ""; // Overwriting result with ""(empty string)
        temp = ""; // Overwriting temp with ""
        String resultant = ""; // Initialising resultant(buffer result) with ""
        n = 8;
        i = (n - 1) / 2; // i is taken with this expression so that unnecessary white spaces won't get added.
        for (int k = 1; k <= n; k++) {
            // Note: The for loop will always run for odd values of l(or k) so that the triangle will print with sharp vertices.
            for (int l = k; l <= k; l++) {
                result += s;
                if (l % 2 != 0) {
                    temp = " ";
                    temp = temp.repeat(i);
                    resultant = temp + result;
                    System.out.println(resultant);
                    resultant = "";
                    i--;
                }
            }
        }

        // Alter the values of n and s to observe the changes happen to the patterns and make an eye on the side comments so that no pattern prints in undesirable pattern.
        
        // So, in this way the loops are useful for iterating a process for required number of times.
        // Loops are very useful for iterating or travesing over Strings, arrays and other objects.
        // These are also useful when it is required to perform operations on matrices(which are represented as arrays in Java and programming languages).
        // The above are too advanced topics and some of them are not to discuss as of now like operations on matrices.
    }
}
