package test;

import static test.Some.staticFun;
import static test.Some.staticVal;

public class Test {

  public static void main(String[] args) {
    System.out.println(staticVal);
    staticFun();
  }
}
