package elhanchir.mohamed.agent;

public class DefaultStrategy implements NotificationStrategy {

        @Override
        public void handleNotification(NotificationEvent event) {
            System.out.println("Notification reçue de " + event.getAgentName() +
                    ": " + event.getTransaction());
        }

}
