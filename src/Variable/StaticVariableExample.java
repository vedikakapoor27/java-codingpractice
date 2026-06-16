package Variable;

class Student {

    int id;              // instance variable (different for each object)
    String name;

    static String college = "SRM";  // static variable (same for all)

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class StaticVariableExample{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Vedika";

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Rahul";
    }
}

