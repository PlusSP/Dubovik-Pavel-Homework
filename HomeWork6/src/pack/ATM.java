package pack;
public class ATM {
    public static void main(String[] args) {
        MoneyIn newAtm = new MoneyIn();
        newAtm.moneyOut();
        newAtm.moneyCount();
        newAtm.moneyIn();
        newAtm.moneyCount();
        System.out.println(newAtm.inSucsess);
    }
}
