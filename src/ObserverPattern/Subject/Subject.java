package src.ObserverPattern.Subject;

import src.ObserverPattern.Oberver.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
