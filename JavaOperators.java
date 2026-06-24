// Note: Do not forget to change the name of the class to the name of the file while creating a Java project.
public class Main
{
    public static void main(String[] args) {

        // Operators in Java:

        // An operator are used to do the arithematic, assignment and logical 
        // operations for operands to the either sides of the operator.

        // Operators are classified as follows:
        // 1. Arithematic Operators
        // 2. Comparison(also known as Relational) Operators
        // 3. Logical Operators
        // 4. Assignment Operators
        // 5. Increment and Decrement Operators
        // 6. Conditional(also known as Ternary) Operator
        // 7. Bitwise Operators
        // 8. Shift Operators
        // 9. Special Operators(instanceof operator and dot(.) operator)

        // 1. Arithematic Operators:

        // These operators produce a result of an arithematic operation like 
        // addition, subtraction, multiplication and division between numbers.

        // Examples of arithematic operators are as follows:
        // a. + -> Addition
        // b. - -> Subtraction
        // c. * -> Multiplication
        // d. / -> Division
        // e. % -> Modulo/Reminder Division(Results in producing a reminder 
        // of a division opertion)

        System.out.println("1. Arithematic Operators:");
        int a = 5, b = 45;
        System.out.printf("Addition of %d and %d is: %d", a, b, (a + b)); // 50
        System.out.printf("\nSubtraction of %d from %d is: %d", b, a, (b - a)); // 40
        System.out.printf("\nMultiplication of %d by %d is: %d", b, a, (a * b)); // 225
        System.out.printf("\nDivision of %d by %d is: %d", b, a, (b / a)); // 9
        System.out.printf("\nModulo Division of %d by %d is: %d", b, a, (b % a)); // 0
        int x, y; // Initialized by zeroes for both
        x = 7;
        y = 37;
        System.out.println("\nModulo Division of " + y + " by " + x + ": " + (y % x)); // 1
        // Note: The same kind of operations follow for floats and doubles as well.

        System.out.println();
        // 2. Comparison Operators:

        // These operators do the comparison of the operators do the 
        // comparison of the operands of either sides and produce a boolean 
        // value(true/false).

        // Based on the result the flow of the program alters from one step 
        // to other.

        // Examples for such operators are:
        // 1. > - Greater than. Checks which operand is greater among the either sides. If yes, results/returns true. Else, false.
        // 2. >= - Greater than or equal to. Checks which operand is greater than or equal to among the either sides. If yes, results/returns true. Else, false.
        // 3. < - Less than. Checks which operand is lesser among the either sides. If yes, results/returns true. Else, false.
        // 4. <= - Less than or equal to. Checks which operand is less than or equal to among the either sides. If yes, results/returns true. Else, false.
        // 5. == - Is equals to. Checks whether operands among the either sides are equal. If yes, results/returns true. Else, false.
        // 6. != - Is not equals to. Checks whether operands among the either sides are not equal. If yes, results/returns true. Else, false.

        // Here for enhancing the understanding we are going to use Java's if statement.
        // For now, think about the if statement like a block of code that gets executed if some condition is true. Else, the block of code under it not get executed.
        // In that condition we are going to put the comparison of operands.

        System.out.println("2. Comparison Operators:");
        int c = 34, d = 43;
        if (d > c) { // results true
            System.out.printf("Greater among %d and %d is: %d. And that's: %b.", d, c, d, (d > c));
        }
        c = 43;
        if (d >= c) { // results true as c is also equal to 43
            System.out.printf("\nGreater than or equal to among %d and %d is: %d. And that's: %b.", d, c, d, (d >= c));
        }
        c = 34;
        if (c < d) { // results true
            System.out.printf("\nLesser among %d and %d is: %d. And that's: %b.", c, d, c, (c < d));
        }
        d = 34;
        if (c <= d) { // results true as d is also equal to 34
            System.out.printf("\nLesser than or equal to among %d and %d is: %d. And that's: %b.", c, d, c, (c <= d));
        }
        if (c == d) { // results true as c and d both are equal to 34
            System.out.printf("\nEqual to among %d and %d is: %d. And that's: %b.", c, d, c, (c == d));
        }
        d = 43;
        if (c != d) { // results true as d is also equal to 34
            System.out.printf("\n%d and %d are not equal. And that's: %b.", c, d, (c != d));
        }

        System.out.println("\n");
        // Note: And, the same can be applied for floats and doubles as well.

        // 3. Logical Operators:

        // These operators are similar to the NOT, AND and OR gates in electronics.
        // And also follow the truth tables as well.
        // With these operators we can club as many conditions as required.
        // Below examples show some such used cases.

        // Examples for such operators are: !(logical not), &&(logical AND) and ||(logical OR)

        // 1. Logical NOT Operator(!): If placed before truthy condition, it is converted to falsy. And if placed before a falsy condition, it becoming truthy.
        // 2. Logical AND Operator(&&): Checks whether both the conditions among the either sides of the operator are true. If yes, it results/returns true. Else results/returns false.
        // 3. Logical OR Operator(||): Checks if either among the conditions is true. If yes, it results/returns true. Else, results/returns false.

        // Similar to comparison operators we use the if statement to make understand about these operators better.
        
        System.out.println("3. Logical Operators:");
        boolean flag = false;
        if (!flag) { // results true since flag is false
            System.out.println("Result of logical NOT operation: " + flag + " converted to " + (!flag) + ".");
        }

        // Let's reuse the same variables that were declared earlier to showcase the use of logical AND and OR operators.
        // a = 5, b = 45, c = 34 and d = 43
        if ((a < c) && (a <= d)) { // Clubbing 2 condtions at a time.
            System.out.printf("%d is less than %d and %d. And thats: %b", a, c, d, (a < c && a <= d));
        }
        if (!(b < c && b >= d)) { // Results true because first condition returns false so the result of entire condition becomes false.
        // But, as there logical not(!) before the entire condition, it is converted to true.
            System.out.printf("\n%d is not less than %d but, greater than %d. And thats: %b", b, c, d, (b < c && b >= d));
        }
        // Let's not leave alone, and apply OR to it as well.
        if ((a < c) || (a >= d)) { // Results true because first among both the conditions is true. So, the entire condition results to true.
            System.out.printf("\n%d is less than %d but, not greater than %d. And thats: %b, as logical OR is applied.", a, c, d, (a < c || a >= d));
        }
        if ((b < c) || (b >= d)) { // Results true because second among both the conditions is true. So, the entire condition results to true.
            System.out.printf("\n%d is not less than %d but, greater than %d. And thats: %b, as logical OR is applied.", b, c, d, (b < c || b >= d));
        }

        System.out.println("\n");
        // Note: And, the same can be applied for floats and doubles as well.

        // 4. Assignment Operators:

        // These operators perform both the arithematic and assignment operations at a time.
        // The result is stored in the left hand side operand itself.
        
        // Examples of arithematic operators are as follows:
        // a. += -> Addition plus assignment
        // b. -= -> Subtraction plus assignment
        // c. *= -> Multiplication plus assignment
        // d. /= -> Division plus assignment
        // e. %= -> Modulo/Reminder Division plus assignment

        System.out.println("4. Assignment Operators:");
        int num1 = 5, num2 = 45;
        int num3 = 34, num4 = 43;
        int num5, num6; // Initialized by zeroes for both
        num5 = 7;
        num6 = 37;
        int num7 = 87, num8 = 2;
        int num9 = 86, num10 = 3;

        System.out.printf("Addition assignment of %d and %d is: %d", num1, num2, (num1 += num2)); // 50
        System.out.printf("\nSubtraction assignment of %d from %d is: %d", num4, num3, (num4 -= num3)); // 9
        System.out.printf("\nMultiplication assignment of %d by %d is: %d", num5, num6, (num6 *= num5)); // 259
        System.out.printf("\nDivision assignment of %d by %d is: %d", num7, num8, (num7 /= num8)); // 43
        System.out.printf("\nModulo Division assignment of %d by %d is: %d", num9, num10, (num9 %= num10)); // 2
        // Note: The same kind of operations follow for floats and doubles as well.

        System.out.println("\n");
        // Note: And, the same can be applied for floats and doubles as well.

        // 5. Increment and Decrement Operators:

        // These operators increase or decrease the operand's value by 1.
        // These operators can act on single operand.
        // They can be prefixed or suffixed to the operands.
        // If prefixed, the result implies in pre-increment or pre-decrement.
        // If postfixed/suffixed, the result implies in post-increment or post-decrement.

        // Examples for such kind of operators are ++ and --.
        
        System.out.println("5. Increment and Decrement Operators:");
        int i = 12, j = 11, k = 13, l = 10;
        // pre-increment: increased by 1 and assigned to i itself
        System.out.printf("Previously i used to be %d. Now, i is: %d", i, ++i);
        // pre-decrement: decreased by 1 and assigned to j itself
        System.out.printf("\nPreviously j used to be %d. Now, j is: %d", j, --j);
        // post-increment: increased by 1 and assigned to k itself
        System.out.printf("\nPreviously k used to be %d. But, post-increment still shows k as %d", k, k++);
        // This alone not be printed in the output. If it is done so we can't any change.
        System.out.printf("\nNow, k is: %d. Because k++ in previous step has increased k by 1.", k);
        // post-decrement: decreased by 1 and assigned to l itself
        System.out.printf("\nPreviously l used to be %d. But, post-decrement still shows l as %d", l, l--);
        // This alone not be printed in the output. If it is done so we can't any change.
        System.out.printf("\nNow, l is: %d. Because l-- in previous step has decreased l by 1", l);

        // These operators can be in the parts of arithematic calculations as well.
        // So, let's change the values of i, j, k and l
        i = 34; j = 87; k = 23; l = 16;
        System.out.printf("\nSum of %d and %d: is %d. As j is now %d because of pre-increment.", i, j, (i++ + ++j), j); // Here, i is still 34 but, j = 88. So, result = 34 + 88 = 122
        System.out.printf("\nBut, i is now %d because of post-increment.", i); // Now, i = 35
        System.out.printf("\nDifference between %d and %d: is %d. As k is now %d because of pre-decrement.", k, l, (--k - l--), k); // Here, l is still 16 but, k = 22. So, result = 22 - 16 = 6
        System.out.printf("\nBut, l is now %d because of post-decrement.", l); // Now, l = 15

        System.out.println("\n");
        // Note: And, the same can be applied for floats and doubles as well.

        // 6. Conditional(or Ternary) Operator:

        // This operator can be expressed as follows:
        // (condition) ? value1 : value2
        // This checks if the is true or false. If true then value1 is the resultant. Else, value2 is the resultant.
        // Multiple conditions can also be clubed together as shown below:
        // (condition1) ? value1 : (condition2) ? value2 : (condition3) ? value3 ... (conditionN) ? valueN
        // This operator acts similar to if...else block(for one condition) or if...else if-ladder...else block(for multiple conditions).
        // Think of else block as a block of code that gets executed if the if-block results false.
        // And for if...else if-ladder...else will be discussed later in conditional statements.

        // Below is an example of its application.

        System.out.println("6. Conditional Operator:");
        int n = -34;
        String res = (n > 0) ? "Positive" : (n == 0) ? "Zero" : "Negative";
        System.out.println("Result of the conditional operator applied for n is: " + res);
        // Alter the value of n with -34 or 0. If -34, the res would be Negative, else if 0 res would Zero.

        // Similarly we check for even and odd nature of numbers
        String nature = ((n > 0) && (n % 2 == 0)) ? "Even" : ((n > 0) && (n % 2 != 0)) ? "Odd" : "Enter a positive integer value for n other than negatives or zero.";
        if (nature == "Even") {
            System.out.println("Result of the conditional operator applied for n is: " + nature);
        } else if (nature == "Odd") {
            System.out.println("Result of the conditional operator applied for n is: " + nature);
        } else {
            System.out.println(nature);
        }
        // Alter the value of n with positive or negative, even or odd positive integers and see the value of the resultant.
        // Note: 1. Apply this operator for single conditional blocks or Minimal number of cinditional blocks.
        // 2. It can hold for as many as conditional blocks but for reading it takes high amount of time and debugging is quite difficult if the doesn't work as desired.
        // 3. And, the same can be applied for floats and doubles as well.
    }
}