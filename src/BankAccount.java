public class BankAccount {
    private double amount; // остаток на счете

    public double getAmount() { // возвращает текущий остаток на счете
        return amount;
    }

    public double deposit(double sum) { // положить деньги на счет
        return this.amount += sum;
    }

    public int withDraw(int sum) throws LimitException { // снимает указанную сумму со счета
        if (amount < sum) {
            throw new LimitException("Error. Withdrawing money is not possible. you have entered an amount greater than " +
                    "the account: " + amount, amount);
        }
        return (int) (this.amount -= sum);
    }
}
