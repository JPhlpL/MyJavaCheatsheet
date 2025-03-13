// Hello World
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Variables
int num = 42;
double pi = 3.14159;
String name = "John";
boolean isTrue = true;

// Basic Data Types
byte, short, int, long;  // Integers of increasing sizes
float, double;           // Floating-point numbers
char;                    // Single characters
boolean;                 // true or false

// Conditional Statements
if (condition) {
    // Code block executed if condition is true
} else if (anotherCondition) {
    // Code block executed if anotherCondition is true
} else {
    // Code block executed if all conditions are false
}

// Loops
for (int i = 0; i < 5; i++) {
    // Code executed in each iteration
}

while (condition) {
    // Code executed as long as the condition is true
}

do {
    // Code executed at least once, then checks condition
} while (condition);

// Switch Statement
switch (variable) {
    case value1:
        // Code executed if variable equals value1
        break;
    case value2:
        // Code executed if variable equals value2
        break;
    default:
        // Code executed if variable doesn't match any case
}

// Arrays
dataType[] arrayName = new dataType[length];
int[] numbers = {1, 2, 3, 4, 5};

Java Array Built-in Functions Cheatsheet

1. Array Declaration and Initialization:
   - Declaration: type[] arrayName;
   - Initialization: type[] arrayName = new type[size];
   - Example: int[] numbers = new int[5];

2. Array Length:
   - int arrayLength = arrayName.length;

3. Accessing Elements:
   - Access element: arrayName[index];
   - Example: int element = numbers[2];

4. Modifying Elements:
   - Modify element: arrayName[index] = newValue;
   - Example: numbers[2] = 42;

5. Iterating through Arrays:
   - Using for loop:
     for (int i = 0; i < arrayName.length; i++) {
         // Use arrayName[i]
     }
   - Using enhanced for loop (for-each loop):
     for (type element : arrayName) {
         // Use 'element'
     }

6. Array Copy:
   - Using Arrays.copyOf:
     type[] newArray = Arrays.copyOf(originalArray, length);
   - Using System.arraycopy:
     System.arraycopy(srcArray, srcPos, destArray, destPos, length);

7. Array Sorting:
   - Using Arrays.sort:
     Arrays.sort(arrayName);
   - Custom Sorting (using Comparator):
     Arrays.sort(arrayName, comparator);

8. Array to String:
   - Using Arrays.toString:
     String arrayString = Arrays.toString(arrayName);

9. Array to List:
   - Using Arrays.asList:
     List<type> list = Arrays.asList(arrayName);

10. Searching in Arrays:
    - Using Arrays.binarySearch (for sorted arrays):
      int index = Arrays.binarySearch(sortedArray, key);

11. Checking Equality:
    - Using Arrays.equals:
      boolean isEqual = Arrays.equals(array1, array2);

12. Filling Arrays:
    - Using Arrays.fill:
      Arrays.fill(arrayName, value);

13. Parallel Array Operations (Java 8 and above):
    - Using parallelSetAll:
      Arrays.parallelSetAll(arrayName, index -> expression);
    - Using parallelSort:
      Arrays.parallelSort(arrayName);

// Functions/Methods
public returnType methodName(parameters) {
    // Method body
    return returnValue;
}


// Class and Object
class MyClass {
    dataType property1;
    dataType property2;
    
    MyClass(dataType arg1, dataType arg2) {
        property1 = arg1;
        property2 = arg2;
    }
    
    void method() {
        // Method body
    }
}

// Inheritance
class ChildClass extends ParentClass {
    // ChildClass inherits properties and methods from ParentClass
}

// Interfaces
interface MyInterface {
    void method1();
    void method2();
}

// Exception Handling
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally {
    // Code that always executes, regardless of exceptions
}

// File I/O
import java.io.*;
File file = new File("filename.txt");
FileReader reader = new FileReader(file);
BufferedReader bufferedReader = new BufferedReader(reader);
String line = bufferedReader.readLine();


//regex

Basic metacharacters:

. : Matches any single character except newline.
^ : Matches the beginning of a line.
$ : Matches the end of a line.
[] : Matches any character within the brackets.
[^]: Matches any character not in the brackets.
| : Acts like a logical OR for two expressions.
() : Groups characters together.
\\ : Escapes special characters.
Quantifiers:

* : Matches zero or more occurrences of the previous character.
+ : Matches one or more occurrences of the previous character.
? : Matches zero or one occurrence of the previous character.
{n}: Matches exactly n occurrences of the previous character.
{n,}: Matches n or more occurrences of the previous character.
{n,m}: Matches between n and m occurrences of the previous character.
Predefined character classes:

\d : Matches any digit (0-9).
\D : Matches any non-digit.
\w : Matches any word character (alphanumeric plus underscore).
\W : Matches any non-word character.
\s : Matches any whitespace character.
\S : Matches any non-whitespace character.
Flags for Pattern compilation:

Pattern.CASE_INSENSITIVE: Case-insensitive matching.
Pattern.MULTILINE: Allows ^ and $ to match the beginning and end of each line.
Matcher methods:

matches(): Checks if the entire input matches the pattern.
find(): Attempts to find the next occurrence of the pattern.
group(): Returns the matched substring.
start(): Returns the starting index of the matched substring.
end(): Returns the ending index of the matched substring.
replaceAll(String replacement): Replaces all occurrences of the pattern.
replaceFirst(String replacement): Replaces the first occurrence of the pattern.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String regex = "\\b\\d{3}\\b"; // Matches three-digit words
        String input = "123 45 6789 012";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }
        //Answer
        // Found match: 123
        // Found match: 012
    }
}

//Data Structure

//Arrays
// Declaration and initialization of an integer array
int[] intArray = new int[5];
intArray[0] = 10;
intArray[1] = 20;
intArray[2] = 30;
intArray[3] = 40;
intArray[4] = 50;


//Linked Lists
class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

//Stacks
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
stack.push(10); // Pushing elements onto the stack
stack.push(20);
stack.push(30);

int topElement = stack.peek(); // Retrieving the top element (30)
int poppedElement = stack.pop(); // Popping the top element (30)

//Queues
import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> queue = new LinkedList<>();
queue.add(10); // Enqueuing elements to the queue
queue.add(20);
queue.add(30);

int frontElement = queue.peek(); // Retrieving the front element (10)
int dequeuedElement = queue.poll(); // Dequeuing the front element (10)

//Trees
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Creating a simple binary tree
TreeNode root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);


//Graphs
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph {
    Map<Integer, List<Integer>> adjacencyList;
    
    public Graph() {
        adjacencyList = new HashMap<>();
    }
    
    public void addEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }
}


//Hash Tables
import java.util.HashMap;

HashMap<String, Integer> hashMap = new HashMap<>();
hashMap.put("apple", 10); // Inserting a key-value pair
hashMap.put("banana", 20);
hashMap.put("orange", 15);

int value = hashMap.get("apple"); // Retrieving value for key "apple" (10)


//Heaps
import java.util.PriorityQueue;

PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap

minHeap.add(5);
minHeap.add(10);
minHeap.add(3);

int minElement = minHeap.peek(); // Retrieving the minimum element (3)
int removedMinElement = minHeap.poll(); // Removing the minimum element (3)


//Algorithms

//Sorting

//Bubble Sort

Use: Simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
Process: It repeatedly moves the largest (or smallest) element to the end (or beginning) of the list until the entire list is sorted.
Time Complexity: O(n^2)

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


//Selection Sort
Use: Simple sorting algorithm that repeatedly finds the minimum (or maximum) element from the unsorted part and moves it to the beginning (or end) of the list.
Process: It divides the list into a sorted and an unsorted region, repeatedly selecting the smallest element from the unsorted region and swapping it with the first element of the unsorted region.
Time Complexity: O(n^2)

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

//Insertion Sort
Use: Simple sorting algorithm that builds a final sorted array one element at a time.
Process: It considers one element at a time and inserts it into the correct position in the sorted section of the array.
Time Complexity: O(n^2)

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}

//Merge Sort
Use: Efficient, divide-and-conquer sorting algorithm that divides the unsorted list into n sub-lists, each containing one element, and then repeatedly merges sub-lists to produce new sorted sub-lists until there is only one sorted list.
Process: It divides the list into two halves, recursively sorts them, and then merges the two sorted halves.
Time Complexity: O(n log n)
public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[low + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}

//Quick Sorts
Use: Efficient, divide-and-conquer sorting algorithm that selects a pivot element and partitions the array around the pivot.
Process: It selects a pivot element, arranges the elements such that all elements less than the pivot are to its left, and all elements greater than the pivot are to its right. It then recursively applies the same process to the left and right partitions.
Time Complexity: Average Case - O(n log n), Worst Case - O(n^2) (can be improved with optimizations).

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}


//Search

//Linear Search
Use: Simple search algorithm that sequentially checks each element in the list until a match is found or the whole list has been searched.
Process: It iterates through the list and compares each element with the target value.
Time Complexity: O(n)

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }
}


//Binary Search
Process (Continued): It compares the target value with the middle element of the sorted array. If the target is equal to the middle element, the search is successful. If the target is less than the middle element, the search continues on the left half of the array; otherwise, it continues on the right half. The process is repeated until the target is found or the search space is exhausted.
Time Complexity: O(log n) - The array should be sorted beforehand.

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid; // Target found at index 'mid'
            } else if (arr[mid] < target) {
                low = mid + 1; // Target might be in the right half
            } else {
                high = mid - 1; // Target might be in the left half
            }
        }

        return -1; // Target not found
    }
}


Use: An improved search algorithm used for uniformly distributed sorted arrays.
Process: It makes a guess of the probable position of the target element based on its value compared to the first and last elements of the array. Then it narrows down the search space accordingly by linear interpolation. This approach can be more efficient than binary search for uniformly distributed data.
Time Complexity: O(log log n) for uniformly distributed data, but can be O(n) in the worst case.

public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if (arr[low] == target) {
                    return low; // Target found at index 'low'
                }
                return -1; // Target not found
            }

            // Perform interpolation to guess the probable position
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos; // Target found at index 'pos'
            } else if (arr[pos] < target) {
                low = pos + 1; // Target might be in the right half
            } else {
                high = pos - 1; // Target might be in the left half
            }
        }

        return -1; // Target not found
    }
}

//Fibonacci

public class Fibonacci {

    public static int fibo(int fib){
        int[] seq = {};
        if(fib == 0)
        {
            return 0;
        }
        
        if(fib == 1)
        {
            return 1;
        }
        
        fib = fibo(fib - 1) + fibo(fib-2);
        
        return fib;
        
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int num = 10;
        System.out.println(fibo(num));
    }
}

//Factorial

public class Factorial {

    // 5! = 5 * 4 * 3 * 2 * 1
    public static long factor(long num){
        
       if(num == 0)
       {
           return 1;
       }
       num = num * factor(num-1);
       return num;
    }
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int number = 10;
        
        long result = factor(number);
        System.out.println(result);
    }
}


//Palindrome
public class Palindrome {
    
    public static String palin(String word){
    
        int i = 0;
        String rev = "";
        for(i=word.length()-1;i>=0;i--){
            rev += word.charAt(i);
        }
        
        if(word.equals(rev))
        {
          return "true";
        }
        else{
         return "false";
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String word = "level";
        System.out.println("Palindrome :" + palin(word));
    }
}

//Reverse Word
import java.util.Scanner;
public class Reverseword {

    public static String reverseword(String word){
        int i = 0;
        String rev_word = "";
 
        for(i=word.length()-1;i>=0;i--){
            rev_word += word.charAt(i);
        }
        return rev_word.toString();
    }
            
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("The printed word is: " + word);
        
        String rev_word = reverseword(word);
        System.out.println("The inverted word is: " + rev_word);
 
    }
}

//Even or odd
public class Evenorodd {
    
    private static String evenorodd(long number){
        String identifier = "";
        if(number % 2 == 0){
            identifier = "Even";
        }
        else{
            identifier = "Odd";
        }
        return identifier;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number! ");
        long num = scanner.nextInt();
        System.out.println("The number is: " + evenorodd(num));
        
    }
    
    
}

//Prime Number Checker

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = isPrimeNumber(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// Leap Year Checker

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}


//Area of Circle
import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();

        double area = calculateCircleArea(radius);
        System.out.println("The area of the circle is: " + area);
    }

    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159;
        return PI * radius * radius;
    }
}


//StringBuffer and Builder

Method	Description
Common Methods	
length()	Returns the length (number of characters) of the sequence.
capacity()	Returns the current capacity (allocated size) of the buffer.
charAt(int index)	Returns the character at the specified index.
setCharAt(int index, char ch)	Sets the character at the specified index.
append(...)	Appends various types of data to the sequence.
insert(int offset, ...)	Inserts various types of data at the specified offset.
delete(int start, int end)	Removes characters from start to end-1.
deleteCharAt(int index)	Removes the character at the specified index.
replace(int start, int end, ...)	Replaces the substring from start to end-1 with the specified data.
substring(int start)	Returns a new sequence starting from the start index.
substring(int start, int end)	Returns a new sequence from start to end-1 index.
reverse()	Reverses the characters in the sequence.
indexOf(String str)	Returns the index of the first occurrence of str.
lastIndexOf(String str)	Returns the index of the last occurrence of str.
setLength(int newLength)	Sets the length of the sequence.
StringBuilder Exclusive	
ensureCapacity(int minimum)	Ensures the capacity is at least equal to the minimum.
StringBuffer Exclusive	
appendCodePoint(int codePoint)	Appends the Unicode code point as a character.
capacity()	Returns the current capacity of the buffer.
