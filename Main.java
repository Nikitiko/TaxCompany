import taxes.Company;
import taxes.UHNIncome;
import taxes.UHNIncomeMinusExpenses;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company("Компания 1", new UHNIncome());
        company1.shiftMoney(1000);
        company1.payTaxes();

        Company company2 = new Company("Компания 2", new UHNIncomeMinusExpenses());
        company2.shiftMoney(1000);
        company2.shiftMoney(-500);
        company2.payTaxes();

        Company company3 = new Company("Компания 3", new UHNIncomeMinusExpenses());
        company3.shiftMoney(500);
        company3.shiftMoney(-1000);
        company3.payTaxes();
    }
}