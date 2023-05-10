/*Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method but only use a single catch clause 
that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.*/

public class ExceptionExample {

    // Custom exceptions
    static class CustomException1 extends Exception {
        public CustomException1(String message) {
            super(message);
        }
    }

    static class CustomException2 extends Exception {
        public CustomException2(String message) {
            super(message);
        }
    }

    static class CustomException3 extends Exception {
        public CustomException3(String message) {
            super(message);
        }
    }

    public static void throwAllExceptions() throws CustomException1, CustomException2, CustomException3 {
        // Simulate throwing all three types of exceptions
        int exceptionType = (int) (Math.random() * 3);
        if (exceptionType == 0) {
            throw new CustomException1("Custom Exception 1");
        } else if (exceptionType == 1) {
            throw new CustomException2("Custom Exception 2");
        } else {
            throw new CustomException3("Custom Exception 3");
        }
    }

    public static void main(String[] args) {
        try {
            // Call the method that throws all three exceptions
            throwAllExceptions();
        } catch (CustomException1 | CustomException2 | CustomException3 e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
