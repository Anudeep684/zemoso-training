/*2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. 
Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results. 
Downcast and call balance( ) and observe what happens.*/
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

public class CycleFactoryDemo {
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
Riding a Tricycle.*/
