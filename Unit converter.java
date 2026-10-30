public class UnitConverter {

    // Constant representing the price of one unit
    public static final double UNIT_PRICE = 49.99;

    // Constant representing the VAT rate (7.5%)
    public static final double VAT_RATE = 0.075;


    // Method that calculates the total price including VAT
    public static double totalWithVat(int qty) {

        // Prevent negative quantities
        if (qty < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        // Calculate the total before VAT
        double subtotal = qty * UNIT_PRICE;

        // Calculate the VAT amount
        double vat = subtotal * VAT_RATE;

        // Add VAT to the subtotal
        double total = subtotal + vat;

        return total;
    }


    public static void main(String[] args) {

        // Quantity of items purchased
        int quantity = 3;

        // Calculate the final amount
        double total = totalWithVat(quantity);

        // Display the result to two decimal places
        System.out.printf("Total price including VAT: %.2f%n", total);
    }
}
