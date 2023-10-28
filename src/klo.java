public class klo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 7;

        boolean found = false;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break; // Element found, no need to continue searching
            }
        }

        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}


