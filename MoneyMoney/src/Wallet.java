public class Wallet {


     int currentMoney;



public void buildWallet(int money) {
    this.currentMoney = money;
}
    public int getCurrentMoney() {
        return currentMoney;
    }


    public void setCurrentMoney(int insertMoney) {
        this.currentMoney = insertMoney;
    }

    public void setMoneyInWallet(int putMoney) {
        this.currentMoney += putMoney;
    }

}
