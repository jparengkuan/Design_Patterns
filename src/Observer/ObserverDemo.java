package Observer;

public class ObserverDemo {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(120.00);
        stockGrabber.setGoogPrice(300.00);
        stockGrabber.setAaplPrice(30.00);
    }
}
