package lab4;

public class Test {

  private void method_1(){
    System.out.println("Method 1");
  }

  @Call(call = 2)
  private void method_2(){
    System.out.println("Method 2");
  }

  @Call(call = 3)
  private void method_3(){
    System.out.println("Method 3");
  }

  private void method_4(){
    System.out.println("Method 4");
  }
}
