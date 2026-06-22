// Note: Do not forget to change the name of the class to the name of the file while creating a Java project.
public class Main
{
    public static void main(String[] args) {

        // Variables in Java are similar to variables in other statically 
        // typed languages like C, C++ and etc.

        // A variable acts as label to represent data that needs to stored. 
        // It can be referred to as a container to store data.

        // All numbers, strings, arrays, and other primitives and 
        // non-primitives can be stored into the variables to use them 
        // somewhere in the programs wherever required.

        // A variable needs to declare with a data type before initializing 
        // or defining it. The below example shows how a variable in Java can 
        // be declared.

        int x = 3; // An number(whole number) variable named x initialized 
        // with int and assigned with positive integer 3.
        System.out.printf("Integer variable x storing: %d", x);

        float s = 43.67f; // A decimal number initialized with float and 
        // assigned with 43.67f. For floats and doubles we assign the numbers 
        // suffixed with f and d respectively. And suffixing with d for doubles 
        // is optional. But, for floats if they are not suffixed with f, then 
        // while doing arithematic operations may produce undesirable outputs.
        System.out.printf("\nFloat variable s storing: %.2f", s);

        double r = 345.78901d; // A decimal number initialized with double and 
        // assigned with 345.78901d. Suffixing with d for doubles is 
        // optional as discussed for floats in the above case.
        System.out.printf("\nDouble variable r storing: %.5f%n", r);

        // One more significant difference while using println() and 
        // printf()/print() methods is that println also produces/prefixes 
        // an new line before printing the ouput. So, no need to 
        // prefixing/suffixing \n to the output.

        // And also we have to concatinate the different types of data of 
        // the outputs if we need to, and rounding is required if at all we 
        // need to print the decimal numbers.

        // The Math class's Math.round() is useful for quick rounding. We can 
        // also make use of BigDecimal and DecimalFormat classes but, that goes 
        // beyond the basics that we are dicussing here.

        // So as of now we consider that rounding with Math.round() is quite 
        // desirable. And while rounding if we need to round of to 2 decimal 
        // places we have to multiply and divide the result/number by 100.00.

        // To round the same number to multiple number of places, we need to 
        // do the same process discussed above with 10 raised to power of 
        // required decimal places as shown below.
        System.out.println("Double variable r with Math.round(): " + Math.round(r * 100000.00)/100000.00);

        String name = "John Doe"; // String variable
        System.out.println("String variable name storing: " + name);

        // Similar to strings there characters but they are represented with 
        // single quotes('') unlike strings which are represented by double 
        // quotes("").
        char grade = 'A';
        System.out.println("Character variable grade storing: " + grade); // Charater variable

        // Booleans are like 0s and 1s in Logic gates. In Java, true represents 
        // 1 and false represents 0.

        // Booleans are mainly using in logical operations and evaluating 
        // conditional logic.

        // The result of operations and evaluations can decide the control 
        // flow of the program. Almost all programming follow this convention.

        // Below is one such simple example for it. 
        boolean flag = false;
        System.out.println("Boolean variable flag storing: " + flag);

        /*Here are the standard Java variable naming conventions, written 
        clearly and concisely:

        1. Variable names must always start with a letter, $, or _, and 
        never with a digit.

        2. Use camelCase (first word lowercase, subsequent words capitalized).

        3. Names should be meaningful, short, and descriptive.

        4. Variable names are case‑sensitive (age and Age are different).

        5. Avoid using reserved keywords like class, static, int, etc.

        6. Do not use special characters except $ and _ (though using $ and 
        _ is discouraged except for specific cases).

        7. Constants (declared with final) should use UPPER_CASE_WITH_
        UNDERSCORES.

        8. Prefer nouns for variable names (e.g., count, studentName).

        9. Avoid single-letter names except for temporary variables like 
        loop counters (i, j, k).

        10. Keep the variable scope in mind: shorter scopes can use shorter 
        names; wider scopes need clearer names.*/

        // Data Types in Java:

        // In the above discussions we have some of the data types. But, in 
        // Java there are many such data types and they are classified into two 
        // types. They are:
        // 1. Primitive Data Types and
        // 2. Non-Primitive Data Types

        // 1. Primitive Data Types:
        
        // These are not created by any user/programmer and are directly used 
        // by the programmers to make arithematic and logical operations.

        // Such kind of primitive types are:
        // int, float, double, char and boolean.

        // Along with these, there are other primitives type which are designed 
        // to store integers within short ranges and long ranges.

        // Such data types are: byte, short and long

        // byte: store very short range integers. Generlly suffixed by b. 
        // Occupies 1byte of space for each byte varaible. Ranges from -128 
        // to 127. 8‑bit signed integer.
        byte v = 125;
        System.out.println("Byte variable v storing: " + v);

        // short: store short range integers. Generlly suffixed by s. 
        // Occupies 2bytes of space for each short varaible. Ranges from 
        // -32,768 to 32,767. 16‑bit signed integer.
        short g = 23456;
        System.out.println("Short variable g storing: " + g);

        // int: store Integers. Generally not suffixed by anything. Occupies 
        // 4bytes of space for each integer variable. Ranges 
        // from -2,147,483,648 to 2,147,483,647. Example for integer is 
        // given in line 20. 32‑bit signed integer.

        // long: store Long integers. Generally suffixed by l. Occupies 
        // 8bytes of space for each long integer variable. Ranges 
        // from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        // 64‑bit signed integer.
        long phoneNumber = 5556664444l;
        System.out.println("Long variable phoneNumber storing: " + phoneNumber);

        // float: store floating points(decimals). Generally suffixed with f. 
        // Occupies 8bytes of space for each long integer variable. Ranges 
        // from 1.4e-45 to 3.4e+38. Example for integer is given in line 24.
        // 32‑bit IEEE‑754 floating point.

        // double: store floating points(decimals). Generally suffixed with 
        // d. Occupies 8bytes of space for each long integer variable. Ranges 
        // from 4.9e−324 to 1.7e308. Example for integer is given in line 31.
        // 64‑bit IEEE‑754 floating point.

        // char: store 16‑bit unsigned characters in single quotes(''). 
        // Ranges from 0 to 65,535 (represents Unicode code points in UTF‑16).

        // boolean: Not numeric and has only true(1)/false(0).

        // 2. Non-Primitive Data Types:

        // These are defined in classes which are specially used for storing 
        // comparitvely large amounts of data than the primitive data types 
        // into single container.

        // Some of the examples are: List, ArrayList, LinkedList, Set and Map.
        // LinkedList, Set and Map are further classified among themselves 
        // with some other kind of special privilages.
        // a. LinkedList, HashList
        // b. Set, HashSet, LinkedHashSet
        // c. Map, HashMap, LinkedHashMap
        // These must be imported from the class that belong to.
        // Further deep dive into these will be discussed later.

        // They can be sometimes defined by the users/programmers for 
        // practice purposes or for some other kind of special operations.
        // Examples for such kind of user-defined data types are:
        // 1. Linked-list(Singly linked-list, Doubly linked-list, Circular 
        // linked-list),
        // 2. Stack, 
        // 3. Queue(Enqueue and Dequeue), 
        // 4. Tree(Binary, Binary Search Tree and etc), and
        // 5. Graph
    }
}