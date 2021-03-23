package SingletonPattern;

public class SingletonPatternObject {
    private static SingletonPatternObject instance = null;

    private SingletonPatternObject() {
    }

    public static SingletonPatternObject getInstance() {
        if(instance==null){
            instance=new SingletonPatternObject();
        }
        return instance;
    }

    public void printMessage() {
        System.out.println("This is SingletonPattern");
    }
}

