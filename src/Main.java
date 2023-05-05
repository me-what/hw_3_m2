public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {
            try {
                System.out.println("Сняли 6000, осталось: " + bankAccount.withDraw(6000));
            } catch (LimitException l) {
                try {
                    System.out.println("Сняли " + (int) bankAccount.getAmount() + ", осталось: " + bankAccount.withDraw((int) bankAccount.getAmount()));
                } catch (LimitException le) {
                    throw new RuntimeException(le);
                }
                break;
            }
        }
    }
}