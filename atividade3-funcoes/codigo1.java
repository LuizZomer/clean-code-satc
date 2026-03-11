public class Order {

    private double totalValue;
    private CustomerType customerType;

    public Order(double totalValue, CustomerType customerType) {
        this.totalValue = totalValue;
        this.customerType = customerType;
    }

    public double calculateDiscountedValue() {
        return totalValue * (1 - customerType.getDiscount());
    }

    public void showSummary() {
        System.out.println("Tipo de Cliente: " + customerType);
        System.out.println("Valor Original: R$" + totalValue);
        System.out.println("Valor com Desconto: R$" + calculateDiscountedValue());
    }

    public static void main(String[] args) {
        Order order = new Order(100.0, CustomerType.VIP);
        order.showSummary();
    }
}

enum CustomerType {

    REGULAR(0.05),
    VIP(0.10),
    EMPLOYEE(0.20);

    private final double discount;

    CustomerType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}