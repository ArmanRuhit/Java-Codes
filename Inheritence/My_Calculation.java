package Inheritence;


class Calculation{
  int z;
  public void addition(int a, int b){
    z = a+b;
    System.out.println("Sum: "+z);
  }

  public void subtraction(int a, int b) {
    z = a-b;
    System.out.println("Subtraction: "+z);
  }
}

public class My_Calculation extends Calculation{
  public void Multiplication(int a, int b) {
    z = a*b;
    System.out.println("Multiplication: "+z);
  }

  public static void main(String[] args) {
    My_Calculation demo = new My_Calculation();
    int a = 20, b = 10;
    demo.addition(a, b);
    demo.subtraction(a, b);
    demo.Multiplication(a, b);
  }
}
