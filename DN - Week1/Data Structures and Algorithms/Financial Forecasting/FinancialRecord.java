public class FinancialRecord {
    private String month;
    private double revenue;
    private double expenses;

    public FinancialRecord(String month, double revenue, double expenses) {
        this.month = month;
        this.revenue = revenue;
        this.expenses = expenses;
    }

    public String getMonth() {
        return month;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public double getProfit() {
        return revenue - expenses;
    }

    @Override
    public String toString() {
        return month + " | Revenue: Rs." + revenue + " | Expenses: Rs." + expenses + " | Profit: Rs." + getProfit();
    }
}
