package State;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {

        System.out.println("ATM out of money");


    }

    @Override
    public void ejectCard() {

        System.out.println("ATM out of money");
    }

    @Override
    public void insertPin(int pinNumber) {
        System.out.println("ATM out of money");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("ATM out of money");
    }
}
