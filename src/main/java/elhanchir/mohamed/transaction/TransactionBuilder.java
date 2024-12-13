package elhanchir.mohamed.transaction;

import java.util.Date;

public class TransactionBuilder {

        private String id;
        private Date date;
        private double amount;
        private String type;

        public TransactionBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public TransactionBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public TransactionBuilder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public TransactionBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Transaction build() {
            return new Transaction(id, date, amount, type);
        }

}
