public class WithdrawBalance {

    // Instance variable
    int accBalance=10000;
    String bankName;

    // Static variable
    static int withdrawAmount = 2000;

    void withdraw(){
    	accBalance=accBalance-withdrawAmount;
    System.out.println(accBalance);
    }

    public static void main(String[] args){

        WithdrawBalance bank1 = new WithdrawBalance();
        
        bank1.bankName = "HDFC_Bank";
        bank1.withdraw();

        WithdrawBalance bank2 = new WithdrawBalance();
       
        bank2.bankName = "SBI_Bank";
        bank2.withdraw();

        WithdrawBalance bank3 = new WithdrawBalance();
      
        bank3.bankName = "City_Bank";
        bank3.withdraw();

    }
}