package elhanchir.mohamed.agent;

import elhanchir.mohamed.transaction.Transaction;

import java.util.ArrayList;
import java.util.List;

public class HistoryStrategy implements NotificationStrategy {

        private List<Transaction> historique = new ArrayList<>();

        @Override
        public void handleNotification(NotificationEvent event) {
            historique.add(event.getTransaction());
            System.out.println("Historique des transactions mis à jour: " + historique);
        }


}
