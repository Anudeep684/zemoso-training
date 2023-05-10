/*4. Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.*/
interface Cycle {
    void ride();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void ride() {
        System.out.println("Riding a Unicycle.");
    }

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    public void ride() {
        System.out.println("Riding a Bicycle.");
    }

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    public void ride() {
        System.out.println("Riding a Tricycle.");
    }

    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class Java7_4 {
    public static void rideCycle(CycleFactory factory) {
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Bicycle.factory);
        rideCycle(Tricycle.factory);
    }
}
/*Riding a Unicycle.
Riding a Bicycle.
Riding a Tricycle.
*/
