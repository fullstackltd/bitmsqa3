public class Main {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello"; // using str1 as a referense
    String str3 = new String("Hello"); // creating new object
    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false
    System.out.println(str1.equals(str3)); // true
  }
}
