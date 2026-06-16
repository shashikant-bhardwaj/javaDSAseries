public class Student {
    //Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        // extra layer of authentification
        if(age<100){
            this.age = a;
    }

    // Default constructor // set attr. --> garbage
//    public void student(){
//        System.out.println("Student Default constructor called");
//    }
    // Parametrised Constructor
//    public Student( int id, int age, String name, int nos, String gf) {
//        System.out.println("Student Default constructor called");
//        this.id = id;
//        this.age = age;
//        this.name = name;
//        this.nos = nos;
//        this.gf = gf;
//    }

    // Copy Constructor
//    public Student( Student srcobj) {  //srcobj --> A
//        System.out.println("Student Copy constructor called");
//        this.id = srcobj.id;
//        this.age = srcobj.age;
//        this.name = srcobj.name;
//        this.nos = srcobj.nos;
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

    private void gfChatting(){
        System.out.println(name + "Student is gfChatting");
    }
}
