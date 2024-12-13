public class staticIntUse {

  // this is a demo to show initialisation of static variables

  static int a =9;
  static int b;

  // will only run once, when the obj is create i.e when the class is loaded for the time
  static{
    System.out.println("I am in static block");
    b= a*5;

  }

  public static void main(String[] args) {
    staticIntUse obj = new staticIntUse();
    System.out.println(staticIntUse.a + " "+ staticIntUse.b);

    staticIntUse.b += 3;

    staticIntUse obj2 =new staticIntUse();
    System.out.println(staticIntUse.a + " "+ staticIntUse.b);
  }
}
