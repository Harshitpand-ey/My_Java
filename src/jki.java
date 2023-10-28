import java.util.Arrays;
import java.util.Scanner;

public class jki {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            System.out.println("Enter " + size + " numbers:");

            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            Arrays.sort(numbers);

            System.out.println("Sorted numbers in ascending order:");

            for (int num : numbers) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }
