import java.util.*;

public class ForecastAnalysis {
    public static void main(String[] args) {
        FinancialForecaster forecaster = new FinancialForecaster();
        List<FinancialRecord> records = forecaster.getRecords();

        System.out.println("Monthly Financial Forecast:");
        for (FinancialRecord record : records) {
            System.out.println("- " + record);
        }

        System.out.println("\nSummary:");
        System.out.println("Total Revenue: Rs." + forecaster.getTotalRevenue());
        System.out.println("Total Expenses: Rs." + forecaster.getTotalExpenses());
        System.out.println("Total Profit: Rs." + forecaster.getTotalProfit());
        System.out.println("Average Monthly Profit: Rs." + forecaster.getAverageProfit());
    }
}
