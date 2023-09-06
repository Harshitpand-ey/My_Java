import java.util.Scanner;

public class hji {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input the list of numbers as a space-separated string
            System.out.print("Enter a list of numbers separated by spaces: ");
            String input = scanner.nextLine();

            // Convert the input string to an array of integers
            String[] numberStrings = input.split(" ");
            int[] numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }

            // Input the element to count
            System.out.print("Enter the element to count: ");
            int targetElement = scanner.nextInt();

            // Count the occurrences of the target element
            int count = 0;
            for (int num : numbers) {
                if (num == targetElement) {
                    count++;
                }
            }

            // Display the result
            System.out.println("The element " + targetElement + " occurs " + count + " times in the list.");
        }
    }


