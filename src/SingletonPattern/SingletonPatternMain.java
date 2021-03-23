package SingletonPattern;

public class SingletonPatternMain {
    public static void main(String[] args) {
        //create single object of the class
        SingletonPatternObject obj = SingletonPatternObject.getInstance();
        obj.printMessage();
    }
}
