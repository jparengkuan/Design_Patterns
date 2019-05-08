package Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.lastIndexOf(deleteObserver);

        System.out.println("Observer " + observerIndex+1 + " Deleted");

        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }

    }

    public void setIbmPrice(double newIbmPrice) {
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAaplPrice) {
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice) {
        this.googPrice = newGoogPrice;
        notifyObserver();
    }
}
