public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default constructor // set attr. --> garbage
//    public void student(){
//        System.out.println("Student Default constructor called");
//    }
    // Parametrised Constructor
    public Student( int id, int age, String name, int nos) {
        System.out.println("Student Default constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy Constructor
    public Student( Student srcobj) {  //srcobj --> A
        System.out.println("Student Copy constructor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    //Methods / Behavior
    public void study(){
        System.out.println(name + "Student is studying");
    }

    public void sleep(){
        System.out.println(name + "Student is sleeping");
    }

    public void bunk(){
        System.out.println(name + "Student is bunking");
    }
}
