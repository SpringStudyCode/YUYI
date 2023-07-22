public class ClassExample {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
//        System.out.println(account);
//        System.out.println(account.bankCode);
//        System.out.println(account.isDormant);
//        bankAccount.password = 123456;
//        System.out.println(bankAccount.password);

        bankAccount.changePassword(123456);
        System.out.println(bankAccount.getPassword());
    }
}
