//package AbstractClass;
//
//abstract class Bird{
//     abstract void fly();
//     abstract void eat();
//     public void sleep(){
//         System.out.println("bird sleeping");
//     }
//        }
//class Sparrow extends Bird {
//    void fly(){
//        System.out.println("I'm flying");
//    }
//
//    void eat(){
//        System.out.println("I'm eating");
//    }
//}
//
//class Crow extends Bird {
//    void fly(){
//        System.out.println("crow flying");
//    }
//
//    void eat(){
//        System.out.println("crow eating");
//    }
//}
//public class Main {
//    public static void doBirdStuff(Bird b){
//        b.fly();
//        b.fly();
//        b.sleep();
//    }
//    public static void main() {
//        Bird b = new Sparrow();
//        b.fly();
//        b.eat();
//
//        b = new Crow();
//        b.fly();
//        b.eat();
//        doBirdStuff(new Sparrow());
//        doBirdStuff(new Crow());
//    }
//}


package AbstractClass;

interface Bird{
    void fly();
    void eat();
    default void sleep(){
        System.out.println("bird sleeping");
    }
}

interface Walk{
    void walking();
}
class Sparrow implements Bird, Walk {
    public void fly(){
        System.out.println("sparrow flying");
    }

    public void eat(){
        System.out.println("sparrow eating");
    }
    public void walking(){
        System.out.println("sparrow walking");
    }
}

class Crow implements Bird {
    public void fly(){
        System.out.println("crow flying");
    }

    public void eat(){
        System.out.println("crow eating");
    }
}
public class Main {
    public static void doBirdStuff(Bird b){
        b.fly();
        b.fly();
        b.sleep();
    }
    public static void main() {
        Bird b = new Sparrow();
//        b.fly();
//        b.eat();
//
//        b = new Crow();
//        b.fly();
//        b.eat();
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}
