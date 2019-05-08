package State;

public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinNumber);

    void requestCash(int amount);

}
