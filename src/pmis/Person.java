package pmis;

import bank.BankInfo;

public class Person {
  private int id;
  protected String name;
  private int age;
  String address;

  public Person(){}
  public Person(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public Person(String name, int id) {
    this.id = id;
    this.name = name;
  }

  public Person(int id, int age) {
    this.id = id;
    this.age = age;
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

  public int getAge() {
    return age;
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

  public void setAge(int age) {
    if (age > 0) {
      this.age = age;
    }else{
      System.out.println("Invalid age");
    }
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
  }

  public void show(){
    System.out.println("Show in person");
    info(this.getName());
  }

}
