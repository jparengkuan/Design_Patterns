package Singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}
