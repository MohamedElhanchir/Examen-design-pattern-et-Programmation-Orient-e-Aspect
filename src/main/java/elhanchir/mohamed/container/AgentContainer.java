package elhanchir.mohamed.container;

import elhanchir.mohamed.agent.Agent;

import java.util.HashMap;
import java.util.Map;

public class AgentContainer {

    private static AgentContainer instance;
    private Map<String, Agent> agents;

    private AgentContainer() {
        agents = new HashMap<>();
    }

    public static AgentContainer getInstance() {
        if (instance == null) {
            instance = new AgentContainer();
        }
        return instance;
    }

    public void addAgent(Agent agent) {
        agents.put(agent.getName(), agent);
    }

    public void removeAgent(String name) {
        agents.remove(name);
    }

    public Agent getAgent(String name) {
        return agents.get(name);
    }

    public void display() {
        System.out.println("AgentContainer state: ");
        for (String name : agents.keySet()) {
            System.out.println(agents.get(name));
        }
    }

}





