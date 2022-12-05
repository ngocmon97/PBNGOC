package Ex;

import java.util.List;

public class Hogiadinh {
        public List<Nguoi> amountPersons;
        public String address;

        public Hogiadinh(List<Nguoi> amountPersons, String address) {
            this.amountPersons = amountPersons;
            this.address = address;
        }

        public List<Nguoi> getAmountPersons() {
            return amountPersons;
        }

        public void setAmountPersons(List<Nguoi> amountPersons) {
            this.amountPersons = amountPersons;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Family{" +
                    "presons=" + amountPersons +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

