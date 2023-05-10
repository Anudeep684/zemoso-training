// First interface
interface Interface1 {
    void method1();
    void method2();
}

// Second interface
interface Interface2 {
    void method3();
    void method4();
}

// Third interface
interface Interface3 {
    void method5();
    void method6();
}

// Combined interface
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

// Concrete class implementing the combined interface and inheriting from a concrete class
class MyClass extends BaseClass implements CombinedInterface {
    public void method1() {
        System.out.println("Method 1");
    }
    
    public void method2() {
        System.out.println("Method 2");
    }
    
    public void method3() {
        System.out.println("Method 3");
    }
    
    public void method4() {
        System.out.println("Method 4");
    }
    
    public void method5() {
        System.out.println("Method 5");
    }
    
    public void method6() {
        System.out.println("Method 6");
    }
    
    public void method7() {
        System.out.println("Method 7");
    }
}

public class InterfaceDemo {
    // Method that takes an object of any of the four interfaces
    public static void method1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }
    
    // Method that takes an object of any of the four interfaces
    public static void method2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }
    
    // Method that takes an object of any of the four interfaces
    public static void method3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }
    
    // Method that takes an object of the combined interface
    public static void method4(CombinedInterface obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }
    
    public static void main(String[] args) {
        // Create an object of the concrete class
        MyClass obj = new MyClass();
        
        // Pass the object to each of the four methods
        method1(obj);
        method2(obj);
        method3(obj);
        method4(obj);
    }
}

// Concrete base class
class BaseClass {
    public void baseMethod() {
        System.out.println("Base method");
    }
}
