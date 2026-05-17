public class BillCalculation {

    public double calculateBill(int units) {

        double amount;

        if (units <= 100) {
            amount = units * 1.5;
        } 
        else if (units <= 300) {
            amount = units * 3;
        } 
        else {
            amount = units * 5;
        }

        return amount;
    }
}
