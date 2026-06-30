// Note: Do not forget to change the name of the class to the name of the file while creating a Java project.
public class Main
{
    public static void main(String[] args) {

        // Conditional Statements:

        // Conditional statements are the code blocks that execute when a particular condition results in true or false.
        // They alter the flow of programs from one step to another. 
        // Programmers/Developers will face certain circumstances where the flow needs to be altered or need to be stopped a some point.
        // Examples for conditional statements are:
        // 1. If itself
        // 2. If-Else
        // 3. If-Else If-Else(Also known as If-Else ladder)
        // 4. Switch Case

        // As we have already discussed about If-Else and If-Else ladder, lets review it again here as well.

        // 1. If itself(also known as If alone):
        // It is a block of code that gets executed whenever a particular condition resolves or results to true.
        // Else, the block under the statement is ignored and the very next statement after it gets executed.
        // The if block in Java, is declared as follows:

        // if(condition) {
            // some code block to be executed
        // }
        
        // Example:
        System.out.println("Example for if alone:");
        int age = 25;
        if (age >= 18) {
            System.out.println("Person can watch this movie. As the person's age is " + age + " and its above 18.");
        }

        System.out.println();

        // 2. If-Else:
        
        // In this another block will be added which will get executed when the condition in the if block results false.
        // This block adds some meaning to the if alone block.
        // This will act as default block if any condition specified in the if doesn't resolves or returns true.
        
        // The If-Else block is declared as follows:
        // if(condition) {
            // some code block to be executed
        // } else {
            // some code block to be executed, instead of if.
        // }

        // Let us take the previous example, do some slight changes and continue to the completion of it.
        
        // Example:
        System.out.println("Example for if-else:");
        age = 16;
        if (age >= 18) {
            System.out.println("Person can watch this movie. As the person's age is " + age + " and its above 18.");
        } else {
            System.out.println("Person cannot watch this movie. As the person's age is " + age + " and its not permitted.");
        }

        System.out.println();

        // 3. If-Else If-Else(also known as If-Else ladder):
        
        // An if-else ladder(or if-else if ladder) is a programming structure used to test multiple conditions sequentially.
        // The program checks each condition from top to bottom.
        // As soon as one condition evaluates to true, its associated code block executes, and the rest of the ladder is skipped.

        // Examples for if else-if ladder are as follows:
        
        // a. Grading based on marks:
        System.out.println("Examples for if-else ladder:");
        System.out.println("1. Grading based on marks:");
        int marks = 89;
        if (marks >= 90) {
            System.out.println("Grade: A. Marks: " + marks);
        } else if (marks >= 80) {
            System.out.println("Grade: B. Marks: " + marks); // This block gets executed
        } else if (marks >= 70) {
            System.out.println("Grade: C. Marks: " + marks);
        } else if (marks >= 60) {
            System.out.println("Grade: D. Marks: " + marks);
        } else if (marks >= 50) {
            System.out.println("Grade: E. Marks: " + marks);
        } else {
            System.out.println("Grade: F. Marks: " + marks);
        }

        System.out.println();

        // b. Day of the week:
        System.out.println("2. Day of the week:");
        int day = 5;
        if (day == 1) {
            System.out.println("Monday. As today's day number is: " + day);
        } else if (day == 2) {
            System.out.println("Tuesday. As today's day number is: " + day);
        } else if (day == 3) {
            System.out.println("Wednesday. As today's day number is: " + day);
        } else if (day == 4) {
            System.out.println("Thursday. As today's day number is: " + day);
        } else if (day == 5) {
            System.out.println("Friday. As today's day number is: " + day); // This block gets executed
        } else if (day == 6) {
            System.out.println("Saturday. As today's day number is: " + day + ". Weekend");
        } else if (day == 7) {
            System.out.println("Sunday. As today's day number is: " + day + ". Weekend");
        } else {
            System.out.println("Invalid day number. Please enter values between 1 and 7.");
        }

        System.out.println();

        // c. Traffic Light Signals:
        System.out.println("3. Traffic Light Signals:");
        String light_color = "Yellow";
        int time = 3; // In seconds

        if (light_color == "Red" && (time >= 0 && time <= 60)) {
            System.out.println("Stop!!! Because the traffic light is indicating " + light_color + " Light.");
        } else if (light_color == "Yellow" && (time >= 0 && time <= 5)) {
            System.out.println("Slow down!! and Be careful. Because the traffic light is indicating " + light_color + " Light.");
        } else if (light_color == "Green" && (time >= 0 && time <= 45)) {
            System.out.println("Go!!! . The traffic light is now indicating " + light_color + " Light.");
        } else {
            System.out.println("This traffic is under maintenance. Please follow the traffic police's signals.");
        }

        System.out.println();

        // 4. Switch case:

        // The switch case is similar to the if-else ladder but has different programming structure.
        // Unlike the if-else ladder structure the switch controls the flow based on a single evaluating expression or value. 
        // And takes this single value as the input for the condition resolution.
        // And this taking of single value into the condition is the major disadvantage for the switch case when compared with if-else ladder.
        // Once the evaluation is done, the flow enters into the cases written inside the switch block.
        // The program checks each case value from top to bottom. And executes the block where the evaluated value matches with the case value.
        // And the rest of the ladder is skipped.
        // Each case should contain a break statement to stop the execution of remains blocks which are after the match. Else, the remaining blocks also get executed which is undesirable.
        // Along with this there will be one more block that is default.
        // The default block executes by default if any of the cases are not matched. It is similar to the else block in if-else ladder structure.
        // The default statement in a switch-case is optional. It is not madatory for the code to compile or function;
        // it simply serves as fallback to catch any values that do not match the explicitly defined in the case statements. And it does not required a break statement to stop the execution in some cases.

        // The above examples can be restructured using the switch statement.

        // Lets alter the values of the variables declared for each previous example.
        System.out.println("Examples for switch-case:");
        System.out.println("1. Grading based on marks using switch-case:");
        marks = 48;
        switch(marks/10) {
            case 10: // Handles exactly 100
            case 9: System.out.println("Grade: A. Marks: " + marks); break; // Cases can be clubbed as shown in this example. Handles 90 - 99.
            case 8: System.out.println("Grade: B. Marks: " + marks); break; // This case gets executed. Handles 80 - 89.
            case 7: System.out.println("Grade: C. Marks: " + marks); break; // Handles 70 - 79
            case 6: System.out.println("Grade: D. Marks: " + marks); break; // Handles 60 - 69
            case 5: System.out.println("Grade: E. Marks: " + marks); break; // Handles 50 - 59
            default: System.out.println("Grade: F. Marks: " + marks);
        }

        System.out.println();

        System.out.println("2. Day of the week using switch-case:");
        day = 7; 
        switch(day) {
            case 1: System.out.println("Monday. As today's day number is: " + day); break;
            case 2: System.out.println("Tuesday. As today's day number is: " + day); break;
            case 3: System.out.println("Wednesday. As today's day number is: " + day); break;
            case 4: System.out.println("Thursday. As today's day number is: " + day); break;
            case 5: System.out.println("Friday. As today's day number is: " + day); break;
            case 6: System.out.println("Saturday. As today's day number is: " + day + ". Weekend"); break;
            case 7: System.out.println("Sunday. As today's day number is: " + day + ". Weekend"); break;
            default: System.out.println("Invalid day number. Please enter values between 1 and 7.");
        }

        System.out.println();

        System.out.println("3. Traffic Light Signals using switch-case:");
        // Note: The "time" variable used in previous example cannot be evaluated as the switch takes only one variable for evaluation.
        light_color = "Red";
        switch(light_color) {
            case "Red":
                System.out.println("Stop!!! Because the traffic light is indicating " + light_color + " Light.");
                break;
            case "Yellow":
                System.out.println("Slow down!! and Be careful. Because the traffic light is indicating " + light_color + " Light.");
                break;
            case "Green":
                System.out.println("Go!!! . The traffic light is now indicating " + light_color + " Light.");
                break;
            default:
                System.out.println("This traffic is under maintenance. Please follow the traffic police's signals.");
        }

        // Try altering the values of the variables declared which are discussed in the examples and observe the changes.
        // The above all conditional statements are almost similar to the switches connected between the branches in logic gates and other electrical and electronic circuits.
    }
}