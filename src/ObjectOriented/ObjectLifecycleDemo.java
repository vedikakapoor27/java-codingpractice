package ObjectOriented;

public class ObjectLifecycleDemo {
    //class is loaded here
    //jvm LOADES this class to memory

    //then static variable get memory
    static class Student{
    int id;
    String name;
    //now here first during memory allocation
        //they first get default values
        //what is static class for ?
        //this is nested static that does not need any outer object


        //static method is used when no object is required


        //then we will create constructor that runs after
        // memory allocation
        //default value assignment
        //object header creation
        }
        public static void main(String[] args){
        //now here the object creation happens
            //first jvm will check is class is loaded
            //allocated heap memory
            //object header is created or not
            /*every object contains some hidden jvm information like hashcode
            synchronization info  */
             //class pointer points to metadata
            //execute constructor
            //return reference
            Student s1=new Student();
            /*now here the student object is stored in heap
            and the reference is stored in stack*/
        }
}
