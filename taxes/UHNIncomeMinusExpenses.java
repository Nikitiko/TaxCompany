package taxes;

public class UHNIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int tax = (int) ((debit - credit) * 0.15); // 15% от разницы между доходами и расходами
        return Math.max(tax, 0); // Налог не может быть отрицательным
    }
}