package State;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("Please enter a PIN");
        atmMachine.setAtmState(atmMachine.getHasCardState());

    }

    @Override
    public void ejectCard() {

        System.out.println("Enter a card first");
        ;
    }

    @Override
    public void insertPin(int pinNumber) {
        System.out.println("Enter a card first");
        ;
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter a card first");
        ;
    }
}
