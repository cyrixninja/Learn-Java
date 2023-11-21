/*
 * Inheritance in Java
 */
package classes;

class programming {
  protected String language = "Java";
  public void Hi() {
    System.out.println("Hello World !");
  }
}

class programming1 extends programming {
  private String txt = "is Awesome !";
  public static void main(String[] args) {
    programming1 value = new programming1();
    value.Hi();
    System.out.println(value.language + " " +value.txt);
  }
}
