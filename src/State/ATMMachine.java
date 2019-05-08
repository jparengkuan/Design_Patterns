package State;

public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutofMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutofMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = atmOutofMoney;
        }

    }

    void setAtmState(ATMState newState) {
        atmState = newState;
    }

    public void setCashInMachine(int amount) {
        cashInMachine = amount;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int amount) {
        atmState.requestCash(amount);
    }

    public void insertPin(int pinNumber) {
        atmState.insertPin(pinNumber);
    }

    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutofMoney;
    }
}
