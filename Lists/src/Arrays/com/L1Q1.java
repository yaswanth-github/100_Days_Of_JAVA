package Arrays.com;

public class L1Q1 {
    public static void main(String[] args) {
        int random[] = {2, 4, 5, 10};
        printArray(random);
    }
    public static void printArray(int[] arr) {
        // Declare printArray method here
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
