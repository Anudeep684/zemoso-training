class Cycle {
    void ride() {
        System.out.println("Riding Cycle");
    }
}

class Unicycle extends Cycle {
    void ride() {
        System.out.println("Riding Unicycle");
    }
    
    void balance() {
        System.out.println("Balancing on Unicycle");
    }
}

class Bicycle extends Cycle {
    void ride() {
        System.out.println("Riding Bicycle");
    }
    
    void balance() {
        System.out.println("Balancing on Bicycle");
    }
}

class Tricycle extends Cycle {
    void ride() {
        System.out.println("Riding Tricycle");
    }
}

public class Java7_2 {
    public static void main(String[] args) {
        Cycle[] cycles = { new Unicycle(), new Bicycle(), new Tricycle() };

        // Upcasting
        for (Cycle cycle : cycles) {
            cycle.ride();
            // This won't compile: cycle.balance();
        }

        // Downcasting
        Unicycle uni = (Unicycle) cycles[0];
        Bicycle bike = (Bicycle) cycles[1];
        Tricycle tri = (Tricycle) cycles[2];

        uni.balance();
        bike.balance();

        // This won't compile: tri.balance();
    }
}
