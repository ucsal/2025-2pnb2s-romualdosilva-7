package br.com.mariojp.solid.srp;

public class TaxCalculator {

    private final double taxRate;

    public TaxCalculator() {

        String rate = System.getProperty("tax.rate", "0.08");
        this.taxRate = Double.parseDouble(rate);
    }

    public double calculate(double subtotal) {
        return subtotal * taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
