package Strategy;

public class StrategyDemo {

    public static void main(String args[]) {
        Context operationAdd = new Context(new OperationAdd());
        Context OperationSubstract = new Context(new OperationSubstract());

        System.out.println("2 + 2 = " +operationAdd.executeStrategy(2,2));
        System.out.println("2 - 2 = " +OperationSubstract.executeStrategy(2,2));
    }
}
