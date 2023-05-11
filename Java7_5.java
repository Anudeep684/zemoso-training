/*(7)5. Create a class with an inner class that has a non-default constructor (one that takes arguments). 
        Create a second class with an inner class that inherits from the first inner class.
*/

public class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    public class InnerClass {
        private int innerField;

        public InnerClass(int innerField) {
            this.innerField = innerField;
        }

        public int getInnerField() {
            return innerField;
        }

        public int getOuterField() {
            return outerField;
        }
    }
}

public class Subclass extends OuterClass.InnerClass {
    public Subclass(OuterClass outer, int innerField) {
        outer.super(innerField);
    }
}

public class Java7_5 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        Subclass sub = new Subclass(outer, 20);
        System.out.println("Inner field: " + sub.getInnerField());
        System.out.println("Outer field: " + sub.getOuterField());
    }
}
