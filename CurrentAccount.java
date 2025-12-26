package BankAccount;

public class CurrentAccount extends BaseFunctionalities implements CurrentAccountInterface{

    private String enableOverdraft;


    public String getenableOverdraft(){
        return enableOverdraft;
    }
    public void setenableOverdraft(String name){
        this.enableOverdraft= name;
    }

}
