package elhanchir.mohamed;

import elhanchir.mohamed.agent.Agent;
import elhanchir.mohamed.agent.ScoringStrategy;
import elhanchir.mohamed.container.AgentContainer;
import elhanchir.mohamed.container.ConsoleHdmiDisplay;
import elhanchir.mohamed.transaction.Transaction;
import elhanchir.mohamed.transaction.TransactionBuilder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       /* Transaction transaction = new Transaction("001", new Date(), 1000, "vente");
        System.out.println(transaction);

        Transaction build = new TransactionBuilder()
                .setId("002")
                .setDate(new Date())
                .setAmount(2000)
                .setType("achat")
                .build();

        System.out.println("**********************************");
        System.out.println(build);*/

        /*Agent agent1 = new Agent("Agent1");
        Agent agent2 = new Agent("Agent2");

        // Souscrire agent2 aux notifications de agent1
        agent1.subscribe(agent2);

        // Créer une transaction pour agent1
        Transaction transaction1 = new TransactionBuilder()
                .setId("T001")
                .setDate(new Date())
                .setAmount(150.00)
                .setType("Vente")
                .build();

        // Ajouter la transaction à agent1
        agent1.addTransaction(transaction1);

        // Afficher les transactions de agent1
        System.out.println(agent1.getTransactions());

        // Changer la stratégie de notification de agent2
        agent2.setStrategy(new ScoringStrategy());

        // Ajouter une autre transaction à agent1
        Transaction transaction2 = new TransactionBuilder()
                .setId("T002")
                .setDate(new Date())
                .setAmount(200.00)
                .setType("Achat")
                .build();

        agent1.addTransaction(transaction2);

        // Afficher les transactions de agent1 et agent2
        System.out.println(agent1.getTransactions());
        System.out.println(agent2.getTransactions());

        // Vérifier la transaction avec le montant le plus élevé
        System.out.println("Transaction avec le montant le plus élevé : " + agent1.getTransactionWithLargestAmount());
*/

        AgentContainer container = AgentContainer.getInstance();

        // Créer des agents
        Agent agent1 = new Agent("Agent1");
        Agent agent2 = new Agent("Agent2");

        // Ajouter des agents au conteneur
        container.addAgent(agent1);
        container.addAgent(agent2);

        // Créer des transactions
        Transaction transaction1 = new TransactionBuilder()
                .setId("T001")
                .setDate(new Date())
                .setAmount(150.00)
                .setType("Vente")
                .build();

        Transaction transaction2 = new TransactionBuilder()
                .setId("T002")
                .setDate(new Date())
                .setAmount(200.00)
                .setType("Achat")
                .build();

        // Ajouter les transactions aux agents
        agent1.addTransaction(transaction1);
        agent2.addTransaction(transaction2);

        // Afficher l'état du conteneur
        ConsoleHdmiDisplay display = new ConsoleHdmiDisplay(container);
        display.display();

        // Rechercher un agent dans le conteneur
        System.out.println("Recherche de l'Agent1 : " + container.getAgent("Agent1"));

        // Supprimer un agent du conteneur
        container.removeAgent("Agent1");
        display.display();

    }
}









