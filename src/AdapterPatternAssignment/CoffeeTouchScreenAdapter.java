package AdapterPatternAssignment;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchScreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection(String firstSelection) {
        this.oldCoffeeMachine.selectA(firstSelection);
    }

    @Override
    public void chooseSecondSelection(String secondSelection) {
        this.oldCoffeeMachine.selectB(secondSelection);
    }
}
