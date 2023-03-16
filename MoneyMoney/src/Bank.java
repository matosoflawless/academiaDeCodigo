public class Bank {

    //nesta class vamos poder adicionar ou tirar dinheiro usando a WALLET.
    //precismos do actualMoney, para gerir a entrada e saida de dinheiro do banco, so a wallet e que pode meter ou tirar

private int actualMoney = 1000;


//Construtor
public Bank(int creditCard) {
    this.actualMoney = actualMoney;
}
public  int withrall(int moneyGet) {

    return (actualMoney = actualMoney - moneyGet);
}
    public  int deposit(int moneyPut){

        return (actualMoney = actualMoney + moneyPut);
    }




    public int getActualMoneyMoney() {
        return actualMoney;
    }

    public void setActualMoney(int depositMoney) {
        this.actualMoney = depositMoney;
    }
}
