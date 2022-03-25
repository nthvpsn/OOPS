public class Intro {
    public static void main(String[] args) {
        //creating an object being called by a constructor
        Student amar = new Student(1,"Amar Nath",15,true);
        System.out.println(amar.rollNumber);
        System.out.println(amar.name);
        System.out.println(amar.marks);
        System.out.println(amar.isPass);

        Student admin = new Student();  //creating an object with contructor having default value assigned
        System.out.println(admin.name);

        Student newAd = new Student("Google");  //calling contructor under contructor
        System.out.println(newAd.name);

        amar.greet("Babu");  //calling a method
    }
}
//CLASS TEMPLATE
class Student {
    int rollNumber;
    String name;
    float marks;
    boolean isPass;

    //CONSTRUCTOR
    Student() {
        rollNumber = 1;
        name = "Amar";
        marks = 99f;
        isPass = false;
    }
    //COONSTRUCTOR
    Student(int rollNumber, String name, float marks, boolean isPass) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.isPass = isPass;
    }
    
    Student(String name) {
        this(5, "AmarBau", 55, true);
    }
    //method
    void greet(String name) {
        System.out.println("Hello " + this.name);
    }

}
