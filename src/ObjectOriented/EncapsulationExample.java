public static class EncapsulationExample {
      private double salary = 5000;//access modifier only employee class can access it
      public void setSalary(double salary) {
          this.salary = salary;//this refers to the current object
      }
      public double getSalary(){
          return salary;
      }
      }
      //here we are using getters and setters they hide internal
// data and provide controlled access to object properties

static void main() {
    EncapsulationExample obj = new EncapsulationExample();
    obj.getSalary();
}