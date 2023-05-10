abstract class Rodent {
    Rodent() {
        System.out.println("This is a rodent.");
    }
    abstract void eat();
    abstract void run();
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("This is a mouse.");
    }
    void eat() {
        System.out.println("Mouse is eating.");
    }
    void run() {
        System.out.println("Mouse is running.");
    }
}

class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("This is a gerbil.");
    }
    void eat() {
        System.out.println("Gerbil is eating.");
    }
    void run() {
        System.out.println("Gerbil is running.");
    }
}

class Hamster extends Rodent {
    Hamster() {
        System.out.println("This is a hamster.");
    }
    void eat() {
        System.out.println("Hamster is eating.");
    }
    void run() {
        System.out.println("Hamster is running.");
    }
}

public class RodentHierarchy {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();
        
        for (int i = 0; i < rodents.length; i++) {
            rodents[i].eat();
            rodents[i].run();
        }
    }
}
