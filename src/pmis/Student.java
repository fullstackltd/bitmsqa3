package pmis;

public class Student extends Person {
  private int id;
  private String name;

  public Student(){}
  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Student(String name, int id) {
    this.id = id;
    this.name = name;
  }

  public void setIdAndName(int personId, String name){
    id = personId;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    if (name.length() >= 10)
      this.name = name;
    else {
      System.out.println("Invalid name");
    }
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + "]";
  }

}
