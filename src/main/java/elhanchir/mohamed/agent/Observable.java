package elhanchir.mohamed.agent;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(NotificationEvent event);
}
