package design_patterns.observer;

public class InvoiceService implements OrderPlacedObserver {
    private void generateInvoice() {
        System.out.println("Generate Invoice");
    }

    @Override
    public void orderPlaced() {
        generateInvoice();
    }
}
