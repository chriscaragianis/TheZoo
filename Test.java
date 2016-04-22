public abstract class Test {
    
    private String className;
    
    public String getClassName() {return className;}
    
    public Test(String cname) {
        className = cname;
    }
    
    public abstract int[] runTests(); 
    //each test method in a Test class should
    //print a message and return 0 (pass) or
    //-1 (fail)
    //
    //runTests should return [# of tests, # of passes, # of failures]
    public void displayResults() {
        
        System.out.println("\n\nTests for " + className + "\n");
        int[] results = runTests();
        if (results[2] != 0) {
            System.out.println("\nThere were failures!");
        }
        else {
          System.out.println("\nSuccess");
        }
        System.out.println("Examples: " + results[0] + 
                           ", Passed: " + results[1] + 
                           ", Failed: " + results[2]);
    }
}