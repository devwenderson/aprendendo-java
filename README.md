# Tips to use the Java language
## Terminal input
````java
import java.util.Scanner;

public class TerminalInputScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input from System.in (the console)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a whole line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close(); // Close the scanner to release system resources
    }
}
````
To use terminal input, you must use the `Scanner Class` that is in the `java.util` package.