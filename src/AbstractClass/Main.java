package AbstractClass;

abstract class Bird{
     abstract void fly();
     abstract void eat();
        }
class Sparrow extends Bird {
    void fly(){
        System.out.println("I'm flying");
    }

    void eat(){
        System.out.println("I'm eating");
    }
}
public class Main {
    public static void main() {
        Bird b = new Sparrow();
        b.fly();
        b.eat();
    }
}
