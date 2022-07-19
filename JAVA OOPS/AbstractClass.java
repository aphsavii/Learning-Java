abstract class Janwar {
  abstract public void sound();
}

class Billi extends Janwar {
  public void sound() {
    System.out.println("Meow Meow ...");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    // Dynamic Method Dispatch done here 👇👇
    Janwar Bilad = new Billi();

    Billi Bilaad = new Billi();
    Bilaad.sound();
    Bilad.sound();
  }
}
