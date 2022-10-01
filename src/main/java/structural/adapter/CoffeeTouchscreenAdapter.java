package structural.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    OldCoffeeMachine theMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
        theMachine = newMachine;
    }

    public void chooseFirstSelection() {
        theMachine.selectA();
    }

    public void chooseSecondSelection() {
        theMachine.selectB();
    }
}
