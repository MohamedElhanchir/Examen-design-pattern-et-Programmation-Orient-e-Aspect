package elhanchir.mohamed.agent;

import elhanchir.mohamed.transaction.Transaction;

public class NotificationEvent  {
    private String agentName;
    private Transaction transaction;

    public NotificationEvent(String agentName, Transaction transaction) {
        this.agentName = agentName;
        this.transaction = transaction;
    }

    public String getAgentName() {
        return agentName;
    }

    public Transaction getTransaction() {
        return transaction;
    }
}
