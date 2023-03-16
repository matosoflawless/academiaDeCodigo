public class Person {

    // precisamos do nome e do moneyInWallet para poder receber e enviar dinheiro para a carteira
    String name;
    int moneyInHand;
    int bankBalance;
    Wallet carteira;
    Bank ATM;


    //construtor
    public Person(String name, int bankBalance, int moneyInHand) {
        this.name = name;
        this.bankBalance = bankBalance;
        this.moneyInHand = moneyInHand;
    }
    public String getName() {
        return name;
    }


    public void sendMoneyToWallet(int putMoney) {
        this.moneyInHand = moneyInHand + putMoney;
        carteira.receiveMoney();

    }


    public static int comprar() {
        // este metodo vai realizar compras ou seja vamos SUBTRAIR à variavel moneyInWallet algum valor
        return 0;
    }
}

//este metodo vai servir para ir ao banco e recarregar dinheiro, levantar dinheiro


