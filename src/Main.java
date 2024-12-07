import java.util.ArrayList;

public class Main {
    public static void repairCamera(Camera c){
        c.saveToMemory();
        System.out.println("Repairing camera");
    }

    public void sayHello(){

    }

    public void sayHello(String name)
    {

    }







    public void sayHello(String x, int y){

    }
    public static void main(String[] args) {
//        RBI sbi = new SBI();
//        sbi.closeAccount();
//        RBI sbi = new SBI();
//        Car c1 = new Car();
        //sbi.createAccount();
       // System.out.println(sbi.bankTotalBalance);

        SBI b1 = new SBI();
        b1.setBankTotalBalance(1000);

        System.out.println(b1.getBankTotalBalance());
    }
}