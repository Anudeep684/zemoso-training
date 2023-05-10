//2. Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
public class Java6_2 {
    private int x;
    private String y;

    // First constructor
    public Java6_2(int x) {
        this(x, "default value");
    }

    // Second constructor
    public Java6_2(int x, String y) {
        this.x = x;
        this.y = y;
    }
}
//the program will not run since it does not have main method
