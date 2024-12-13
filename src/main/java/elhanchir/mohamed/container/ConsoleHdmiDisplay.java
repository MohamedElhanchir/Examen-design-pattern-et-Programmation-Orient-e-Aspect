package elhanchir.mohamed.container;

public class ConsoleHdmiDisplay implements HDMIDisplay {

        private AgentContainer container;

        public ConsoleHdmiDisplay(AgentContainer container) {
            this.container = container;
        }

        @Override
        public void display() {
            container.display();
        }


}
