public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(23489234, 2304982, "Chan", "Chan@jan.com", 98345939);

//        bankAccount.setAccBalance(1000);
//        bankAccount.setAccNumber(325678536);
//        bankAccount.setCustomerName("Luffy");
//        bankAccount.setEmail("monkeydluffy@gmail.com");
//        bankAccount.setPhoneNumber(940398234);

        System.out.println(bankAccount.getPhoneNumber());

        long remainingBalance = bankAccount.depositFunds(1000);
        System.out.println("Remaining Balance is : " +remainingBalance);

        remainingBalance = bankAccount.withdrawFunds(300);
        System.out.println("Remaining balance is : " +remainingBalance);

        remainingBalance = bankAccount.withdrawFunds(800);
        System.out.println("Remaining balance is : " +remainingBalance);

    }
}
