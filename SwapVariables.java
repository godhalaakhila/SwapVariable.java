public class SwapVariables {
    public static void main(String[] args) {
        // Initialize two variables
        int a = 5;
        int b = 10;

        // Display original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using a third (temporary) variable
        int temp = a;
        a = b;
        b = temp;

        // Display swapped values
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
    

