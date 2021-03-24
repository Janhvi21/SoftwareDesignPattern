package AdapterPatternAssignment;

public class Program {
    public static void main(String[] args){
        OldCoffeeMachine oldCoffeeMachine=new OldCoffeeMachine();
        CoffeeMachineInterface adapter=new CoffeeTouchScreenAdapter(oldCoffeeMachine);
        adapter.chooseFirstSelection("Black Coffee");
        adapter.chooseSecondSelection("Milk");

    }
}
