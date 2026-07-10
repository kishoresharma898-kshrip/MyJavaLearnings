// Note: Do not forget to change the name of the class to the name of the file while creating a Java project.
import java.util.Arrays; // import statement for importing Arrays class/Arrays API from java.util(Java's Utility) package.
import java.util.List; // import statement for importing List class/List API from java.util(Java's Utility) package.

public class Main
{
    public static void main(String[] args) {

        // Arrays:

        // Arrays are something called as the collection objects of same data type.
        // i.e., If an array is said to store integers, then it always stores the integers and accepts only the integers to store.
        // It will not accept the objects of other data types. 
        // So, unlike some progrmming languages like Python and Javascript, the arrays in Java are static which are more similar to arrays in C, C++ and etc.
        // Objects inside an array are sometimes referred to as elements.
        // Unlike Python and Javascript the length of an array in Java is predefined. And cannot be changed once after decalaration.
        // Like all the programming languages, arrays are indexed and the index count starts with 0.
        
        // Arrays are initialised and declared as follows:

        int[] integers = new int[6]; // an integer array of length 6. With no elements.
        int integers1[] = new int[6]; // also an integer array of length 6. With no elements.

        int[] integers2 = {6, 5, 4, 3, 2, 1}; // Also an array of integers of length 6. With elements containing in curly braces.
        // The above decalaration does not require to specify the length.
        
        // Accessing elements in an array: 

        // Array elements can be accessed using the name of the array followed by a pair of square braces and mentioning the required element's index between them.
        // To access the first, last and third element of the array integers2, we need to do as follows.
        System.out.println("Elements of integers2 array:");
        System.out.println("First element of integers2: " + integers2[0]); // First element: 6
        System.out.println("Last element of integers2: " + integers2[5]); // Last element: 1
        System.out.println("Third element of integers2: " + integers2[2]); // Third element: 4

        // Elements of an array can be assigned to other variables in the program.
        int fifthOfInt2 = integers2[4]; // Fifth element of integers2 array.
        int secondOfInt2 = integers2[1]; // Second element of integers2 array.
        int fourthOfInt2;
        fourthOfInt2 = integers2[3]; // Fourth element of integers2 array.
        System.out.println("Second element of integers2: " + secondOfInt2); // Second element: 5
        System.out.println("Fourth element of integers2: " + fourthOfInt2); // Fourth element: 3
        System.out.println("Fifth element of integers2: " + fifthOfInt2); // Fifth element: 2

        System.out.println();

        // Assigning/Pushing elements into an array:

        // Elements can be pushed and stored into an array as the same way it is done for accessing the elements of array using pair of square braces.
        // Pushing and storing elements into an array can be done as follows:

        integers1[0] = 11;
        integers1[1] = 22;
        integers1[2] = 33;
        integers1[3] = 44;
        integers1[4] = 55;
        integers1[5] = 66;
        // Note: Order can be ignored while assigning elements into an array.
        System.out.println("Elements of integers1 array:");
        System.out.println("First element of integers1: " + integers1[0]); // First element: 11
        System.out.println("Second element of integers1: " + integers1[1]); // Second element: 22
        System.out.println("Third element of integers1: " + integers1[2]); // Third element: 33
        System.out.println("Fourth element of integers1: " + integers1[3]); // Fourth element: 44
        System.out.println("Fifth element of integers1: " + integers1[4]); // Fifth element: 55
        System.out.println("Sixth element of integers1: " + integers1[1]); // Sixth element: 66

        System.out.println();
        
        // Updating elements of an array:

        // Elements of an array can be updated as the same way it is done for accessing the elements of array using pair of square braces.
        // Updating elements of an array can be done as follows:

        integers[5] = 4;
        integers[3] = 56;
        integers[1] = 678;
        integers[2] = 786;
        integers[4] = 4;
        // Note: 1. Arrays can contain duplicate elements. 
        // 2. If any element of array is missed out or unassigned, that particular element is assigned with the default value of the primitive data type.
        // Since, here the first element is unassigned, the value will be 0.
        System.out.println("Elements of integers array:");
        System.out.println("First element of integers: " + integers[0]); // First element: 0
        System.out.println("Second element of integers: " + integers[1]); // Second element: 678
        System.out.println("Third element of integers: " + integers[2]); // Third element: 786
        System.out.println("Fourth element of integers: " + integers[3]); // Fourth element: 56
        System.out.println("Fifth element of integers: " + integers[4]); // Fifth element: 4
        System.out.println("Sixth element of integers: " + integers[5]); // Last element: 4

        System.out.println();

        integers[0] = 39;
        integers[4] = 74;
        System.out.println("Elements of integers array after updating:");
        System.out.println("First element of integers: " + integers[0]); // First element: Then 0, now 39
        System.out.println("Second element of integers: " + integers[1]); // Second element: 678
        System.out.println("Third element of integers: " + integers[2]); // Third element: 786
        System.out.println("Fourth element of integers: " + integers[3]); // Fourth element: 56
        System.out.println("Fifth element of integers: " + integers[4]); // Fifth element: Then 4, now 74
        System.out.println("Sixth element of integers: " + integers[5]); // Last element: 4

        System.out.println();
        
        // Length of an array:

        // To find out length or count of total no. of elements of an array, we can use a built-in property called "length".
        // It is stated as the name of the array followed by a dot(.) operator and followed by the word length.
        
        // To find out the length of the arrays integers, integers1 and integers2, we do it as follows:

        System.out.println("Length of array integers: " + integers.length); // 6
        System.out.println("Length of array integers1: " + integers1.length); // 6
        System.out.println("Length of array integers2: " + integers2.length); // 6

        System.out.println();

        // Traversing/Iterating over arrays:

        // Traversing/Iterating over arrays can be done by using loops.
        // A classic for-loop or a while-loop with the help of the length property can be used.
        // Iterating over an arrays can be done as follows:

        System.out.println("Traversing over the elements of integers array:");
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Element-" + (i+1) + " of integers: " + integers[i]);
        }

        System.out.println();

        System.out.println("Traversing over the elements of integers1 array:");
        for (int i = 0; i < integers1.length; i++) {
            System.out.println("Element-" + (i+1) + " of integers1: " + integers1[i]);
        }

        System.out.println();

        System.out.println("Traversing over the elements of integers2 array:");
        int j = 0;
        while (j < integers2.length) {
            System.out.printf("Element-%d of integers2: %d\n", (j+1), integers2[j]);
            j++;
        }

        System.out.println();

        // Multi-Dimensional Arrays:

        // These arrays are also called as nested arrays as one array is nested inside the other array.
        // To iterate over these arrays we ave to use the nested loops.
        // These arrays are useful for doing arithematic operations like addition and multiplication on matrices.
        // Thus, these arrays are also referred to as matrices.

        // Multi-Dimensional(2-D) Arrays are initialised and declared as follows:

        int[][] matrix = new int[3][3]; // An empty 3x3 matrix.
        int matrix1[][] = new int[3][3]; // Also an empty 3x3 matrix.

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; // Also an an empty 3x3 matrix. With elements containing in curly braces.
        // The above decalaration does not require to specify the length.
        
        
        // Assigning elements to a Multi-Dimensional array:

        // Assigning elements to a Multi-Dimensional array is as same as assigning elements to a normal(1-D) array.
        // Below example is the method to assign elements to a 2-D array matrix1(which is a 3x3 matrix).
        
        matrix1[0][0] = 9;
        matrix1[0][1] = 8;
        matrix1[0][2] = 7;
        matrix1[1][0] = 6;
        matrix1[1][1] = 5;
        matrix1[1][2] = 4;
        matrix1[2][0] = 3;
        matrix1[2][1] = 2;
        matrix1[2][2] = 1;
        /*Represented as follows:
        int[][] matrix1 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        }
        */

        // Updating elements in a Multi-Dimensional array:

        // Updating elements in a Multi-Dimensional array also follows the same method that is described for normal(1-D) arrays.

        // Matrix Addition:

        // Matrix Addition is only possible when both the matrices are of nxn dimension.
        // A matrix of mxn dimension cannot be added with a matrix of nxm dimension.
        // Matrix addition requires the usage of nested loops.
        
        // The matrix addition operation for the above two matrices is done as follows:

        // matrix[3][3] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        // 3x3 matrix addition:
        // matrix1's length = 3;
        // matrix2's length = 3;
        // Matrix addition can be done in the below ways as the dimensions of matrices are predefiend.
        
        /*for (int k = 0; k < matrix1.length; k++) {
            for (int l = 0; l < matrix2.length; l++) {
                matrix[k][l] = matrix1[k][l] + matrix[k][l];
            }
        }

        for (int k = 0; k < matrix1.length; k++) {
            for (int l = 0; l < matrix1[k].length; l++) {
                matrix[k][l] = matrix1[k][l] + matrix[k][l];
            }
        }

        for (int k = 0; k < matrix2.length; k++) {
            for (int l = 0; l < matrix2[k].length; l++) {
                matrix[k][l] = matrix1[k][l] + matrix[k][l];
            }
        }

        for (int k = 0; k < matrix1.length; k++) {
            for (int l = 0; l < matrix2[k].length; l++) {
                matrix[k][l] = matrix1[k][l] + matrix[k][l];
            }
        }

        for (int k = 0; k < matrix2.length; k++) {
            for (int l = 0; l < matrix1[k].length; l++) {
                matrix[k][l] = matrix1[k][l] + matrix[k][l];
            }
        }

        for (int k = 0; k < matrix2.length; k++) {
            for (int l = 0; l < matrix2.length; l++) {
                matrix[k][l] = matrix1[k][l] + matrix[k][l];
            }
        }*/

        // Optimal solution:
        // As the dimensions of the matrices are known/predefined. 
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                matrix[k][l] = matrix1[k][l] + matrix2[k][l];
            }
        }

        System.out.println("Elements of matrix after matrix addition:");
        for(int i = 0; i < matrix.length; i++) {
            for (int m = 0; m < matrix[i].length; m++) {
                System.out.printf("Element at row-%d and column-%d of matrix after matrix addition is: %d\n", (i+1), (m+1), matrix[i][m]);
            }
        }


        System.out.println();

        // Matrix Multiplication:

        // Matrix Multiplication is possible for the matrices which are of mxn and nxm dimensions.
        // A matrix of mxn dimension can be multiplied with a matrix of nxm dimension. 
        // The only thing is that the elements at those rows and columns which are not specified should be zeroes.
        // So, in case of multiplication of a 3x2 matrix with a 2x3 matrix, the elements at:
        // 1st row-3rd column, 2nd row-3rd column and 3rd row-3rd column of the 3x2 matrix should be zeroes.
        // And, the elements at: 
        // 3rd row-1st column, 3rd row-2nd column and 3rd row-3rd column of the 2x3 matrix should be zeroes.
        // Take for example, matrix1 is 3x2 and matrix2 is 2x3
        /* matrix1 = {
            {1, 2, 0},
            {3, 4, 0},
            {5, 6, 0}
        } and 
        matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {0, 0, 0}
        }*/
        // The vice-versa for the above examples is also possible.
        /* matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {0, 0, 0}
        } and 
        matrix2 = {
            {9, 8, 0},
            {7, 6, 0},
            {5, 4, 0}
        }*/

        // So, ultimately the matrix multiplication algorithm is done on the matrices considering that both are of 3x3 dimensions.
        // Like matrix addition, matrix multiplication also requires the usage of nested loops.

        // The matrix multiplication operation for the above two matrices is done as follows:

        int[][] matrix3 = new int[3][3]; // Empty 3x3 matrix for matrix multiplication
        int sum = 0; // This is sum is used for calculating the result of the each arithematic operations done for determining the elements of the resultant(result) matrix(matrix3 in this case).

        /*for (int k = 0; k < matrix3.length; k++) {
            for (int l = 0; l < matrix2.length; l++) {
                for (int m = 0; m < matrix1.length; m++) {
                    sum += matrix2[k][m] * matrix1[m][l];
                }
                matrix3[k][l] = sum;
                sum = 0;
            }
        }*/

        // Optimal Solution:
        // As the dimensions of the matrices are known/predefined.
        for (int k = 0; k < 3; k++) {
            // Iterates over the result matrix(matrix-3)
            for (int l = 0; l < 3; l++) {
                // Iterates over the first matrix(matrix-2 in this case)
                for (int m = 0; m < 3; m++) {
                    // Iterates over the second matrix(matrix-1 in this case)
                    sum += matrix2[k][m] * matrix1[m][l];
                    // k will not change until the l's iteration is completed.
                    // l will not change until the m's iteration is completed.
                }
                matrix3[k][l] = sum;
                sum = 0;
            }
        }

        System.out.println("Elements of matrix after matrix multiplication:");
        for(int i = 0; i < matrix3.length; i++) {
            for (int m = 0; m < matrix3[i].length; m++) {
                System.out.printf("Element at row-%d and column-%d of matrix3 after matrix addition is: %d\n", (i+1), (m+1), matrix3[i][m]);
            }
        }

        System.out.println();

        // Common Arrays API methods used on arrays:

        // Before going to use the methods we need to know about something called as an API in simple words.
        // An API is the short-hand form of Application Program Interface.
        // So, an Application Program Interface is an interface that contains useful methods that can be used in other classes to do some operations and get the desired result from the program.
        // Programmers and Developers make use of it to build applications.
        // We will know about the interfaces and APIs in the later discussions. For, now think about an API as described in the above sentences.

        // To use the methods of Arrays class or API we need to first import the API from the java.util(Java's Utility package).
        // The Arrays API is an API or class which lies in java.util package. And to import it into this file we need write an import statement using a keyword "import".
        // In general APIs, Classes and Modules which contains the useful methods, lie in some containers which referred as packages.
        // To extract them out we need to use the dot(.) operator which is described in the Operators file(JavaOperators.java).
        // So, to extract the Arrays API we can write the statement as follows:
        // import java.util.Arrays;
        // The above is to given at the starting of a Java program.
        // In general, the imports of required Classes, APIs and Modules is given on the top(starting point) of the program. And, it is the best practice followed.
        
        // To import another API, say for example the List API from the same java.util package, we can import it as follows:
        // import java.util.List;
        // To import all the APIs, classes and modules, we can use the wild-card * to import all of them lying in a package.
        // So, to import all APIs from Java's Utility pcakage, we can write the import statement as follows:
        // import java.util.*;
        // But, sometimes it is not a best practice to import all APIs as some may not be that useful while building and application.
        // So, it better to import only the required things(APIs and modules) one after the other.
        // In this case, the following imports are enough:
        // import java.util.Arrays;
        // import java.util.List;

        // 1. Arrays.toString(array): Returns a string representation of the array.

        System.out.println("Arrays.toString(array):");
        System.out.println("String representation of integers array: " + Arrays.toString(integers)); // [39, 678, 786, 56, 74, 4]

        System.out.println();

        // 2. Arrays.copyOf(array, newLength): Copies the array to a new length. Returns void or nothing, thus need not be used as input for other methods/variables.

        System.out.println("Arrays.copyOf(array, newLength):");
        int[] copyOfInts1 = Arrays.copyOf(integers1, 6); // Copies elements of array integers1 and stores in copyOfSortedInt2 of length 6(or integers.length can also be used).
        System.out.println("Copy of integers1 array: " + Arrays.toString(copyOfInts1)); // [11, 22, 33, 44, 55, 66]
        int[] copyOfInts1From0Till4 = Arrays.copyOf(integers1, 5); // Copies elements of array integers1 from 0 till 4 and stores in copyOfSortedInt1Till4 as length mentioned is 5.
        System.out.println("Copy of integers1 array from 0 till 4: " + Arrays.toString(copyOfInts1From0Till4)); // [11, 22, 33, 44, 55]. Only first 5 elements of integers1 array are stored.

        System.out.println();

        // 3. Arrays.equals(arr1, arr2): Checks if two arrays are equal (same length & elements). Returns boolean value.

        System.out.println("Arrays.equals(arr1, arr2):");
        System.out.println("Arrays.equals(integers1, copyOfInts1) results: " + Arrays.equals(integers1, copyOfInts1));
        System.out.println("Arrays.equals(copyOfInts1, copyOfInts1From0Till4) results: " + Arrays.equals(copyOfInts1, copyOfInts1From0Till4));

        System.out.println();

        // 4. Arrays.copyOfRange(array, from, to): Copies a range from the array. Returns void, thus need not be used as input for other methods/variables.

        System.out.println("Arrays.copyOfRange(array, from, to):");
        int[] copyOfIntsFrom1Till3 = Arrays.copyOfRange(integers, 1, 4); // [678, 786, 56]
        // Copies elements of array integers from 1 till 3 and stores in copyOfSortedIntsFrom1Till3.
        System.out.println("Copy of integers array from 1 till 3: " + Arrays.toString(copyOfIntsFrom1Till3));

        System.out.println();

        // 5. Arrays.sort(array): Sorts the array in ascending order. Returns void, thus need not be used as input for other methods/variables.
        
        System.out.println("Arrays.sort(array):");
        // We know that, integers2 = {6, 5, 4, 3, 2, 1}
        int[] copyOfSortedInt2 = Arrays.copyOf(integers2, 6); // Copies elements of array and stores in copyOfSortedInt2 of length 6.
        Arrays.sort(copyOfSortedInt2); // Sorts copyOfSortedInt2 array in ascending order.
        System.out.println("Sorted copy of integers2 array: " + Arrays.toString(copyOfSortedInt2)); // [1, 2, 3, 4, 5, 6]

        System.out.println();

        // 6. Arrays.sort(array, fromIndex, toIndex): Sorts a specific range. Returns void, thus need not be used as input for other methods/variables.
        
        System.out.println("Arrays.sort(array, fromIndex, toIndex):");
        float[] floats = {22.50f, 34.67f, 87.94f, 45.49f, 98.93f, 66.67f};
        Arrays.sort(floats, 2, 5);
        System.out.println("Sorted piece of floats from index 2 till 4: " + Arrays.toString(floats)); // [22.50, 34.67, 45.49, 87.94, 98.93, 66.67]

        // Best Practice:

        // Note: Storing the floats of previous examples as doubles. 

        double[] doubles = {22.50, 34.67, 87.94, 45.49, 98.93, 66.67};
        double[] copyOfDoubles = Arrays.copyOfRange(doubles, 2, 5); // [87.94, 45.49, 98.93]
        Arrays.sort(copyOfDoubles); // [45.49, 87.94, 98.93]
        System.out.println("Sorted piece of doubles from index 2 till 4: " + Arrays.toString(copyOfDoubles));

        System.out.println();

        // 7. Arrays.fill(array, value): Fills the array with a value. Returns void, thus need not be used as input for other methods/variables.

        System.out.println("Arrays.fill(array, value):");
        int[] integers3 = new int[3];
        Arrays.fill(integers3, 7); // integers3 = [7, 7, 7] -> Fills the whole array with the value 7.
        System.out.println("The array integers3 of length 3 is filled as: " + Arrays.toString(integers3));

        System.out.println();

        // 8. Arrays.binarySearch(array, key): Searches for a value in a sorted array. Returns -(insertion point)-1 if the element is not found and yet to be inserted.
        // The insertion point here means, the point where exactly the undefined element should be placed inside the array.
        // And one more we need to know is that the indices of an array can start with negative numbers as well, starting from -1 till the -(length of array).
        // But they cannot be used for accessing or updating the elements of an array.
        // For example if we take an array integers1, {11, 22, 33, 44, 55, 66}, the indices start from -1 till -6.

        System.out.println("Arrays.binarySearch(array, key):");
        // Let's do it on integers1 as it is well sorted array.
        // integers1 = {11, 22, 33, 44, 55, 66};
        int idx = Arrays.binarySearch(integers1, 55); // 4
        int unknownIndex = Arrays.binarySearch(integers1, 77); //-7
        // So, here as we mentioned the element as 77, it is >66, thus the insertion point will be 6 and the method returns -(6)-1 = -7.
        // If, we try to put 5, as it is <11, thus the insertion point will be 0 and the method returns -(0)-1 = -1.
        // Try altering the values with numbers that are undefined and so the results of value for the variable unknownIndex.
        System.out.println("Index of " + integers1[4] + " is: " + idx);
        System.out.println("Index of 77 is: " + unknownIndex);

        System.out.println();

        // 9. Arrays.stream(array): Converts array to a stream (Java 8+).

        System.out.println("Arrays.stream(array):");
        System.out.println("Elements of integers1 array using stream() and forEach() methods:");
        // Arrays.stream(integers1).forEach(System.out::println);
        Arrays.stream(integers1).forEach(i -> System.out.println(i)); // This will also results the same as above.
        // The forEach() is a method that is similar to classic for-loop applied in the arrays.
        // But, unlike the classic loop, this method takes, something called as callback function
        // The callback is lambda function/expression (an anonymous arbitrary function) that acts on the elements on the stream as described in the above.
        // There are some other functions/methods like map(), filter() and etc which also come under this category and use lambda experssion to evaluate each element of the stream.
        // We will deep dive into these concepts later. For now, just know till here.

        System.out.println();

        // 10 . Arrays.asList(T... a): Converts array to a fixed-size list.

        System.out.println("Arrays.asList(T... a):");
        // Let's do it on integers1. We know that, integers1 = {11, 22, 33, 44, 55, 66}.
        // Lets copy only the elements and paste them as the arguments for asList() method as shown below.
        List<Integer> integersList1;
        integersList1 = Arrays.asList(11, 22, 33, 44, 55, 66); // [11, 22, 33, 44, 55, 66] - It is a list not an array.
        integersList1.forEach(System.out::println);
        // To convert an array into a list requires initialising a list and assigning the elements as shown in the above statements.
        // To initialise a list, it is required to import the List API as described in previous discussions.
        // List API is dicsussed in the later topics. For now lets just know how to initialise it.
        
        /*Initializing a list can be done as follows:
        
        Method-1:
        List<Integer> list; // Initialization.
        list = new List(); // Decalaration. An empty list of dynamic size(length).

        Method-2:
        List<Integer> list = new List(7); // Initialisation and Declaration. Also, an empty list of size(length) 7.
        // Length is provided in the pair parentheses.

        Method-3:
        List<Integer> list = Arrays.asList(T... a) // A list of fixed size(length) based on the array.
        */

        System.out.println();

        // 11. Arrays.deepToString(array): Prints the string representation of multi-dimensional arrays.

        System.out.println("Arrays.deepToString(array):");
        System.out.println("String representation of matrix2: " + Arrays.deepToString(matrix2)); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        System.out.println("String representation of matrix1: " + Arrays.deepToString(matrix1)); // [[9, 8, 7], [6, 5, 4], [3, 2, 1]]
        System.out.println("String representation of matrix(after matrix addition): " + Arrays.deepToString(matrix)); // [[10, 10, 10], [10, 10, 10], [10, 10, 10]]
        System.out.println("String representation of matrix3(after matrix multiplication): " + Arrays.deepToString(matrix3)); // [[30, 24, 18], [84, 68, 54], [138, 114, 90]]

        System.out.println();

        // 12. Arrays.deepEquals(arr1, arr2): Compares multi-dimensional arrays.

        System.out.println("Arrays.deepEquals(arr1, arr2):");
        System.out.println("Arrays.deepEquals(matrix1, matrix1) results: " + Arrays.deepEquals(matrix1, matrix1)); // true
        System.out.println("Arrays.deepEquals(matrix1, matrix2) results: " + Arrays.deepEquals(matrix1, matrix2)); // false

        System.out.println();

        // 13. Arrays.parallelSort(array): Sorts array using parallelism (Java 8+).

        System.out.println("Arrays.parallelSort(array):");
        int[] copyOfParallelSortedInt2 = Arrays.copyOf(integers2, 6); // Copies elements of array and stores in copyOfSortedInt2 of length 6. [6, 5, 4, 3, 2, 1]
        Arrays.parallelSort(copyOfParallelSortedInt2); // Sorts copyOfSortedInt2 array in ascending order using parallelism. [1, 2, 3, 4, 5, 6]
        System.out.println("Sorted copy of integers2 array using parallelism: " + Arrays.toString(copyOfParallelSortedInt2));

        System.out.println();

        // 14. Arrays.setAll(array, generator): Sets elements using a lambda.
        System.out.println("Arrays.setAll(array, generator):");
        int[] doublesOfInts = new int[6];
        Arrays.setAll(doublesOfInts, i -> i * 2); // i -> i * 2 is a lambda expression that makes each element, to double the value of it.
        System.out.println("Doubles of the integers array is: " + Arrays.toString(doublesOfInts)); // [0, 2, 4, 6, 8, 10]
    }
}
