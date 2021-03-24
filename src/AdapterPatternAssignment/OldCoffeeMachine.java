package AdapterPatternAssignment;

public class OldCoffeeMachine {
    String optionA;
    String optionB;

    OldCoffeeMachine() {

    }

    public void selectA(String A) {
        this.optionA = A;
        System.out.println("First Coffee Option is : " + this.optionA);
    }

    public void selectB(String B) {
        this.optionB = B;
        System.out.println("Second Coffee Option is : " + this.optionB);
    }
}
