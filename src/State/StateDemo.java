package State;

public class StateDemo {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(20);


    }
}
