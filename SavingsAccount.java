package BankAccount;

public class SavingsAccount extends BaseFunctionalities implements SavingsAccountInterface{

    private String createFixedDeposit;


    public String getcreateFixedDeposit(){
        return createFixedDeposit;
    }
    public void setcreateFixedDeposit(String name){
        this.createFixedDeposit= name;
    }
}
