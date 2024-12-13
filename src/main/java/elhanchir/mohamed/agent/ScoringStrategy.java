package elhanchir.mohamed.agent;

public class ScoringStrategy implements NotificationStrategy {

    private double solde;
    @Override
    public void handleNotification(NotificationEvent event) {
        if (event.getTransaction().getType().equals("Vente")) {
            solde += event.getTransaction().getAmount();
        } else if (event.getTransaction().getType().equals("Achat")) {
            solde -= event.getTransaction().getAmount();
        }
        System.out.println("Solde après transaction: " + solde);
    }
}
