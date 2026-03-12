public class Payment {

    public static int paymentCount = 0;

    private String paymentId;
    private double amount;
    private String method;   

    public Payment() {
        paymentCount++;
    }

    
    public Payment(String paymentId,
                   double amount,
                   String method) {

        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;

        paymentCount++;
    }


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void payByMobile() {
        method = "Mobile Banking";
        System.out.println("Pay by Mobile Banking");
    }

    public void payByCreditCard() {
        method = "Credit Card";
        System.out.println("Pay by Credit Card");
    }

    public void printInfo() {

        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Method: " + method);

    }

}