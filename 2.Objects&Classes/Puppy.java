/**
 * Puppy
 */
public class Puppy {

  int puppyAge;

  public Puppy(String name){
    System.out.println("Name chosen is :"+ name);
  }

  public void setAge(int age) {
    puppyAge = age;
  }
  
  public int getAge() {
    return puppyAge;
  }

  public static void main(String[] args) {
    Puppy myPuppy = new Puppy("tommy");
    myPuppy.setAge(2);
    System.out.println(myPuppy.getAge());
  }
}