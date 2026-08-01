package Polymorphism;

public class Main {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(1, 2));
//        System.out.println(c.add(2, 3, 4));
//        System.out.println(c.add(3,4,5,5.5));

        //runtime polymorphism
//        circle c = new circle();
//        c.draw();    //upcasting
//        doDrawingStuff(c);
//
//        rect a = new rect();
//        a.draw();
//
//        shape s = new shape();
//        doDrawingStuff(s);

         //downcasting
        circle c = new circle();
        doDrawingStuff(c);

    }

    public static void doDrawingStuff(shape s){
        s.draw();
        circle c = (circle)s; //downcasting
//        c.draw();
        c.personal();
    }

}
