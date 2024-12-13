package elhanchir.mohamed.agent;


import elhanchir.mohamed.transaction.Transaction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agent implements Observer, Observable {
    private String name;
    private List<Transaction> transactions;
    private Set<Observer> observers;
    private NotificationStrategy strategy;

    public Agent(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.observers = new HashSet<>();
        this.strategy = new DefaultStrategy(); // Stratégie par défaut
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        notifyObservers(new NotificationEvent(this.name, transaction));
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(NotificationEvent event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    @Override
    public void update(NotificationEvent event) {
        strategy.handleNotification(event);
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public Transaction getTransactionWithLargestAmount() {
        return transactions.stream()
                .max((t1, t2) -> Double.compare(t1.getAmount(), t2.getAmount()))
                .orElse(null);
    }

    public String getName() {
        return name;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}

