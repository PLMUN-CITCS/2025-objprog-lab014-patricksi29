public class MethodReturnTypes {
    public static void main(String[] args) {
        // Call displayWelcomeMessage to print the welcome message
        displayWelcomeMessage();
        
        // Declare variables
        int value1 = 20;
        int value2 = 30;
        
        // Call calculateAverage and store the result in 'result'
        double result = calculateAverage(value1, value2);
        
        // Print the result
        System.out.println("The average is: " + result);
    }
    
    // displayWelcomeMessage method (void method)
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // calculateAverage method (value-returning method)
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }
}
