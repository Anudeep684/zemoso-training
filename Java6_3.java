public class Java6_3 {
    private int x;
    private String y;

    // First constructor
    public Java6_3(int x) {
        this(x, "default value");
    }

    // Second constructor
    public Java6_3(int x, String y) {
        this.x = x;
        this.y = y;
    }
}
//the program will not run since it does not have main method
