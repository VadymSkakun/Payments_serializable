import java.io.Serializable;

public class Payments implements Serializable {
    String customerNumber;
    String paymentDate;
    String amount;
    private static final long serialVersionUID = 12345;

    public Payments(String customerNumber, String paymentDate, String amount) {
        this.customerNumber = customerNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "customerNumber='" + customerNumber + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
