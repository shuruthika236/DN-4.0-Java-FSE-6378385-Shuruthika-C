import java.util.*;

public class FinancialForecaster {
    private List<FinancialRecord> records;

    public FinancialForecaster() {
        records = new ArrayList<>();
        // Sample data (You can expand or modify)
        records.add(new FinancialRecord("January", 120000, 85000));
        records.add(new FinancialRecord("February", 110000, 78000));
        records.add(new FinancialRecord("March", 130000, 92000));
        records.add(new FinancialRecord("April", 125000, 88000));
        records.add(new FinancialRecord("May", 140000, 95000));
        records.add(new FinancialRecord("June", 150000, 102000));
    }

    public List<FinancialRecord> getRecords() {
        return records;
    }

    public double getTotalRevenue() {
        return records.stream().mapToDouble(FinancialRecord::getRevenue).sum();
    }

    public double getTotalExpenses() {
        return records.stream().mapToDouble(FinancialRecord::getExpenses).sum();
    }

    public double getTotalProfit() {
        return records.stream().mapToDouble(FinancialRecord::getProfit).sum();
    }

    public double getAverageProfit() {
        return getTotalProfit() / records.size();
    }
}
