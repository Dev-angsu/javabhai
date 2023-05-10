public class recursion {
    public static void main(String[] args) {
        int n = 5; // Example value of n
        int sum = addNumbers(n);
        System.out.println("Sum of numbers from 1 to " + n + " is " + sum);
    }

    public static int addNumbers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + addNumbers(n - 1);
        }
    }
}
