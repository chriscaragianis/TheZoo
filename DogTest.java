public class DogTest extends Test {
    
    public Dog testDog;
    
    public DogTest() {
        super("Dog");
        testDog = new Dog("Fido");
    }
    
    public int[] runTests() {
        int[] result = new int[3];
        result[0] = 2;
        //testEat
        int indicator = testEat();
        if (indicator == 0) {
          result[1]++;
        }
        if (indicator == -1) {
          result[2]++;
        }
        //testStuntList
        indicator = testStuntList();
        if (indicator == 0) {
          result[1]++;
        }
        if (indicator == -1) {
          result[2]++;
        }
        return result;
    }
    
    //tests
    private int testEat() {
        String out = testDog.eat();
        if (out.equals("Fido wolfs down kibble")) {
            System.out.println("Dog#eat: 👍");
            return 0;
        }
        else {
            System.out.println("Dog#eat: 💩  Expected \"" + out + 
                               "\" to equal \"Fido wolfs down kibble\"");
            return -1;
        }
    }
    private int testStuntList() {return 0;}
    
    
}