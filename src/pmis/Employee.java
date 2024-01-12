package pmis;

public class Employee extends Person{

  private String designation;
  private int salary;

  public Employee(){}
  public Employee(String designation, int salary) {
    this.designation = designation;
    this.salary = salary;
  }

  public Employee(int id, String name, int age, String designation, int salary) {
    super(id, name, age);
    this.designation = designation;
    this.salary = salary;
  }
  public Employee(int id, String name, String designation, int salary) {
    super(id, name);
    this.designation = designation;
    this.salary = salary;
  }
  public Employee(String name, int id, String designation, int salary) {
    super(name, id);
    this.designation = designation;
    this.salary = salary;
  }
  public String getDesignation() {
    return designation;
  }
  public void setDesignation(String designation) {
    this.designation = designation;
  }
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
  @Override
  public String toString() {
    return super.toString()+", Employee [designation=" + designation + ", salary=" + salary + "]";
  }

 
  public void show(int id){
    System.out.println("Show in employee: "+id);
    System.out.println("Parent's Name: "+super.name);
  }

  public void show(){
    System.out.println("Show in employee: "+super.getId());
    System.out.println("Parent's Name: "+super.name);
  }

}
