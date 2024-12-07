public class SBI extends RBI{

    private int bankTotalBalance = 0;

    public int getBankTotalBalance(){
        return this.bankTotalBalance;
    }

    public void setBankTotalBalance(int amount){
        this.bankTotalBalance += amount;
    }

    public void closeAccount(){
        System.out.println("Closing in different way");
    }
}
