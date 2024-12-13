# ELHANCHIR MOHAMED - GLSID3
# Gestion des Conteneurs d'Agents

## Description
Ce projet met en œuvre une application permettant de gérer des conteneurs d'agents.
Chaque agent gère des transactions et peut notifier d'autres agents qui se sont abonnés à ses activités. 
L'application utilise divers **design patterns** pour assurer une architecture claire, modulaire et évolutive.


## Fonctionnalités principales

### 1. Transactions
- Les transactions sont définies par un **id**, une **date**, un **montant**, et un **type** (Vente ou Achat).
- Créées en utilisant le **pattern Builder**.

### 2. Abonnement des Agents
- Chaque agent peut s'abonner aux activités d'autres agents.
- Les notifications incluent :
    - Le nom de l'agent.
    - La transaction ajoutée.

### 3. Stratégies de Traitement
- Possibilité de définir plusieurs stratégies de traitement des notifications :
    - **ScoringStrategy** : Mise à jour du solde en fonction du montant de la transaction.
    - **HistoryStrategy** : Suivi de l'historique des transactions.
    - Stratégies extensibles pour répondre à d'autres besoins.

### 4. Conteneur d'Agents
- Gère une collection d'agents avec un **HashMap**.
- Fournit des opérations classiques :
    - Ajout d'un agent.
    - Suppression d'un agent.
    - Recherche d'un agent.
- Affichage délégué à des afficheurs via une interface HDMI. Les afficheurs VGA nécessitent un adaptateur.
- Implémentation du **Singleton Pattern** pour garantir une instance unique.

### 5. Aspects Techniques
- **Journalisation** :
    - Une annotation `@Log` mesure et journalise la durée d'exécution des méthodes.
- **Cache** :
    - Une annotation `@Cachable` pour optimiser la méthode retournant la transaction au montant le plus élevé.
- **Sécurité** :
    - Une annotation `@SecuredBy(roles={...})` gère l'accès en fonction des rôles utilisateurs.
