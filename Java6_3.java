/*(6)3. Create a class with a constructor that takes a String argument. During construction, print the argument. 
Create an array of object references to this class, but don’t actually create objects to assign into the array.
When you run the program, notice whether the initialization messages from the constructor calls are printed.*/
public class Java6_3{
    public Java6_3(String arg) {
        System.out.println("Constructor called with argument: " + arg);
    }

    public static void main(String[] args) {
        Java6_3[] myArray = new MyClass[5];
    }
}
//no output
