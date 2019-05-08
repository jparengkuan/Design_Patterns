package State;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("Card already inserted");

    }

    @Override
    public void ejectCard() {

        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinNumber) {

        if (pinNumber == 1234) {
            System.out.println("Correct Pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
        } else {
            System.out.println("Wrong Pin");
            atmMachine.correctPinEntered = false;
            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());

        }

    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter PIN first");
    }
}
