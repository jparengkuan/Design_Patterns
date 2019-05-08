package State;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("Card already inserted");
        atmMachine.setAtmState(atmMachine.getHasCardState());

    }

    @Override
    public void ejectCard() {

        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinNumber) {
        System.out.println("Correct Pin already entered");
        ;
    }

    @Override
    public void requestCash(int amount) {
        if (amount > atmMachine.cashInMachine) {
            System.out.println("Requested Amount not available");
            ;
            System.out.println("Card ejected");
            ;
            atmMachine.setAtmState(atmMachine.getNoCardState());
        } else {
            System.out.println(amount + " ejected from machine");
            ;
            atmMachine.setCashInMachine(atmMachine.cashInMachine - amount);
            System.out.println("Card ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());

            if (atmMachine.cashInMachine <= 0) {
                atmMachine.setAtmState(atmMachine.atmOutofMoney);
            }

        }
    }
}
