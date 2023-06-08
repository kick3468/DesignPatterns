package src.ObserverPattern.Oberver;

public interface Observer {
    public void update(float temp, float humidity, float pressure); // Change to this method signature will result in multiple changes
}
