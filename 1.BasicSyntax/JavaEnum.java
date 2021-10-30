

class Enums{
  enum EnumsType{Small, Big, Medium}
  EnumsType x;
}
public class JavaEnum {

  public static void main(String[] args) {
    Enums a = new Enums();
    a.x = Enums.EnumsType.Medium;
    System.out.println(a.x);
  }
}