/*(7)1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are common to all Rodents, and 
override these in the derived classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with 
different specific types of Rodents, and call your base-class methods to see what happens.
Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.*/
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

public class Java7_1 {
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
/*This is a rodent.
This is a mouse.
This is a rodent.
This is a gerbil.
This is a rodent.
This is a hamster.
Mouse is eating.
Mouse is running.
Gerbil is eating.
Gerbil is running.
Hamster is eating.
Hamster is running.
    */
