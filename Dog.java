public class Dog extends Pet implements Performer {

  public Dog(String name) {
    super("Dog", name);
  }

  public String stuntList() {
    return "Sit up\nBeg";
  }

  public String eat() {
    return this.getName() + " wolfs down kibble";
  }

  public String doStunt(String stunt) {
    if (stunt.equals("Sit up")) {
      return (this.getName() + " sits up");
    }
    else if (stunt.equals("Beg")) {
      return (this.getName() + " begs");
    }
    else {
      return (this.getName() + " doesn't know how to " + stunt);
    }
  }
}
      



